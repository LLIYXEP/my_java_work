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
		
		System.out.println("1: " + sb1); // java ist toll
		
		/*
		 * StringBuilder delete (int start, int end)
		 */
	
		sb1.delete(0, 4);
		
		System.out.println("2: " + sb1); //  ist toll
		
		/*
		 * StringBuilder delete (int index)
		 */
	
		sb1.deleteCharAt(3);
		
		System.out.println("3: " + sb1); //  is toll
		
		/*
		 * StringBuilder insert (int offset, String string) (fur alles mogliche uberladen)
		 */
		sb1.insert(3, "t");
		sb1.insert(0, "Java");
		
		System.out.println("4: " + sb1);
		
		/*
		 * StringBuilder replace (int start, int end, String string)
		 */
		sb1.replace(0, 4, "C++");
		
		System.out.println("5: " + sb1);
		
		/*
		 * StringBuilder reverse();
		 */
		sb1.reverse();
		System.out.println("6: " + sb1);
		
		/*
		 * StringBuilder reverse();
		 */
		sb1 = new StringBuilder("java");
		System.out.println("*** Weitere Tests mit dem neuen StringBuilder");
		
		System.out.println("1: " + sb1);
		
		/*
		 * indexOf(String string)
		 * indexOf(String string, int offset)
		 */
		int index = sb1.indexOf("av", 0);
		System.out.println("2: " + index);
		
		/*
		 * indexOf(String string)
		 * indexOf(String string, int fomIndex)
		 */
		index = sb1.lastIndexOf("a");
		System.out.println("3: " + index); // 3 (Suche nach dem letztern Substrind "a" unter Position 3 (inklusive))
		
		index = sb1.lastIndexOf("a", 2);
		System.out.println("4: " + index);
		
		/*
		 * length
		 */
		System.out.println("5: " + sb1.length());
		
		/*
		 * substring
		 */
		System.out.println(sb1.substring(1)); //ava
		System.out.println(sb1);			  //java
		System.out.println(sb1.substring(1,3)); //av
		
		/*
		 * toString
		 */
		String str = sb1.toString();
		System.out.println("str: " + str);
	}
	
}
