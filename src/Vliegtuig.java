
public class Vliegtuig {
	private String type;
	private int aantalMotoren;
	private String registratieNummer;
	
	public boolean equals(Object obj){
		boolean gelijkObject = false;
		
	if(obj instanceof Vliegtuig){
		Vliegtuig anderVliegtuig = (Vliegtuig) obj;
		
	if(this.type.equals(anderVliegtuig.type)&&
		this.aantalMotoren == anderVliegtuig.aantalMotoren &&
		this.registratieNummer.equals(anderVliegtuig.registratieNummer))
	{
		gelijkObject = true;
	}
	}
	return gelijkObject;
	}

	public String getType() {
		
		return type;
	}
}
