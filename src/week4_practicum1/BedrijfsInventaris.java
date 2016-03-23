package week4_practicum1;

import java.util.ArrayList;

public class BedrijfsInventaris {
	private String bedrijfsnaam;
	private double budget;
	private ArrayList<Goed> alleGoederen = new ArrayList<>();
	
	public BedrijfsInventaris(String nm, double bud){
		bedrijfsnaam = nm;
		budget = bud;
//		 new ArrayList<Goed>();
	}
	public void schafAan(Goed g){
		if((budget >= g.huidigeWaarde())&&
			(!alleGoederen.contains(g))){
			budget -= g.huidigeWaarde();
			alleGoederen.add(g);}
				
		}
	// string s geeft altijd de bedrijfsnaam, daarna de test "met inventaris" een enter en dan alleen de lijst met 
	// for each en s += toevoegen van g die telt voor elk object dat alleGoederen bevat
	public String toString(){
		String s = bedrijfsnaam + " met inventaris: \n";
		for(Goed g : alleGoederen){
			s += g.toString();
				}
		return s;
		
	}
		
	
		
	}

