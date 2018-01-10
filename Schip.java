
public class Schip {

	private int[] locaties;
	private int aantalRaak; 
	
	public void setLocaties(int[] loc) {
		locaties = loc; //loc staat gelijk aan de opgehaalde locaties
	}
	
	public String checkInvoer(String gebruikersInvoer) { //checkInvoer die gebruikersInvoer verwacht als String
		
		String resultaat = "Mis.. Beter richten!";
		
		int invoer = Integer.parseInt(gebruikersInvoer); //invoer is de van een String naar int omgezette gebruikersInvoer
		
		for(int loc : locaties) {
			
			if (invoer == loc) {
				aantalRaak++;
				
				resultaat = aantalRaak == locaties.length ? "Alles is kapot!" : "Raak! Ga zo door!"; //snelle if/else
				break;
				
			}
			
		}
		
		System.out.println(resultaat);
		
		return resultaat;
		
	}
		
}
