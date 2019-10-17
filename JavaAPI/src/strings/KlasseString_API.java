package strings;

public class KlasseString_API {

	public static void main(String[] args) {
		
		konstruktoren();
		
		length_und_charAt();
		System.out.println();
		System.out.println("++++++++++");
		m();
		
	} // end of main
	
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
