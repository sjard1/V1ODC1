package week2.opdracht3_2;

public class Huisdier {
	private String naam;
	private String ras;
	private double gewicht = 0.0;
	
	public Huisdier (String nm, String rs) {
		naam = nm;
		ras = rs;
	}
	
	public String getNaam(){
		return naam;
	}
	public String getRas(){
		return ras;
	}

	public void setNaam(String nm){
		naam = nm;
	}
	
	public void setRas(String rs){
		ras = rs;
	}
	public String toString(){
		String s = naam + ", de " + ras + ", weegt " + gewicht + "kg.";
		return s;
	}
	
}
