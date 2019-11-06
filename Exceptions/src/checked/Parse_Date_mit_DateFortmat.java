package checked;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class Parse_Date_mit_DateFortmat {

	public static void main(String[] args) {
		
//		testKlasseDate();
//		testKlasseDateFormat();
		testKlasse_Instanzen();
	}
	
	static void testKlasse_Instanzen() {
		System.out.println("****** Klasse DateFormat ******");
		
		Date date = new Date();
		
		DateFormat df = DateFormat.getInstance();
		System.out.println(df.format(date)); // 06.11.19, 12:51
		
		df = DateFormat.getDateInstance();
		System.out.println(df.format(date)); // 06.11.2019
		
		df = DateFormat.getTimeInstance();
		System.out.println(df.format(date)); // 12:53:23
		
		df = DateFormat.getDateTimeInstance();
		System.out.println(df.format(date)); // 06.11.2019, 12:54:11
		
		int dateStyle = DateFormat.LONG; // FULL, MEDIUM, SHORT
		int timeStyle = DateFormat.SHORT; // FULL, MEDIUM, SHORT
		df = DateFormat.getDateTimeInstance(dateStyle, timeStyle);
		System.out.println(df.format(date)); // 6. November 2019, 12:56
		
		dateStyle = DateFormat.FULL; // FULL, MEDIUM, SHORT
		timeStyle = DateFormat.FULL; // FULL, MEDIUM, SHORT
		df = DateFormat.getDateTimeInstance(dateStyle, timeStyle);
		System.out.println(df.format(date)); // Mittwoch, 6. November 2019 um 12:57:31 Mitteleuropäische Normalzeit
		
	}
	
	static void testKlasseDateFormat() {
		System.out.println("****** Klasse DateFormat ******");
		
		DateFormat df = DateFormat.getInstance();
		
		/*
		 * Date zum String formatieren:
		 */
		Date date = new Date();
		String dateAlsText = df.format(date);
		
		System.out.println("Date als String " + dateAlsText); // Date als String 06.11.19, 12:42
		System.out.println("Date mit String " + date); // Date mit String Wed Nov 06 12:42:27 CET 2019
		
		/*
		 * String zum Date parsen:
		 */
		try {
			dateAlsText = "11.7.3, 08:45";
			Date d2 = df.parse(dateAlsText);
			System.out.println("d2: " + d2);
		} catch (Exception e) {
			System.out.println("Kann den Text nicht parsen: " + dateAlsText);
		}
		
	}

	static void testKlasseDate() {
		System.out.println("****** Klasse Date ******");
		/*
		 * Klasse Date.
		 * 
		 * Date Speicher als long die Anzahl de Millesekinden con 1.1.1970 bus zu einem anderen Zeitpunkt
		 */
		
		Date date = new Date(); // Mills bis jetzt
		
		long mills = date.getTime();
		System.out.println("Mills seit 1.1.1970 " + mills); // Mills seit 1.1.1970 1573040142490
		
		System.out.println(date); // Wed Nov 06 12:33:40 CET 2019
		
		Date damals = new Date(121314); // 121314 Mills seit 1.1.1970
		System.out.println("damals " + damals);
	}
	
}
