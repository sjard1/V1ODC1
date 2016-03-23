package week2_opdracht4_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Scansysteem {
	
	
	public static void main(String[] args) {
		Scanner hallo = new Scanner(System.in);
		System.out.print("Voer getal in:  ");
		
		ArrayList<Double> ingevoerdeGetallen = new ArrayList<Double>();

		
		boolean magInvoeren = true ;
		
		while (magInvoeren){
			String invoer = hallo.nextLine();
			double ingevoerdGetal = Double.parseDouble(invoer);
			
			if (ingevoerdGetal == 0) {
				magInvoeren = false;
				System.out.print(ingevoerdeGetallen);
				System.out.println();
			} 
			else if (ingevoerdGetal > 0)  {
				ingevoerdeGetallen.add(ingevoerdGetal);
				System.out.println("EN NOG EEN! : ");
			}
		}
		
		double som = 0;
		for(Double getal : ingevoerdeGetallen) {
			som += getal;}
		
		System.out.println("Som van de lijst: " + som);
	
		int aantal = ingevoerdeGetallen.size();
		//for(Double getal : ingevoerdeGetallen){
		//}	
		double gemiddelde = som / aantal;
		System.out.println("De gemiddelde van de array is: " + gemiddelde);
		
		hallo.close();
	}
}
	


