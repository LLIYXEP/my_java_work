package test;

import java.util.Calendar;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
		
		
		
	}
	
	
	private Calendar calendar = Calendar.getInstance();
	public long getDays(Date start, Date end)
	{
	  calendar.setTime(start);
	  calendar.set(Calendar.HOUR_OF_DAY, 0);
	  calendar.set(Calendar.MINUTE, 0);
	  calendar.set(Calendar.SECOND, 0);
	  calendar.set(Calendar.MILLISECOND, 0);
	    
	  long l = calendar.getTimeInMillis();
	    
	  calendar.setTime(end);
	  calendar.set(Calendar.HOUR_OF_DAY, 0);
	  calendar.set(Calendar.MINUTE, 0);
	  calendar.set(Calendar.SECOND, 0);
	  calendar.set(Calendar.MILLISECOND, 0);
	    
	  l = calendar.getTimeInMillis() - l;
	  return l / (24 * 60 * 60 * 1000);
	}
	
}
