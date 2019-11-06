package exceptions;

import java.text.DateFormat;
import java.text.ParseException;

public class B08_CheckedExceptions {
	
	static void m1() {
		throw new NullPointerException(); // unchecked
	}
	
	/*
	 * Moglichkeit 1 bei einer potentielle checked-Exception: passender catch
	 */
	static void m2() {
		try {
			throw new ParseException("", 1); // checked
		} catch (Exception e) {		// checked Exception abgefangen
			e.printStackTrace();
		}
	}
	
	/*
	 * Moglichkeit 2 bei einer potentielle checked-Exception: throws-Klausel
	 */
	static void m4() throws ParseException {	// checked Exception deklariert
		throw new ParseException("", 1); // checked
	}
	
	static void m5() throws ParseException {	// checked Exception deklariert
		
	}

	public static void main(String[] args)  {
		
//		m4(); // CF: checked-Exception deklariert
		
//		m5();  // CF: checked-Exception deklariert
		
		Integer.parseInt("Hello welt"); // deklariert NumberFormatException (unchecked)
		
//		DateFormat.getInstance().parse("Hello welt"); // CF: deklariertParseException (checked)
		
		
	} // end of main
	
}
