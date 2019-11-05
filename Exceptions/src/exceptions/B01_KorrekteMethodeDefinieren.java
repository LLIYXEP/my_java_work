package exceptions;

public class B01_KorrekteMethodeDefinieren {
	
	static boolean isAddOk = true; // Keine gute Losung
	
	static int add(int a, int b) {
		isAddOk = true;
		
		long result = (long) a+ b;
		
		if (result < Integer.MIN_VALUE ||result > Integer.MAX_VALUE) {
			System.out.println("Fehler ! Integer Overflow: " + result);
//			System.exit(0); // Keine gute Losung
			isAddOk = false;
		}
		
		return (int) result;
		
		
	} //End of  B01_KorrekteMethodeDefinieren
	
	

	public static void main(String[] args) {
		
		
		
		final int MIN_ENTFERNUNG = 1000;
		
		int a = 1;
		int b = Integer.MAX_VALUE;
		int entfernung = add(a,b);
		
		if (!isAddOk) {
			
			System.out.println("Die Anwendung hat einen Fehler erkannt");
			
		} else {
			
			System.out.println("entfernung " + entfernung); // -2147483647
			
			if (a + b < MIN_ENTFERNUNG) {
				System.out.println("Feuer!");
			} else {
				System.out.println("Alles klar");
			}
			
		}
		
		
		
		
		
		
	} // End of main
	
	
	
	
	
	
}
