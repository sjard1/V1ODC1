package week4_practicum1;
import java.time.LocalDate;

public class Auto extends Voertuig {
	private String kenteken;
	
	public Auto(String tp, double pr, int jr, String kt) {
		super(tp,pr,jr);
		kenteken = kt;
	}
	public double huidigeWaarde(){
		double waarde;
		waarde = Math.pow(0.7, LocalDate.now().getYear() - bouwjaar) * nieuwPrijs;
		return waarde;
	}
	
	public boolean equals(Object obj){
		boolean gelijkObject = false;
		
		if(obj instanceof Auto){
			Auto andereAuto = (Auto) obj;
			
			if(this.kenteken.equals(andereAuto.kenteken)){
				gelijkObject = true;
			}
		}
		return gelijkObject;
	}

}
