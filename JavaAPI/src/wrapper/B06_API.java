package wrapper;

import java.util.Arrays;

public class B06_API {

	public static void main(String[] args) {
		
		/*
		 * Konstruktoren. 
		 * 
		 *  Jede Wrapper - Klass hat: 
		 * - Konstruktor mit dem primitiven Parameter (Java 8)
		 * 
		 *  Fast jede Wrapper - Klass hat: 
		 * - Konstruktor mit dem String- Parameter (Java 8)
		 */
		
		new Integer(12);
		new Character('a');
		new Boolean(true);
		// ...
		
		new Integer("12");
//		new Character("a")  // CF
		new Boolean("true");
		
		/*
		 * Statische Autoboxing - Methode
		 * 
		 * 			Referenz valueOf(primitiv)
		 */
		Integer va1 = Integer.valueOf(12);
		Character var2 = Character.valueOf('a');
		
		/*
		 * Statische Autounboxing - Methode
		 * 
		 * 			primitiv xxxValue()
		 * 
		 * Die nummerischen Wrapper-Klassen erben / implimentieren sogar 6 anliche Methoden aus der Basisklasse 'Number'
		 * Nur ein werd die Autounboxing-Methode sein
		 */
		
		Float var4 = 12F;
		float prim = var4.floatValue();
		
		/*
		 * Statische valueOf(String) 
		 */
		Integer var5 = Integer.valueOf("+12");
		System.out.println("var5 = " + var5);
		
		// Integer.valueOf("hallo welt"); // Exception
		
		Boolean var6 = Boolean.valueOf("tRuE");
		System.out.println("var6 = " + var6);
		
		System.out.println("Boolean.valueOf(\"hallo welt\"): " + Boolean.valueOf("hallo welt")); // false
		
		
		/*
		 * speziell für Integer
		 */
		int var7 = Integer.parseInt("+12");
		System.out.println("var7 = " + var7);
		
		/*
		 * Alle Wrapper-Klassen sind Comparable
		 */
		Boolean[] arr = {true, Boolean.valueOf(false), Boolean.valueOf("moin"), Boolean.TRUE, false};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
}
