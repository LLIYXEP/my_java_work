package exceptions;

import java.util.Scanner;

class Foo {
	static {
		System.out.println(5/0); // ArithmeticException wird zum ExceptionInInitializerError wmgewandelt
	}
	
}

public class B12_Exam_Fehlertypen {

	public static void main(String[] args) {
		
		
		/*
		 * Throwable - Kanngeworfen/abgefangen/deklarieren werden
		 */
		
		Throwable e1;
		
		/*
		 * Error - konnen nicht dynamisch korrigiert werden
		 */
		
		try {
			testStackOverflowError();
		} catch (StackOverflowError e) {
			System.out.println("StackOverflowError abgefangen. Lasst sich nicht dynamisch korrigieren");
		}
		
		try {
			new Foo();
		} catch (ExceptionInInitializerError e) {
			System.out.println("ExceptionInInitializerError abgefangen");
		} 
		
		NoClassDefFoundError e2;
		
		// AssertionError: Fehler , der beim testen geworfen werden kann (nicht in der Prufung)
		
		
		
		/*
		 * Exception, RuntimeException - Kanngeworfen/abgefangen/deklarieren werden
		 * 
		 * Oft von den Java-Operatoren geworfen (unwarscheinlich von einem Entwickler in seiner Methode mit throw new)
		 * ClassCastException , NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException
		 * 
		 * Oft vom Entwickler geworfen
		 * IllegalArgumentException (darunter auch NumberFormatException) ,  IllegalStateException
		 */
		
		Scanner sc = new Scanner("a b c");
		System.out.println( sc.next() );
		sc.close();
		try {
			System.out.println( sc.next() );
		} catch (IllegalStateException e) {
			System.out.println("IllegalStateException abgefangen");
		}
		
		
		
	}

	static void testStackOverflowError() {
		testStackOverflowError();
	}
	
	
	
}
