package strings;

/*
 * immutable = unveranderlich
 */

public class StringsSindUnveraenerdlich {

	public static void main(String[] args) {
		
		String s1 = "java";
		
		System.out.println("s1 = " + s1);
		
		s1.toUpperCase();
		
		System.out.println("s2 = " + s1);	// java
		
		s1 = s1.toUpperCase();
		
		System.out.println("s3 = " + s1);	//JAVA
		
	}
	
}
