package strings;

public class B01_StringIstEineBesondereKlasse {

	public static void main(String[] args) {
		
		/*
		 * Auch eine Klasse:
		 */
		
		String s = new String();
		s.toUpperCase();
		
		/*
		 *  Aber auch eine besondere Klasse:
		 */
		
		/*
		 *  1. Konkatenations - Operator
		 */
		
		Object o1 = "1";
		Object o2 = "2";
//		System.out.println(o1 + 02);		//CF
		
		String s1 = "1";
		String s2 = "2";
		System.out.println(s1 + s2);
		
		/*
		 *  2. String - Literalle
		 */
		
		String s3 = "java";
		
		System.out.println("\\\\".length());
		
		/*
		 *  3. String - Pool (s. Bsp. 'StringPool')
		 */
	}
	
}
