import java.util.Scanner;

public class Zeeslag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Schip schip = new Schip();
		String gebruikersInvoer;
		int aantalBeurten = 0;
		boolean schipVaartNog = true;
		int [] locaties = {3,4,6};
		schip.setLocaties(locaties);
		
		while(schipVaartNog) {
			String resultaat;
			System.out.println("Schiet dan...");
			gebruikersInvoer = scanner.next();
			resultaat = schip.checkInvoer(gebruikersInvoer);
			aantalBeurten++;
			if(resultaat.equals("Alles is kapot!")) {
				schipVaartNog = false;
			}
		}
		
		System.out.println("Je hebt er " + aantalBeurten + " beurten over gedaan om het schip DEAUD te maken.");

	}

}
