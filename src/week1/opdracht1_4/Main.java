package week1.opdracht1_4;

public class Main {
	public static void main(String[] arg) {
		Student st1 = new Student("Sylvester");
		System.out.println( "getter: " +st1.getNaam() );
		System.out.println("ToString: " + st1.toString() );
		
		Student st2 = new Student("Karel");
		System.out.println( "getter: " + st2.getNaam() );
		System.out.println("ToString: " + st2.toString() );
		
		
	}

}
