import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Zeeslag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); //invoer van scanner
		Random random = new Random(); //invoer van random
		Schip schip = new Schip(); 
		String gebruikersInvoer; 
		int aantalBeurten = 0;
		boolean schipVaartNog = true; //schip begint op true en moet naar false
		int tijdelijk = random.nextInt(5) +1; // geeft locaties tussen 1 en 5
		
		//zorgt dat de schepen niet op dezelfde plek liggen
		schip.setLocaties(); //op te halen in de Schip-class
		
		ArrayList<Integer> locaties = new ArrayList<Integer>(7);
		locaties.add(tijdelijk);
		locaties.add(++tijdelijk);
		locaties.add(++tijdelijk);
		
		while(schipVaartNog) { 
			String resultaat;
			System.out.println("Schiet dan..."); //zolang schip nog vaart moet je schieten
			gebruikersInvoer = scanner.next(); 
			resultaat = schip.checkInvoer(gebruikersInvoer); 
			aantalBeurten++; //aantal beurten gaan omhoog
			if(resultaat.equals("Alles is kapot!")) { //zodra resultaat gelijk staat aan de String "Alles is kapot!" is het spel klaar en worden de beurten weergegeven
				schipVaartNog = false; //De boot zinkt
			}
		}
		
		System.out.println("Je hebt er " + aantalBeurten + " beurten over gedaan om het schip DEAUD te maken.");

	}

}
