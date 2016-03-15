<<<<<<< HEAD
package week3_opdracht6_2_1;

import java.util.ArrayList;

public class FacebookAccount {
	private String naam;
	private ArrayList<Vriend> mijnVrienden;
	
	public FacebookAccount(String innaam){
		naam = innaam;
		mijnVrienden = new ArrayList<Vriend>();
	}
	
	public String getNaam(){ return naam;} 
	
	public void VoegVriendToe(Vriend nwV){
		mijnVrienden.add(nwV);
	}

	
//	public boolean verwijderVriend(Vriend exV){
//		if 
//	}
	
	
}

	
	
	
	
	
	
	
	
	
	
	
	

=======
package week3_opdracht6_2_1;

import java.util.ArrayList;

public class FacebookAccount {
	private String naam;
	private ArrayList<Vriend> mijnVrienden;
	
	public FacebookAccount(String innaam){
		naam = innaam;
		mijnVrienden = new ArrayList<Vriend>();
	}
	
	public String getNaam(){ return naam;} 
	
	public void VoegVriendToe(Vriend nwV){
		mijnVrienden.add(nwV);
	}

	public int aantalVrienden(){
		return mijnVrienden.size();
	}
	
	
}

	
	
	
	
	
	
	
	
	
	
	
	

>>>>>>> origin/master
