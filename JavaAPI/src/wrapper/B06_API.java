package wrapper;

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
	}
	
}
