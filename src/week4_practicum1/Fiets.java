package week4_practicum1;
import java.time.*;

public class Fiets extends Voertuig{
	private int framenummer;
	
	public Fiets(String tp, double pr, int jr, int fnr){
		super(tp,pr,jr);
		framenummer = fnr;
	}

	public double huidigeWaarde(){
		double waarde;
		waarde = Math.pow(0.9, (LocalDate.now().getYear() - bouwjaar)) * nieuwPrijs;
		return waarde;
	}
	
	public boolean equals(Object obj){
		boolean gelijkObject = false;
		
		if(obj instanceof Fiets){
			Fiets andereFiets = (Fiets) obj;
			
		if(this.framenummer == andereFiets.framenummer){
			gelijkObject = true;
		}
		}
		return gelijkObject;
	}
	
}
