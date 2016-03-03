package tentamen_opgave1;

public class Opleiding {

	private String naam;
	private String variant;
	private int studieduur;
	private int minimumECs;
	
	public Opleiding(String nm, int std, int mEs){
		this(nm,"voltijd",std, mEs);

	}	
	public Opleiding(String nm, String v, int std, int mEs){
		variant = v;
		naam = nm;
		studieduur = std;
		minimumECs = mEs;
	}
	
	public String getNaam(){return naam;}
	
	public void setStudieDuur(int std){
		studieduur = std;
	}
	public void wijzigVariant(String v){
		if (v.equals("Voltijd") || v.equals("Deeltijd"))
		variant = v;
		//comment
	}
	
	public String toString(){
		String s = naam + " in " + variant + " . De studie duurt " + studieduur +  "(minimaal " + minimumECs + " ECs)";
		return s;
	}
}
