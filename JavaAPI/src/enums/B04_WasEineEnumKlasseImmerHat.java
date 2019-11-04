package enums;

import java.util.Arrays;

enum Size {
	BIG, SMALL
}

class Groesse {
	
	
	static final Groesse GROSS = new Groesse() {@Override
	public String toString() {
		return "GROSS";
	}};
	static final Groesse KLEIN = new Groesse() {
		@Override
		public String toString() {
			return "KLEIN";
		}
	};
	
	static Groesse[] values() {
		return new Groesse[] { GROSS, KLEIN};
	}
	
	private Groesse() {}

	@Override
	public String toString() {
		return this.toString();
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
	}
	
}