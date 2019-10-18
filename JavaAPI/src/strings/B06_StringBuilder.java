package strings;

public class B06_StringBuilder {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		System.out.println("1. length: " + sb.length());
		
		sb.append(22);		// int - Argument
		System.out.println("2. length: " + sb.length());
		
		sb.append(" > ");	// String
		sb.append(7.5);		// double
		sb.append(" = ");	// String
		sb.append(true);	// boolean
		
		String s = sb.toString();
		System.out.println("2. String: " + s);
		
		a1();
	}
	
	static void a1() {
		System.out.println("**********Aufgabe**********");
		StringBuilder sb = new StringBuilder();
		//Delaem Stroku iz 4isel ot 1 do 1000
		
		for (int i = 0; i < 1000; i++) {
			sb.append(i);
		}
		
		System.out.println(sb.length());
		System.out.println(sb);
	}
	
}
