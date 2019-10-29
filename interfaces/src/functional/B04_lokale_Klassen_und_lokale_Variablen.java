package functional;

import java.util.Random;

public class B04_lokale_Klassen_und_lokale_Variablen {
	
	interface Tier {
		
	}
	
	class Katze implements Tier{
		
		@Override
		public String toString() {
			return "Katze";
		}
		
	} // End of Katze
	
	static Tier getLieblingsTier() {
		//Variable , die sich ' effectively final' verhalt, darf in der lokalen Klasse gelesen werden
		int alter = new Random().nextInt(5) + 1;
		
		// Lokale Klasse  . Gultig nur bis zum letzten gescw. Klammer der Methode getLieblingsTier.
		
		class Hund implements Tier{

			@Override
			public String toString() {
				return "Hund. Alter : " + alter; // Zugriff auf die Variable aus dem Context de Klassendefinition
			}	
		}

		return new Hund();
	} // end of getLieblingsTier

	public static void main(String[] args) {
		
		Tier tier = getLieblingsTier();
		Tier tier2 = getLieblingsTier();
		
		System.out.println("tier 1: " + tier);
		System.out.println("tier 2: " + tier2);
		System.out.println("tier 1: " + tier);
		System.out.println("tier 2: " + tier2);
		
	}
	
}
