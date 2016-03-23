package tentamen_opgave1;

public class Student {

	private String naam;
	private int leeftijd;
	private Opleiding mijnOpleiding;
	
	public Student(String nm, int lft){
		naam = nm;
		leeftijd = lft;
	}
	public Opleiding getOpleiding(){return mijnOpleiding;}
	
	public void setOpleiding(Opleiding opl){
		mijnOpleiding = opl;
	}
	
	public String toString(){
		
//		s+=
		String s = "Student " + naam + "( " + leeftijd + " jaar)";
		if (mijnOpleiding  == null){
			s+=(" volgt nog geen opleiding");
			//System.out.println(s);
//		}else if (mijnOpleiding.equals("deeltijd")){
//			s+=(" volgt een deeltijd");
//		}else if (mijnOpleiding.equals("duaal")){
//			s += ("volt een duaal");
		}else{
			s+= (" volgt de opleidng " + mijnOpleiding);
		}
		return s;
	}
}

//public String toString1(){
//	String opleiding = mijnOpleiding == null ? "nog geen opleiding " : "de opleiding";
//	return opleiding;

