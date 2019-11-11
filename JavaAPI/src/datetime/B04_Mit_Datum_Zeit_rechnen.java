package datetime;

import java.time.LocalDate;

public class B04_Mit_Datum_Zeit_rechnen {

	public static void main(String[] args) {
		
		/*
		 * Fur ALLE Klassen aus java.time:
		 * 
		 * Objekte sind UNVERANDERLICH!! (Immutable!!!)
		 */
		
		
		LocalDate date = LocalDate.now();
		System.out.println("1. " + date);	//1. 2019-11-11
		
		date.plusYears(2); // neuews Objekt gebildet! Altes Objekt NICHT GEANDERT!!!!
		System.out.println("2. " + date);			//2. 2019-11-11
		
//		String s = "lava";
//		s.concat(" ist toll");
//		System.out.println(s); // java
		
		date = date.plusYears(2);
		System.out.println("3. " + date);
		
		
		
		
		
		
	} // end of main
	
}
