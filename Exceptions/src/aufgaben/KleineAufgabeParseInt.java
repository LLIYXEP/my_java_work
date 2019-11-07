package aufgaben;

public class KleineAufgabeParseInt {

	public static void main(String[] args) {
		
		
		System.out.println(isInteger("10")); // true
		System.out.println(isInteger("hello welt")); // false
		
	}
	
	static boolean isInteger(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
}
