package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class B03_Datum_Zeit_Objekte_bilden {

	public static void main(String[] args) {
		
		/*
		 * Fur ALLE Klassen aus java.time:
		 * 
		 * Haben keine sichtbaren Konstruktoren
		 * Objekte werden mit statischen Fabrikmethoden erzeugt!
		 */
		
//		LocalDate var = new LocalDate(); 	// CF
		
		LocalDate date = LocalDate.now();
		System.out.println("date: " + date);	// date: 2019-11-11
		
//		new LocalTime();	// CF
		
		LocalTime time = LocalTime.of(12, 3);
		System.out.println("time: " + time);	// time: 12:03
		
//		new LocalDateTime();	// CF
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);			// 2019-11-11T10:15:56.766504
	}
	
}
