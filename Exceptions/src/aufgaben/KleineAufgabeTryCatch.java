package aufgaben;

import java.util.Random;

public class KleineAufgabeTryCatch {

	public static void main(String[] args) {
		
		
		/*
		 * A1
		 */
		do {
			try {
				System.out.println("a");
				maybeException();
				System.out.println("b");
				break;
			} catch (Exception e) {
				System.out.println("Exception!");
			}
		} while (true);
		
		
		
		
	}
	
	static void maybeException() {
		
		if (new Random().nextBoolean()) {
			throw new RuntimeException();
		}	
		
	}
	
	
	
}
