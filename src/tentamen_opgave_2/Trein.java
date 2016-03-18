package tentamen_opgave_2;

public class Trein extends Voertuig {
	private boolean inVeiligheidsModus;
	
	public Trein(String tp, int mS){
		super(tp, mS);
	}
	
	public void setVeiligheidsModus(boolean vM){
		inVeiligheidsModus = vM;
	}

	public void snelheidVerhogen(){
//		if(inVeiligheidsModus && huidigeSnelheid < maximumSnelheid){
		if(inVeiligheidsModus && huidigeSnelheid < ((maximumSnelheid / 2) - 20)){
			huidigeSnelheid += 20;
		}
		else if((!inVeiligheidsModus) && huidigeSnelheid <= (maximumSnelheid -20)){
			huidigeSnelheid += 20;
		}
		else{
			System.out.println("hallo");
		}
	}

	public void snelheidVerlagen() {
		huidigeSnelheid -= 20;
		
	}
	
	public String toString(){
		String s =  "Trein (veiligheids modus: " + (inVeiligheidsModus == true ? "aan" : "uit") + " van type " + super.toString()+ "rijdt nu " + huidigeSnelheid + " km/u max "+ maximumSnelheid;
	return s;
	}
	
	

}
