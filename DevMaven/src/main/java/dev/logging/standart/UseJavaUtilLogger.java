package dev.logging.standart;

import java.util.logging.Level;
import java.util.logging.Logger;

public class UseJavaUtilLogger {
	
	private static Logger log = Logger.getLogger( UseJavaUtilLogger.class.getName() );

	public static void main(String[] args) {
		
//		log.setLevel(Level.OFF);
//		log.setLevel(Level.ALL);
		log.setLevel(Level.WARNING);
		
		log.info("info msg");
		log.warning("warning msg");
		
		System.out.println("end of main");
		
	}
	
}
