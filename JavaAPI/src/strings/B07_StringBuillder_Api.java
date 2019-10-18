package strings;

public class B07_StringBuillder_Api {

	public static void main(String[] args) {
		
		/*
		 * Konstruktoren
		 */
		
		new StringBuilder();
		
		new StringBuilder("java"); // String  - Parameter
		
		new StringBuilder(20);	   // int-Parameter (Anfangsgrosse des internen Arrays)
		
		/*
		 * StringBuilder append(param) (fur alles mogliche uberladen)
		 */
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append("java ");
		sb1.append("ist ");
		sb1.append("toll");
		
		System.out.println(sb1); // java ist toll
		
		/*
		 * 
		 */
		
		sb1.delete(0, 4);
		
		System.out.println(sb1);
		
		System.out.println(sb1.capacity());
		
	}
	
}
