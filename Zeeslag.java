
public class Zeeslag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Schip schip = new Schip();
		
		int [] locaties = {2,4,6};
		
		schip.setLocaties(locaties);

		String gebruikersInvoer = "3";
		
		schip.checkInvoer(gebruikersInvoer);
	}

}
