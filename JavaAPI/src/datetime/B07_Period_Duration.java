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
		System.out.println(p.getDays()); // 2
		
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
