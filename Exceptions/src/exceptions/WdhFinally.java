package exceptions;

public class WdhFinally {
	
	static void m1() {
		System.out.print("a ");
		
		try {
			try {
				
				System.out.println(5/0);
			} catch (Error e) {
				System.out.print("e2 ");
			} finally {
				System.out.print("f2 ");
			}
		} catch (Throwable e) {
			System.out.print("e1 ");
		} finally {
			System.out.print("f1 ");
		}
		
		System.out.print("b ");
	}
	
	/*
	 * Bitte so nicht nicht programieren
	 */
	static int m2() {
		
		try {
			return 5/0;
		} finally {
			return -1; // ersetzt leider den return aus try! Bitte so nicht nicht programieren
		} 
	}
	
	public static void main(String[] args) {
		
//		m1();
		System.out.println(m2());
		
	}
	
	
}
