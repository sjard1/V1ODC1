package week2_practicum2;

public class AutoHuur {

	private int aantalDagen;
	private Klant huurder ;
	private Auto gehuurdeAuto;
	private double totaalPrijs;
	public AutoHuur(){}
	
	// string kan niet rekenen en int kan geen ""
	public void setAantalDagen(int i){
		aantalDagen = i;
	}
	public void setGehuurdeAuto(Auto gA){
		gehuurdeAuto = gA;
	}
	public void setHuurder(Klant k){
		huurder = k;
	}
	
//	public double getKorting(){
//		korting = prijsperdag - (prijsPerDag / korting);
//		return korting
	//}
	public double totaalPrijs(){
		totaalPrijs = (aantalDagen * gehuurdeAuto.getPrijsPerDag() - (huurder.getKorting()));
		return totaalPrijs;
		
	}
	
	public Auto getGehuurdeAuto(){ return gehuurdeAuto;}
	public Klant getHuurder() { return huurder ;}
	public int getAantalDagen(){ return aantalDagen;}
	
	
	public String toString(){
		String s = "";
		if (gehuurdeAuto == null){
			s+= "er is geen auto bekend \n";
		}
		else { 
			s+= "auto type is: " + gehuurdeAuto.toString() + " met prijs per dag: " + gehuurdeAuto.getPrijsPerDag() + "\n";
		}
		System.out.println();
		if (huurder == null){
			s+= " er is geen huurder bekend \n                                                                                                      ";
		}else{
			s+= huurder.toString() + "\n";
		}
		if(aantalDagen == 0){
			s+= "aantal dagen: 0 en dat kost 0.0 \n";
		}else{
			s+= "aantal dagen: " + aantalDagen + " en dat kost: " + totaalPrijs;
		}
		
		
		return s;
	}
}


