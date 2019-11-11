package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class B06_DateTimeFormatter {

	public static void main(String[] args) {
		
//		DateTimeFormatter fmt = new DateTimeFormatter(); // CF
		testPattern("y");
		testPattern("yy");
		testPattern("yyy");
		testPattern("yyyy");
		testPattern("yyyyy");
		
		testPattern("M");
		testPattern("MM");
		testPattern("MMM");
		testPattern("MMMM");
		testPattern("MMMMM");
		
		testPattern("d");
		testPattern("dd");
		
		testPattern("E");
		testPattern("EE");
		testPattern("EEE");
		testPattern("EEEE");
		testPattern("EEEEE");
		
		testPattern("d.MMMM");
		
		System.out.println("Heute ist der " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("d.MMMM")));
		
//		testPattern("HH:mm:ss");
	}
	
	static void testPattern(String pattern) {
		LocalDate date = LocalDate.now();
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern(pattern);
		String text = date.format(fmt);
		System.out.format("mit pattern %s: %s %n", pattern , text);	
	}
	
	
}
