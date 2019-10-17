package strings;

public class KlasseString_API {

	public static void main(String[] args) {
		
//		konstruktoren();
//		
//		length_und_charAt();
//		System.out.println();
//		System.out.println("++++++++++");
//		m();
//		
//		toUp_und_toLow();
//		System.out.println("+++++++++++++++++");
//		
//		isEmpty();
//		
//		endsWith_und_startsWith();
		
//		concat();
		
//		equals_und_equalsIgnoreCase();
		
		indexOf_und_lastIndexOf();
		
	} // end of main
	
	//indexOf (uberladen)und_lastIndexOf (uberladen)
	static void indexOf_und_lastIndexOf() {
		//          01234567890123456789
		String s = "Heute ist Donnerstag";
		System.out.println(s.indexOf('t'));
		System.out.println(s.lastIndexOf('n'));
		System.out.println(s.indexOf("ist"));
		System.out.println(s.lastIndexOf(-22)); // sinloss (es kann im String kein Zeichen mit dem Wert -22 geben), aber kompiliert
		
		
	}
	
	//equals
	static void equals_und_equalsIgnoreCase() {
		String s1 = "java";
		String s2 = "java";
		String s3 = new String("java");
		
		System.out.println("s1 = s2: " + (s1 == s2));
		System.out.println("s1 = s3: " + (s1 == s3));
		System.out.println(s1.equals(s2));
		
		System.out.println("***********equalsIgnoreCase**********");
		System.out.println("java mit JAVA mit ignore case: " + "java".equalsIgnoreCase("JAVA"));
	}
	
	//concat
	static void concat() {
		String s = "java";
		String s2 = s.concat(" hi");
		System.out.println(s2);
	}
	
	//endsWith, startsWith == boolean
	static void endsWith_und_startsWith() {
		System.out.println("************10**********");
		String s = "Heute is Donnerstag";
		System.out.println("endsWith " + s.endsWith("tag")); // true
		
		System.out.println("endsWith " + s.startsWith("Heute")); // true
		
		System.out.println(s.startsWith("ute", 2));
	}
	
	//isEmpty
	static void isEmpty() {
		System.out.println("***********boolean isEmpty*********");
		
		String s = "java";
		System.out.println("\"Java\".isEmpty(): " + s.isEmpty());
		
		s = "";
		System.out.println("\"\".isEmpty(): " + s.isEmpty());
		
//		s = null;
//		System.out.println("null.isEmpty(): " + s.isEmpty()); // Nullpointer Exc
		
		
	}
	
	static void toUp_und_toLow() {
		String s = "jAvA_%";
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		System.out.println(s);
	}
	
	static void m() {
		String s = "java_%";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
	}
	
	static void length_und_charAt() {
		System.out.println("*************length()**************");
		String s1 = "Java";
		System.out.println(s1.length());
		
		System.out.println("*************charAt()**************");
		System.out.println(s1.charAt(2));
		
		a1();
	}
	
	static void a1() {
		System.out.println("****A1****");
		String s = "Heute ist Mittwoch";
		int number = s.length();
		
		for (int i = number - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
	}
	
	static void konstruktoren() {
		System.out.println("*************Konstruktoren**************");
		
		String s1 = new String();
		
		String s2 = new String("Java");
	}
	
}
