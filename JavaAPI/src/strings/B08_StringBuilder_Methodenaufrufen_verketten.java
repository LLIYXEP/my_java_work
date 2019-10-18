package strings;

public class B08_StringBuilder_Methodenaufrufen_verketten {

	public static void main(String[] args) {
		
		String s1 = new StringBuilder()
		.append("Java ist toll")
		.append('!')
		.insert(0, "Die Sprache ")
		.toString();
		
		System.out.println(s1);
		
//		String s2 = new StringBuilder("Java ist toll")
//				.substring(0, 4).append(" hat ") // liefert String /// CF
//				.append("schnell")
//				.toString();
//		System.out.println(s2);
		
		String s2 = new StringBuilder("Java ist toll")
		.replace(0, 4, "haha").append(" hat ") 
		.append("schnell")
		.toString();
System.out.println(s2);
	}
	
}

