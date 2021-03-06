package exceptions;

public class B02_KorrekteMethodeMitExceprion {
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	
	
	static int add(int a, int b) {
		
		long result = (long) a+ b;
		
		if (result < Integer.MIN_VALUE ||result > Integer.MAX_VALUE) {
//			System.out.println("Fehler ! Integer Overflow: " + result);
			throw new IllegalArgumentException("Integer Overflow: " + result);
		}
		
		return (int) result;
	} //End of  B01_KorrekteMethodeDefinieren
	
	

	public static void main(String[] args) {
		
		int a = 1;
		int b = Integer.MAX_VALUE;
		
		try {
			int entfernung = add(a,b);
			System.out.println("entfernung " + entfernung);
			
		} catch (Exception e) {
			System.out.println("Die Anwendung hat einen Fehler erkannt. " + e.getMessage());
			
		}
		
		
	}
	
}
