package week2.les1.practicum3;

public class Leerling {
	private String naam;
	private double cijfer;
	
	public Leerling(String nm)
	{
		naam = nm;
	}
	
	public String getNaam()
	{
		return naam;
	}
	
	public double getCijfer()
	{
		return cijfer;
	}
	
	public void setCijfer(double c)
	{
		cijfer = c;
	}
	
	public String toString()
	{
		return getNaam() + " heeft cijfer: " + getCijfer();
	}
}