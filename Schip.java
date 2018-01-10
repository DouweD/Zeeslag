
public class Schip {

	private int[] locaties;
	private int aantalRaak; 
	
	public void setLocaties(int[] loc) {
		locaties = loc;
	}
	
	public String checkInvoer(String gebruikersInvoer) {
		
		String resultaat = "Mis.. Beter richten!";
		
		int invoer = Integer.parseInt(gebruikersInvoer);
		
		for(int loc : locaties) {
			
			if (invoer == loc) {
				aantalRaak++;
				
				resultaat = aantalRaak == locaties.length ? "Alles is kapot!" : "Raak! Ga zo door!";
				break;
				
			}
			
		}
		
		System.out.println(resultaat);
		
		return resultaat;
		
	}
		
}
