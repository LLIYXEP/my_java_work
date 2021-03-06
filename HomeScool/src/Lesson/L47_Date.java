package Lesson;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.WeekFields;
import java.util.Calendar;
import java.util.Date;

public class L47_Date {
	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		
		System.out.println(date);
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		System.out.println(calendar);
		calendar.add(Calendar.WEEK_OF_MONTH, 1);
		System.out.println(calendar.getTime());
		
		calendar.add(Calendar.DAY_OF_MONTH, 1);
		System.out.println(calendar.getTime());
		
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(dateFormat.format(calendar.getTime()));
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(simpleDateFormat.format(calendar.getTime()));
		
//		Обратный процесс
		Date newDate = simpleDateFormat.parse("05/12/2018");
		System.out.println(newDate);
		
	}
}
