package week1.opdracht1_5;

public class Student {

	private String naam;
	private int sid;
	
	public Student(String nm, int id){
		naam = nm;
		sid = id;
	}
	
	public String getNaam() {
		return naam;
	}
	public int getSid(){
		return sid;
	}
	
	public void setNaam(String nwNaam){
		naam = nwNaam;
	}
	public void setSid(int nwId){
		sid = nwId;
	}
	}
