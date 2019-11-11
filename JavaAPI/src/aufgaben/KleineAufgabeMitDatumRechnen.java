package aufgaben;

import java.time.LocalDate;

public class KleineAufgabeMitDatumRechnen {

	public static void main(String[] args) {
		
		System.out.println("-------------------");
		
		LocalDate date = LocalDate.of(2000, 1, 11);
		
		System.out.println(date);
		System.out.println(date.isLeapYear());
		
		System.out.println("-------------------");
		
		
		for (int i = 1890; i <= 2020; i+=2) {
			
			if (i % 4 == 0  && !LocalDate.of(i, 1, 11).isLeapYear()) {
				System.out.println(i);
			}
		}
		
		System.out.println("-------------------");
	}
	
}
