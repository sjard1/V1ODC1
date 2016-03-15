 package week3_practicum6_2;

import java.util.ArrayList;

public class Persoon {
	private String naam;
	private double budget;
	private ArrayList<Game> games;
	
	public Persoon(String nm, double bud) 
	{
		naam = nm;
		budget = bud;
		games = new ArrayList<Game>();
	}
	
	public boolean koop(Game g)
	{
		for(Game game : games)
		{
			if(game.equals(g))
			{
				return false;
			}
		}
		if((budget - g.huidigeWaarde()) < 0)
		{
			return false;
		}
		
		budget -= g.huidigeWaarde();
		games.add(g);
		return true;
	}
	
	public boolean verkoop(Game g, Persoon koper)
	{
		for(Game e : getGames())
		{
			if(g.equals(e))
			{
				if(koper.koop(e))
				{
					getGames().remove(g);
					setBudget(getBudget() + g.huidigeWaarde());
					return true;
				} else {
					return false;
				}
			}
		}
		return false;
	}
	
	public ArrayList<Game> getGames()
	{
		return games;
	}
	
	public double getBudget()
	{
		return budget;
	}
	
	public void setBudget(double bg)
	{
		budget = bg;
	}
	
	public Game zoekGameOpNaam(String nm)
	{
		for(Game g: getGames())
		{
			if(g.getNaam() == nm)
			{
				return g;
			}
		}
		return null;
	}
	
	public String toString()
	{ 
		budget = Math.round(budget * 100.0) / 100.0;
		String str = naam + " heeft een budget van €" + budget + " en bezit de volgende games: \n" ;
		for (Game game : getGames()){
			str += game.toString();
		}
		return str;
	}
	
}
