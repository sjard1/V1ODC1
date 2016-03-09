package week3.opdracht6_2;

import java.util.ArrayList;

public class FacebookAccount {

	private String naam;
	private ArrayList<Vriend> vriend;
	
	public FacebookAccount(String nm){
		naam = nm;
	}
	
	public String getNaam(){return naam;}
	
	public void voegVriendToe(Vriend nwV){
		vriend = nwV;
	}
	
	
	
	
	
}
