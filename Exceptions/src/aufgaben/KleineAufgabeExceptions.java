package aufgaben;

public class KleineAufgabeExceptions {

	public static void main(String[] args) {
		
		String name = "Jerry";
		
		name = formatName(name);
		
		System.out.println("Name: " + name);  //JERRY
		
		/*
		 * A2
		 */
		
		
		try {
			name = formatName(null);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		name = formatName("Do");
		
		System.out.println("end of main");
		
		/*
		 * A3
		 */
		
		
	} // end of main
	
	static String formatName(String name) {
		if (name.length() < 3) {
			throw new IllegalArgumentException(" der Name muss mindestesns 3 Zeichen haben");
		}
		return name.toUpperCase();	
	}
	
}
