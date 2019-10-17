package strings.aufgabe;

/*
 * - Schritt 1 - Kompilieren
 * 
 * 	Unter anderem sammelt der Compiler alle (einzigartige) String - Literale aus der Klasse
 * 	und erstellt daraus fur die Klasse die Literalen - Liste: mo, di.
 * 
 * - Schritt 2 (Strarten)
 * 
 * 	Beim Laden der Klasse erzeugt die VM fur die Texte aus der Literalen - Liste, die es noch nicht im String - Pool gibt
 * 	neue String - Objekte und fugt sie dem String-Pool
 * 	
 */

public class StringPool {

	public static void main(String[] args) {
		
		String s = "mo"; // hole die Referenz fur 'mi' - String aus dem String-Pool
		String s1 = "mo"; // hole die Referenz fur 'mi' - String aus dem String-Pool
		System.out.println(s == s1); //true
		
		String s2 = new String("mo"); // neues Objekt auf dem Heap erzeugen, Inhalte aus dem String-Object vom String-Pool
									  // hole die R eferenz fur 'mo' - String aus dem String-Pool
		
		System.out.println(s == s2); //false
		
		String s3 = "di"; // hole die R eferenz fur 'di' - String aus dem String-Pool
		
		test(); // Keine neuen String-Objekte werden beim Aufruf der Methode 'test' erzeugt
		
	}
	
	static void test() {
		String s = "mo";
		System.out.println(s); // hole die R eferenz fur 'mo' - String aus dem String-Pool
	}
	
}
