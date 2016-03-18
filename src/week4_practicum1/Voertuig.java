package week4_practicum1;

public abstract class Voertuig implements Goed {
	private String type;
	protected double nieuwPrijs;
	protected int bouwjaar;
	
	public Voertuig(String tp, double pr, int jr){
		type = tp;
		nieuwPrijs = pr;
		bouwjaar = jr;
	}
	
	public boolean equals(Object obj){
		boolean gelijkObject = false;
		
	if(obj instanceof Voertuig){
		Voertuig anderVoertuig = (Voertuig) obj;
		
		if(this.type.equals(anderVoertuig.type) &&
			this.nieuwPrijs == anderVoertuig.nieuwPrijs &&
			this.bouwjaar == anderVoertuig.bouwjaar){
			gelijkObject = true;
		}
	}
		return gelijkObject; 
	}
	
	public String toString(){
		String s = "Voertuig: " + type + " met bouwjaar " + bouwjaar + " heeft een waarde van: ";
		return s;
		
	}
}