package week2.opdracht3_2;

public class Main {
	public static void main(String[] args){
		Eigenaar e1 = new Eigenaar("Willem de Moller");
		System.out.println(e1);
		Huisdier hd1 = new Huisdier("nero" , "Dobermann");
		e1.setBeestje(hd1);
		System.out.println( e1 );
		System.out.println();
		
		Eigenaar e2 = new Eigenaar("pluk");
		System.out.println(e2);
		Huisdier hd2 = new Huisdier("zaza" , "kakkerlak");
		e2.setBeestje(hd2);
		System.out.println(e2);
		
		System.out.println();
		System.out.println(hd1);
		System.out.println(hd2);
	}
}
