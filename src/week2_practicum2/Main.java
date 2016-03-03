package week2_practicum2;

public class Main {
	public static void main(String[] argm){
		AutoHuur ah1 = new AutoHuur();
		System.out.println("Eerste autohuur: \n "+ ah1 + "\n");
		
		
		Klant k1 = new Klant("Mijnheer de Vries");
		//System.out.println(k1);
		k1.setKorting(10.0);
		ah1.setHuurder(k1);
		Auto a1 = new Auto ("peugeot 207", 50);
		ah1.setGehuurdeAuto(a1);
		ah1.setAantalDagen(4);
		System.out.println("eerste autohuur:\n"+ ah1 + "\n");
		
		AutoHuur ah2 = new AutoHuur();
		Auto a2 = new Auto ("ferrari", 3500);
		ah2.setGehuurdeAuto(a2);
		ah2.setHuurder(k1);
		ah2.setAantalDagen(1);
		System.out.println("Tweede autohuur:\n" + ah2+ "\n");
		
		System.out.println("Gehuurd: " + ah1.getGehuurdeAuto());
		System.out.println("Gehuurd: " + ah2.getGehuurdeAuto());
	}
}
