package exceptions;

import java.util.Random;

public class B06_PassenderCatchBlock {

	public static void main(String[] args) {
		
		try {
			
			int var = new Random().nextInt(3);
			
			switch (var) {
			case 0:	
				System.out.println(5/0); // ArithmeticException
			case 1:	
				throw new NullPointerException("test npe"); // NullPointerException
			default:
				Integer i = (Integer)(Number)22.0; // ClassCastException
			}
			
		} catch (ArithmeticException e) {
			// Hier speziell Behandlung fur ArithmeticException
			System.out.println("ArithmetikException abgefangen");
			
		} catch (NullPointerException e) {
			// Hier allgemeine Behandlung fur alle andere Exceptions
			System.out.println("NullPointerException abgefangen");
		}  catch (Exception e) {
			// Hier allgemeine Behandlung fur alle andere Exceptions
			System.out.println("Exception abgefangen");
		} 
		
		/*
		 * cath-Reihenfolge ist wichtig
		 */
		
		try {
			
		} catch (Exception e) {
			
		} 
//		catch (ArithmeticException e) {	// CF Unreachable catch - Block
//		}
		
		/*
		 * catch-Reihenfolge fur die Geschwister-Exctypen ist egal
		 */
		try {
			
		} catch (NullPointerException e) {
			
		} catch (ArithmeticException e) {
		
		} 
		
		
		try {
			
		} catch (ArithmeticException e) {
			
		} catch (NullPointerException e) {
			
		} 
		
		
	} // End of main
	
}
