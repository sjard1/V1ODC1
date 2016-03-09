package week2.opdracht3_1;

public class Huisdier {
	private String naam;
	private String ras;
	private double gewicht = 0.0;
	private Eigenaar baasje;
	
	public Huisdier (String nm, String r) {
		naam = nm;
		ras = r;
	}

	public String getNaam() { return naam;}
	public String getRas() { return ras; }
	
	

	public void setBaasje( Eigenaar e){
	baasje = e;		
	}

	public String toString() {
		return naam + ", de " + ras + ",weegt "+ gewicht + "kilo."
	+ "\n" + "en de eigenaar is: " + baasje;
	
	}
	
}

