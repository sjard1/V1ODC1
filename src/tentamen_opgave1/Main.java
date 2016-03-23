package tentamen_opgave1;

public class Main {
	public static void main(String[] args){
		Student st1 = new Student("Kevin de wit", 20);
		Opleiding op1 = new Opleiding("HBO-ICT", 4, 240);
		
		System.out.println(op1);
		System.out.println(st1);
		st1.setOpleiding(op1);
		System.out.println(st1);
		
		op1.wijzigVariant("Deeltijd");
		op1.wijzigVariant("duaal");
		op1.setStudieDuur(5);
		System.out.println(st1);		
	}
}