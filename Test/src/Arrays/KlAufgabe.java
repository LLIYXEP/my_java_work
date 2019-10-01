package Arrays;

public class KlAufgabe {
	
	public static void main(String[] args) {
		
		System.out.println(printArgs("Hi"));
		System.out.println(printArgs("Hi", "Pedro!", "How", "are","you","?"));
		
		
	}
	
	static String printArgs(String str, String... arr) {
		String result = str;
		
		for (String x : arr) {
			result += ", " + x;
		}
		
		return result;
	}
	
}
