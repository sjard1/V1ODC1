package week5_practicum3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PriceConverter {
	private String bronbestand;
	private String bestemmingsbestand;
	private double dollarWaarde;
	private String path = "B:\\V1ODC1\\src\\week5_practicum3\\";
	
	public PriceConverter(){
		this.getInput();
	}
	
	public void readFile(String filename) throws IOException {
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);
        List<String> dollarList = new ArrayList<String>();
        String line = null;
        while ((line = br.readLine()) != null) {
        	dollarList.add(line);
        }
        br.close();
        this.convertFile(dollarList, this.dollarWaarde);
    }
	
	public void getInput(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{ 
        	System.out.print("Voer het bronbestand in:");
        	this.bronbestand = this.path + br.readLine() + ".txt";
        	System.out.print("Voer het bestemmingbestand in:");
        	this.bestemmingsbestand = this.path + br.readLine() + ".txt";
        	System.out.print("Voer de dollar waarde in in eurocenten:");
            this.dollarWaarde = Double.parseDouble(br.readLine());
            this.readFile(this.bronbestand);
        }catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void convertFile(List<String> dollarList, double dollarWaarde){
		List<String> euroList = new ArrayList<String>();
		String[] tempList;
		
		for(String s : dollarList){
			tempList = s.split(" : ");
			euroList.add(String.format("%s : €%.2f" , tempList[0], this.getPriceConversion(tempList[1])));
			tempList = null;
		}
		this.writeFile(euroList);
	}

	private void writeFile(List<String> euroList) {
		Path file = Paths.get(this.bestemmingsbestand);
		try {
			Files.write(file, euroList, Charset.forName("UTF-8"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private double getPriceConversion(String prijs) {
		return Double.parseDouble(prijs) * this.dollarWaarde;
	}
}
