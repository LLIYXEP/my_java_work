package vererbung;

public class B05_instanceof {
	
	static class  Auto{};
	static class  PKW extends Auto{};
	static class  Last extends Auto{};
	
	public static void main(String[] args) {
		
		boolean erg = args instanceof String[];
		
		System.out.println(erg);
		
		String args2 = "1212";
		
		Object var = new Auto();
		
		boolean erg2 = var instanceof String[];
		
		System.out.println("var instanceof String[] = " + erg2);

		
		var = new PKW();
		erg = var instanceof Object;
		System.out.println(erg);
		
		Last last = new Last();
		
		PKW pkw = new PKW();
		erg = pkw instanceof Auto;
		erg = pkw instanceof Object;
//		erg = pkw instanceof Last;
		System.out.println(erg);
	}
}
