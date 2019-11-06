package aufgabe.exc_parse_date;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Exc_PaseInt {

	public static void main(String[] args) {
		
		
		String dateAsString = getUserInput();
		
	}
	
	static String getUserInput() {
		
		Scanner s1 = new Scanner(System.in);
		
		
		DateFormat df = DateFormat.getInstance();
		
		boolean isTrue = true;
		
		do {
			try {
				System.out.println("Ввведите пожалуйста дату");
				String dataString = s1.nextLine();
				Date data = df.parse(dataString);
				System.out.println(data);
				isTrue = false;
				break;
			} catch (Exception e) {
				System.out.println("**** Неверный формат даты *****");
			}
		} while (isTrue == true);
		
		return "";
	}
	
}
