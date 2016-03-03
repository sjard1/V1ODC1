package week1.opdracht1_4;

public class Student {
	private String naam;
	
	public Student(String nm)
	{
		naam = nm;
	}
	public String getNaam() {
		return naam;
	}
	public String toString() {
	String s = naam + " succesvol.";
	return s;
	}
}
