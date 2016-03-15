package week2_practicum3;

import java.util.ArrayList;

public class Klas {

	private String klasCode;
	private ArrayList<Leerling> deLeerlingen;
	
	public Klas(String kC){
		klasCode = kC;
		deLeerlingen = new ArrayList<Leerling>();
	}
	
	public void voegLeerlingToe(Leerling l){
	deLeerlingen.add(l);}
	
	public void wijzigCijfer(String nm, double nwecijfer){
		for (Leerling lel : deLeerlingen){
			if (lel.getNaam().equals(nm)){
				lel.setCijfer(nwecijfer);
			}
		}
	}
	
	public ArrayList<Leerling> getLeerlingen(){return deLeerlingen;}
	
	public int aantalLeerlingen(){return deLeerlingen.size();}
	
	public String toString(){
		String s = "In klas" + klasCode + " zitten de volgende leerlingen: \n";
		for (Leerling lel : deLeerlingen){
			s = s + lel.getNaam() + " heeft cijfer: " + lel.getCijfer() + "\n";
		}
		return s;
	}
}
