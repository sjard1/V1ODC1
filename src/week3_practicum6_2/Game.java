package week3_practicum6_2;

import java.time.LocalDate;

public class Game {
	private String naam;
	private int releaseJaar;
	private double nieuwPrijs;
	
	public Game(String nm, int rJ, double nwpr)
	{
		naam = nm;
		releaseJaar = rJ;
		nieuwPrijs = nwpr;
	}
	
	public double huidigeWaarde()
	{
		int jaar = LocalDate.now().getYear();
		int verschilInJaar = jaar - releaseJaar;
		double prijs = getPrijs();
		for(int i = 0; i < verschilInJaar; i++)
		{
			prijs = prijs * 0.7;
		}
		return Math.round(prijs );
	}
	
	public double getPrijs(){return nieuwPrijs;	}

	public int getReleaseJaar()	{return releaseJaar;}
	
	public String getNaam() {return naam;}

	public boolean equals(Object andereObject){
		boolean gelijkeObjecten = false;
		
		if(andereObject instanceof Game){
			Game andereGame = (Game) andereObject;
			if(this.naam.equals(andereGame.naam)&&
					this.releaseJaar == andereGame.releaseJaar &&
					this.nieuwPrijs == andereGame.nieuwPrijs){
				gelijkeObjecten = true;
		}
		}
		return gelijkeObjecten;
	}
	
	public String toString()
	{
		return getNaam() + ", uitgegeven in " + getReleaseJaar() + "; nieuwprijs: €" + getPrijs() + " nu voor €" + huidigeWaarde() + "\n";
	}
}
