package week3_opdracht6_2_1;

public class Vriend {

	private String voornaam;
	private String achternaam;
	private String email;
	
	public Vriend(String vn, String anm, String em){
		voornaam = vn;
		achternaam = anm;
		email = em;
	}
	
	public boolean equals(Object andereObject){ 
		boolean gelijkeObjecten = false;
		
		if (andereObject instanceof Vriend){
			Vriend andereVriend = (Vriend) andereObject;
			
		if (this.voornaam.equals(andereVriend.voornaam) &&
			this.achternaam.equals(andereVriend.achternaam) &&
			this.email.equals(andereVriend.email)){
			
			gelijkeObjecten = true;
		}
		}
		return gelijkeObjecten;
		
	}
	
	public String toString(){
		return voornaam + achternaam + email;
	}
	
	
}
