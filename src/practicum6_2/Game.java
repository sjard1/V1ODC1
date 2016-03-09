package practicum6_2;

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
		int diff = jaar - releaseJaar;
		double prijs = getPrijs();
		for(int i = 0; i < diff; i++)
		{
			prijs = prijs * 0.7;
		}
		return Math.round(prijs * 100.0) / 100.0;
	}
	
	public double getPrijs()
	{	
		return nieuwPrijs;
	}

	public int getReleaseJaar()
	{
		return releaseJaar;
	}
	
	public String getNaam() 
	{
		return naam;
	}

	public boolean equals(Game g)
	{
		if(g.getNaam() == getNaam())
		{
			return true;
		}
		return false;
	}
	
	public String toString()
	{
		return getNaam() + ", uitgegeven in " + getReleaseJaar() + "; nieuwprijs: €" + getPrijs() + " nu voor €" + huidigeWaarde() + "\n";
	}
}
