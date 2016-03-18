package week3.opdracht6_2;

public class main {

	public static void main(String[] args){
		
		Vriend k1 = new Vriend("Jan", "Nijenoord 1", "hallo");
		Vriend k2 = new Vriend("Jan", "Nijenoord 1", "hallo");
		
		System.out.println(k1);
		
		System.out.println(k1.equals(k2));
	}
	

}
