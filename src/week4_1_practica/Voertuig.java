package week4_1_practica;

public abstract class Voertuig implements Goed {
	private String type;
	protected double nieuwprijs;
	protected int bouwjaar;
	
	public Voertuig(String tp, double pr, int jr){
		type= tp;
		nieuwprijs = pr;
		bouwjaar = jr;
	}
	
	public boolean equals(Object obj){
		boolean gelijkeObject = false;
		
		if(obj instanceof Voertuig){
			Voertuig andervoertuig = (Voertuig) obj;
			
		if(this.type.equals(andervoertuig.type) &&
			this.nieuwprijs == andervoertuig.nieuwprijs &&
			this.bouwjaar == andervoertuig.bouwjaar){
			gelijkeObject = true;
		}
		}
		return gelijkeObject;
	}

	public String toString(){
		String s = "Voertuig: " + type + " met bouwjaar " + bouwjaar + " heeft een waarde van $" + huidigeWaarde();
		return s;
	}
}
	

