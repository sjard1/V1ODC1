import java.util.ArrayList;

public class LuchtvaartMaatschappij {
	private String naam;
	ArrayList<Vliegtuig> alleVliegtuigen = new ArrayList<Vliegtuig>();
	
	public LuchtvaartMaatschappij(String nm){
	naam = nm;
	}

	public boolean heeftVliegtuigType( String tp) {
		boolean result = false;
		
		for(Vliegtuig v : alleVliegtuigen){
			if(v.getType().equals(tp)){
				return true;
				
			}
		}
		return result;

	}
		
	public void voegVliegtuigToe(Vliegtuig v){
		if(!alleVliegtuigen.contains(v)){
			alleVliegtuigen.add(v);
		}else{
			System.out.println("Vliegtuig zit al in lijst.");
		}
	}
	
}

