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
