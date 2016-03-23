package week5_les10_1;

import java.io.*;

public class Dubbelegetallen {
	public static void main(String[] arg) throws IOException {
		FileReader fr = new FileReader("invoer.txt");
		BufferedReader br = new BufferedReader(fr);
		
		//gemiddelde
		double totaal = 0;
		int aantal = 0;
		
		String regel = br.readLine();
		while (regel != null) {
			
		System.out.println(regel);
		totaal += Double.parseDouble(regel);
		aantal++;
		regel = br.readLine();
		}
		br.close();
		
		System.out.println("de text file                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    invoer.txt bevat "+ aantal);
		System.out.println("gemiddelde is: " + totaal/aantal);
	}
}
