package aufgabe.date_time_calendar;

import java.time.LocalDate;
import java.time.Month;

public class Date_time_calendar {

	public static void main(String[] args) {
		
		printCalendar(4, 2010);
		
	}
	
	static void printCalendar(int m, int y) {
		LocalDate date = LocalDate.of(y, m, 1);
		Month month = date.getMonth();
		int year = date.getYear();
		System.out.println("-----------------");
		System.out.println(month + " " + year);
		System.out.println("-----------------");
		for (int i = 1; i <= month.maxLength(); i++) {
			date = LocalDate.of(y, m, i);
			System.out.format("%02d | %10s | %n", i, date.getDayOfWeek());
		}
	}
	
}
