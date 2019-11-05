package exceptions;

import jdk.jshell.spi.ExecutionControl.RunException;

public class B05_Throwable {

	public static void main(String[] args) {
		
		try {
//			System.out.println(5/0);	// ArithmeticException:
			
//			int[] arr = new int[1];		// ArrayIndexOutOfBoundsException
//			System.out.println(arr[1]);
			
			Integer x = null;
			int y = x;
			
			

		} catch (Exception e) {
			System.out.println("Abgefangen : " + e);
			e.printStackTrace();
		}
		
		
		/*
		 * Vererbungshierarchie im Klassendiagramm 'Thowable.uxf'
		 */
		Throwable t1 = new ArithmeticException("ae");
		
		RuntimeException rt1 = new NullPointerException("npe");
		
		/*
		 * Throwable / getMessage
		 */
		System.out.println(t1.getMessage());
		System.out.println(rt1.getMessage());
		
		/*
		 * Throwable hat die Methode printStackTrace()
		 */
		t1.printStackTrace();
		
	}
	
}
