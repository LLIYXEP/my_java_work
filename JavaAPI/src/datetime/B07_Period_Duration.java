package datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class B07_Period_Duration {

	public static void main(String[] args) {
		
		LocalDate startDateInclusive = LocalDate.now();
		LocalDate endDateExclusive = startDateInclusive.plusDays(2);
		
		
		Period p = Period.between(startDateInclusive, endDateExclusive);
		System.out.format("%s, %s, %s %n",p.getDays(), p.getMonths(), p.getYears()); // 2,0,0
		System.out.println(p.minusDays(1).getDays()); // 1
		System.out.println(p.plusDays(12).getDays()); // 14
		System.out.println(p.withDays(12).getDays()); // 12
		
		/*
		 * Duration
		 */
		LocalTime startInclusive = LocalTime.now();
		LocalTime endExclusive = startInclusive.plusHours(2);
		
		Duration d = Duration.between(startInclusive, endExclusive);
		System.out.println(d);  // PT2H
		System.out.println(d.getSeconds()); // 7200
	}
	
}
