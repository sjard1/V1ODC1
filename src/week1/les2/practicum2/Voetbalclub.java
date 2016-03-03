package week1.les2.practicum2;

public class Voetbalclub {
	private String naam;
	private Integer aantalGewonnen = 0;
	private Integer aantalGelijk = 0;
	private Integer aantalVerloren = 0;
// private Integer aantalGespeeld = 0;
//	private Integer aantalPunten = 0;

	public Voetbalclub(String nm){ 
		naam = nm;
	}
	
	public String getNaam (){
		return naam;
	}
		
	public int getAantalGewonnen(){
		return aantalGewonnen;
	}
	
	public int getAantalGelijk(){
		return aantalGelijk;
	}
	
	public int getAantalVerloren(){
		return aantalVerloren;
	}
	
	public int getAantalGespeeld(){
		return (getAantalGewonnen()) + (getAantalGelijk()) + (getAantalVerloren());
	
	}
		
	public int getAantalPunten(){
		int aantalPunten = (aantalGewonnen * 3) + aantalGelijk;
	    return aantalPunten;
	}

	public void verwerkResultaat(char ch){
		if (ch == 'w')
		{
			aantalGewonnen++; 
		}
		else if (ch == 'g')
		{
			aantalGelijk++;
		}
		else if (ch == 'v')
		{
			aantalVerloren++;
		}
	}
	
	public String toString(){
		String s = getNaam() + "\t" + getAantalGespeeld() + "\t" + getAantalGewonnen() + "\t" + getAantalGelijk() + "\t" + getAantalVerloren() + "\t\t" + getAantalPunten() ; 
		return s; 
	}
}
