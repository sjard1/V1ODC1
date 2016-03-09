package week1_opdracht2_1;

public class Piloot {
private double Salaris;
private double Vlieguren;
private String Naam;

public Piloot(String nm){
	Naam = nm;
}

public void setSalaris(double money){Salaris = money;}
public void verhoogVliegurenMet(double extravlieg){Vlieguren = Vlieguren + extravlieg;}
public double getVlieguren(){return Vlieguren;}
public double getSalaris(){ return Salaris;}

public String toString(){
	String s = Naam + " heeft "+ Vlieguren + " vlieguren gemaakt en verdient " + Salaris;
	return s;
}
}
