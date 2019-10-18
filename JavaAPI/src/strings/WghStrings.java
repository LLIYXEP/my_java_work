package strings;

public class WghStrings {

	public static void main(String[] args) {
		
		System.out.println(get());
		
		new String(new String(build()));
		
	}
	
	static String get() {
		String s1 = "mo";
		
		s1 = s1 + ",di";
		
		s1 = s1.substring(3);
		
		s1 = s1.concat(",mi");
		
		return s1.toString();
	}
	
	static String build() {
		return new String("java");
	}
	
}
