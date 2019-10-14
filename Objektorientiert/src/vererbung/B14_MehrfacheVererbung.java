package vererbung;

/*
 * Eine Klasse darf NUR von EINER Basisklasse erben
 * Eine Art 'mehrfacher' Vererbung gibt es mit Interfaces
 */

class BaseClassA{};
class BaseClassB{};

class DevideClass extends BaseClassA{};
//class DevideClass extends BaseClassA{}, extends BaseClassB{}; //CF
//class DevideClass extends BaseClassB{}; //CF



public class B14_MehrfacheVererbung {
	
	/*
	 * Basistyp A
	 */
	static abstract class Figur{
		abstract double getFlaeche();
	} //--------------------------------------------------- End of Figur
	
	/*
	 * Universelle Komponente B
	 */

	static double berechnenGesamtflaeche(Figur[] figuren) {
		
		double gesamt = 0;
		
		for (Figur figur : figuren) {
			gesamt += figur.getFlaeche();
		}
		
		return 0;
	}
	
	/*
	 * Basistyp B
	 */

	static class Werkstuck {
		private int masse;

		double getMasse() {
			return 0;
		}

		
	}
	/*
	 * Universelle Komponente B
	 */

	static Werkstuck findeDasSchwersteWerkstuck(Werkstuck[] werkstuckArray) {
		
		Werkstuck max = werkstuckArray[0];
		
		for (Werkstuck werkstuck : werkstuckArray) {
			if (max.getMasse() < werkstuck.getMasse()) {
				max = werkstuck;
			}
		}
		
		return max;
	}
	
	//Aufgabe und gleichzeitig ein Problem: Rechteck soll sowohl Figur als auch Werctuck sein
	
//	static class Rechteck extends Figur, Werkstuck{
//		double getFlaeche() {
//			return 0;
//		}
//	};
	
	public static void main(String[] args) {
		
		
		
	}
	
}
