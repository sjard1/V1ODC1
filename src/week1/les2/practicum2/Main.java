package week1.les2.practicum2;

public class Main {
	public static void main(String[] args) { 
		Voetbalclub ajx = new Voetbalclub("Ajax \t");
		System.out.println(ajx);
		Voetbalclub feij = new Voetbalclub("Feijenoord"); 
		feij.verwerkResultaat('w');
		feij.verwerkResultaat('w');
		feij.verwerkResultaat('w');
		feij.verwerkResultaat('g'); 
		System.out.println(feij); 
	}
}
