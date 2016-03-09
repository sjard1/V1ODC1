package week1_opracht_bank;

public class Rekening {
 private int nummer;
 private double saldo;
 private Klant rekeninghouder;
 
 public Rekening(int nm){
	nummer = nm;
 }
 
 public void setRekeninghouder(Klant kl){
	 rekeninghouder = kl;
 }
 
 public Klant getRekeninghouder(){
	 return rekeninghouder;
}
 
 public int getNummer(){
	 return nummer;
 }
 public double getSaldo(){
	 return saldo;
 }
 
 public void Stort(double bedrag){
	 if ( bedrag > 0){
		 saldo = saldo + bedrag;
	 }else{
		 
	 }
	 
 }
 public void neemOp (double nwsal){
	 saldo = saldo - nwsal;
 }
 public String toString(){
 String s = "dit is text: " + nummer + " en heeft saldo: " + saldo;
 return s;
}
}
