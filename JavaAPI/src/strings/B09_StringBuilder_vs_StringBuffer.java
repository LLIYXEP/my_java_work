package strings;

public class B09_StringBuilder_vs_StringBuffer {

	public static void main(String[] args) {
		
		/*
		 * StringBuilder gits es seit Java 5 um Stringbuffer zu ersetzen
		 * 
		 * - Bitte verwenden sie im Ihrem Code StringBuilder. Der ist schneller
		 */
		
//		StringBuilder sb1 = new StringBuilder();
		StringBuffer sb1 = new StringBuffer();
		
		sb1.append(22);
		sb1.append(" > ");
		sb1.append(7.2);
		sb1.append(" = ");
		sb1.append(true);
		//..
		
		sb1.insert(2, "3344");
		
		System.out.println(sb1);
	}
	
}
