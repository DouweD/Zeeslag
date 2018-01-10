import java.util.ArrayList;


public class Schip {

	private ArrayList<String> locaties = new ArrayList<String>();
	private int aantalRaak; 
	
	public void setLocaties(ArrayList<String> loc) {
		locaties = loc; //loc staat gelijk aan de opgehaalde locaties
	}
	
	public String checkInvoer(String gebruikersInvoer) { //checkInvoer die gebruikersInvoer verwacht als String
		
		String resultaat = "Mis.. Beter richten!";
		int index = locaties.indexOf(gebruikersInvoer);
		
		if(index >= 0) {
			locaties.remove(index);
			resultaat = locaties.isEmpty() ? "Het schip is DEAUD!" : "Raak!";
		}
		
		System.out.println(resultaat);
		
		return resultaat;
		
	}
		
}
