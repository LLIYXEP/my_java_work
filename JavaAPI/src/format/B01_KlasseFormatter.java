package format;

import java.io.PrintStream;
import java.util.Formatter;

// Sind nicht in der Prufung
// Allgemein - Formatter
//		https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html

// Alternativ fur zahlen-Formatierung - DecimalFormat
// 		https://docs.oracle.com/javase/8/docs/api/java/text/DecimalFormat.html

public class B01_KlasseFormatter {

	public static void main(String[] args) {
		
		String format = "%s - %s - %s"; //Muster nach Formatter -Regeln
		Object[] varargs = {"java", 12, true};
		
		/*
		 * Methode 'format' aus der Klasse String
		 */
		String result = String.format(format, varargs); // Nach Formatter-Regeln
		System.out.println(result);
		
		/*
		 *  Methode 'format' und 'printf' aus der Klasse Printstream
		 */
		
		System.out.format(format, varargs);
		System.out.println();
		
		System.out.printf("%s", "Hello");
		
		
		
	}
	
}
