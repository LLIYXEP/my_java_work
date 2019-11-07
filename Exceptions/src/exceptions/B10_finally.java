package exceptions;

/*
 * finally-Block sollte eingesetzt werden um 'Ressourcen' zu schliesen
 * 
 * finally wird IMMER ausgefuhrt, wenn sein try-Block aktiv wurde (gestartet wurde)
 */

public class B10_finally {

	public static void main(String[] args) {
		
		
		test01();
		
		try {
			test02();
		} catch (Exception e) {
			System.out.println("2. ArithmeticException abgefangen"); 
		}
		
		try {
			test03();
		} catch (Exception e) {
			System.out.println("3. ArithmeticException abgefangen"); 
		}
		
		test04();
		
	}
	
	static void test01() {
		System.out.println("******* finally nach dem try ohne exc ********");
		
		try {
			System.out.println("1. try: ");
		}  finally {
			System.out.println("1. finally: ");
		}
	} // end of test01
	
	static void test02() {
		System.out.println("******* finally nach dem try mit exc ********");
		
		try {
			System.out.println("2. try: ");
			System.out.println(5/0);
		}  finally {
			System.out.println("2. finally: ");
		}
		
		System.out.println("2. Zu der Ausgabe kommt es nicht, da im try eine Exc geworfen wurde");
	} // end of test02
	
	static void test03() {
		System.out.println("******* finally lauft NICHT, wen sein try-Block nicht aktiviert wurde (nicht startete) ********");
		
		System.out.println(5/0);
		
		try {
			System.out.println("3. try: ");
			
		}  finally {
			System.out.println("3. finally: ");
		}
		
		
	} // end of test03
	
	static void test04() {
		System.out.println("******* finally lasst sich mit catch kombinieren (soll ganz am Ende stehen)  ********");

		try {
			System.out.println("4. try: ");
			
		} catch (Exception e) {
			System.out.println("4. catch: ");
		} finally { // kein catch danach erlaubt
			System.out.println("4. finally: ");
		}
		
		
		
	} // end of test04
	
}
