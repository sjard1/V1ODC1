package week1.opdracht1_2;

public class Klant {
	private String naam;
	private String adres;
	private String plaats;
	
	public Klant( String nm, String adr, String pl)
	{
		naam = nm;
		adres = adr;
		plaats = pl;
		
		System.out.println(naam);      
		System.out.println(adres);     
		System.out.println(plaats);
	}
}
