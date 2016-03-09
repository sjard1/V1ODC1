package week2_practicum2;

public class Klant {

	private String naam;
	private double korting;
	private double kortingsPercentage;
	
	public Klant(String nm){
		naam = nm;
	}
	public void setKorting(double kP){
		kortingsPercentage = kP;
	}
	public double getKorting(){
		
		return korting;
	

	}
	//else { System.out.println(naam);}
	
	public String toString(){
		String s = "op naam van " + naam + "( korting: " + kortingsPercentage + ")";
		return s;
	//}
	}
}
