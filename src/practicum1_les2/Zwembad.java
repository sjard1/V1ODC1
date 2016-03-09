package practicum1_les2;

public class Zwembad {
	private double breedte;
	private double lengte;
	private double diepte;
	private double inhoud;
	
	public Zwembad(double br, double lg, double dp){
		breedte = br;
		lengte = lg;
		diepte = dp;
	}
	public Zwembad(){}
	
	public double getBreedte(){return breedte;}
	public double getLengte() {return lengte;}
	public double getDiepte() {return diepte;}
	
	
	public double inhoud(){
		inhoud = (lengte * breedte * diepte);
		return inhoud;
		}
	
	public void setBreedte(double br){
		breedte = br;
		}
	public void setLengte(double lg){
		lengte = lg;
	}
	public void setDiepte (double dp){
		diepte = dp;
	}
	
	public String toString(){
		String s = "Dit zwembad is " + breedte + "  meter breed, " + lengte + " meter lang, en " + diepte + " meter diep";
				 return s;
	}

}
