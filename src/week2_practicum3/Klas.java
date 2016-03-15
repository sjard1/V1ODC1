<<<<<<< HEAD
package week2_practicum3;

public class Klas {

	private String klasCode;
	private Leerling naam;
	private Leerling cijfer;
	public Klas(String kC){
		klasCode = kC;
	}
	
	public void voegLeerlingToe(Leerling l){
	Leerling = l;}
	public void wijzigCijfer(String nm, double nwecijfer){
		naam = nm;
		cijfer = nwecijfer;
	}
	
	public list<Leerling> getLeerlingen(){return Leerling;}
	public int aantalLeerlingen(){return leerlingen}
	
	public String toString(){
		String s = klasCode + naam;
		return s;
	}
}
=======
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
>>>>>>> origin/master
