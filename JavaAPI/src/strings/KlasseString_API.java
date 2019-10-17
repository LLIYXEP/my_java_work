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
		
//		indexOf_und_lastIndexOf();
		
//		substring();
		
//		replace();
		
		valueOf();
		
	} // end of main
	
	//valueOf()
	static void valueOf() {
		System.out.println("********** valueOf(XXX) ************");
		System.out.println(String.valueOf(12));
		String s = String.valueOf(-2e-2);
		System.out.println(String.valueOf(-2e-2));
		
		char[] arr = {'J','a','v','a'};
		System.out.println(arr); // Java (da es die spezielle println(char[])	gibt
		System.out.println("arr " + arr); 
		
		System.out.println(String.valueOf(arr));
		Object obj = arr;
		System.out.println(String.valueOf(obj));
	}
	
	//Replace (2x uberladen)
	static void replace() {
		System.out.println("*********Replace(char oldChar, char newChar)******");
		
		String s = "Java ist Klasse!";
		System.out.println("String: " + s);		// String: Java ist Klasse!
		String newS = s.replace('a', 'A');
		System.out.println("String: " + newS);	// String: JAvA ist KlAsse!
		
		System.out.println("*********Replace(oldSubstr, newSubstr)******");
		
		s = "Java (Sprache) und Java (Insel)!";
		String oldSubstr = "Java";
		String newSubstr = "JAVA";
		newS = s.replace(oldSubstr, newSubstr);
		System.out.println(newS); // JAVA (Sprache) und JAVA (Insel)!
	}
	
	//substring (2x)
	static void substring() {
		System.out.println("*********String substring(int)******");
		
		//		    0123456789012
		String s = "C++ ist toll!";
		
		String substr = s.substring(4);
		System.out.println("String: " + s);   // C++ ist toll!
		System.out.println("Substring: " + substr); // ist toll!
		
		System.out.println("*********Syting substring(int beginIndex, int endIndex)");
		String substr2 = s.substring(2, 9);
		System.out.println("Substring2: " + substr2); // + ist t
		
		System.out.println(s.substring(-20)); // Exc
		System.out.println(s.substring(0, 1000)); // Exc
	}
	
	//indexOf (uberladen)und_lastIndexOf (uberladen)
	static void indexOf_und_lastIndexOf() {
		//          012345678901234567890123456789012
		String s = "Heute ist Donnerstag, es ist -22C";
		System.out.println(s.indexOf('t')); // 3
		System.out.println(s.lastIndexOf('n')); // 13
		System.out.println(s.indexOf("ist")); // 6
		System.out.println(s.lastIndexOf(-22)); // sinloss (es kann im String kein Zeichen mit dem Wert -22 geben), aber kompiliert
		
		System.out.println(s.indexOf('t', 5)); // 8
		System.out.println(s.indexOf("ist", 16)); // 8
		
		System.out.println(s.lastIndexOf("t")); // 27
		System.out.println(s.lastIndexOf("t", 25)); // 17
		

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
