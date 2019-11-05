package enums;

import java.util.Arrays;

enum Size {
	SMALL, BIG
}

class Groesse implements Comparable<Groesse> {
	private String name;
	private int ordinal;
	
	
	public Groesse(String name, int ordinal) {
		super();
		this.name = name;
		this.ordinal = ordinal;
	}
	

	static final Groesse GROSS = new Groesse("KLEIN", 0) {@Override
	public String toString() {
		return "GROSS";
	}};
	static final Groesse KLEIN = new Groesse("GROSS", 1) {
		@Override
		public String toString() {
			return "KLEIN";
		}
	};
	
	static Groesse[] values() {
		return new Groesse[] { KLEIN, GROSS};
	}
	
	private Groesse() {}

	@Override
	public String toString() {
		return this.toString();
	}

	@Override
	public int compareTo(Groesse o) {
		return ordinal - o.ordinal;
	}
	
	
}

public class B04_WasEineEnumKlasseImmerHat {

	public static void main(String[] args) {
		
		/*
		 * Referenzen anlegen
		 */
		Size s1 = null;
		Groesse g1 = null;
		
		/*
		 * Objekte anlegen
		 */
//		s1 = new Size(); // CF - keine neue Objekte von enum-Typ
//		g1 = new Groesse(); // CF - Konstruktor ist private
		
		/*
		 * Objekte anlegen
		 */
		s1 = Size.BIG; 
		g1 = Groesse.GROSS;
		
		
		/*
		 * toString()
		 */
		System.out.println(s1);
		System.out.println(g1);
		System.out.println(Groesse.KLEIN);
		
		/*
		 * statische Methode values()
		 */
		Size[] allSizes = Size.values();
		System.out.println("Size values: " + Arrays.toString(allSizes));
		
		Groesse[] alleGroessen = Groesse.values();
		System.out.println("Groesse values: " + Arrays.toString(alleGroessen));
		
		/*
		 * 
		 */
		int ordinal = s1.ordinal(); // Poriadkovii nomerBIG
		System.out.println(ordinal); // 0
		
		/*
		 * name()
		 */
		System.out.println(Size.SMALL.name()); // SMALL
		
		/*
		 * sort()
		 */
		Arrays.sort(Size.values()); // OK
		Arrays.sort(Groesse.values()); // OK (Comparable)
		
		
		
	}
	
}
