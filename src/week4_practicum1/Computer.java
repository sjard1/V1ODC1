package week4_practicum1;
import java.time.LocalDate;

public class Computer implements Goed {
	private String type;
	private String MacAdres;
	private double aanschafPrijs;
	private int productieJaar;
	
	public Computer(String tp, String adr, double pr, int jr){
		type = tp;
		MacAdres = adr;
		aanschafPrijs = pr;
		productieJaar = jr;
	}
	
	public double huidigeWaarde(){ 
		double waarde;
		waarde = Math.pow(0.6,( LocalDate.now().getYear() - productieJaar)) * aanschafPrijs;
		return waarde;
	}
	
	
	public boolean equals(Object object){
		 boolean gelijkObj = false;
		
	if( object instanceof Computer){
		Computer andereComputer = (Computer) object;
		
		if(this.type.equals(andereComputer.type)&&
			this.MacAdres.equals(andereComputer.MacAdres) &&
			this.aanschafPrijs == andereComputer.aanschafPrijs &&
			this.productieJaar == andereComputer.productieJaar){
			gelijkObj = true;
	}
	}
	return gelijkObj;
	}
	
public String toString(){
	String s = " computer: " + type + "heeft een waarde van: $ " + huidigeWaarde() + "\n";
	return s;
}
}
