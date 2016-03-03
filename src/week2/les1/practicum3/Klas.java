package week2.les1.practicum3;

import java.util.ArrayList;
import java.util.List;

public class Klas {
	private String klasCode;
	private List<Leerling> leerlingen;
	
	
	public Klas(String kC)
	{
		klasCode = kC;
		leerlingen = new ArrayList<Leerling>();
	}
	
	public void voegLeerlingToe(Leerling l)
	{
		leerlingen.add(l);
	}
	
	public void wijzigCijfer(String nm, Double nweCijfer)
	{
		for(Leerling leerling : getLeerlingen())
		{
			if(leerling.getNaam() == nm)
			{
				leerling.setCijfer(nweCijfer);
			}
		}
	}
	
	public List<Leerling> getLeerlingen()
	{
		return leerlingen;
	}
	
	public int aantalLeerlingen()
	{
		return getLeerlingen().size();
	}
	
	public String toString()
	{
		String returnString = "In klas " + klasCode + " zitten de volgende leerlingen: \n";
		for(Leerling leerling : getLeerlingen())
		{
			returnString += leerling.getNaam() + " heeft cijfer: " + leerling.getCijfer() + "\n";
		}
		
		return returnString;
	}
}
