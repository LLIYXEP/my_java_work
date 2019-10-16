package interfaces;

public class B03_Vererbungshierarchien {
	
	interface Sprungfahig{
		public void springen();
	}
	
	interface Lauffaehig{
		public void laufen();
	}
	
	interface Sportler{
		public void springen();
	}
	
	/*
	 * Interface extends Interface
	 */
	interface Fahrbar extends Lauffaehig{ // Fahrbar IS-A Lauffaehig
		
	}

	/*
	 * Klasse implements InterfaceA, InterfaceB
	 */
	
	static class Dozent implements Sportler, Lauffaehig{ // Dozent IS-A Sportler, Dozent IS-A Lauffaehig

		public void laufen() {
		}

		public void springen() {
		}
	}
	
	static abstract class Fahrer implements Sportler{} // Kann nicht die Methode realisieren
	
	/*
	 * Es ist kein Problem, wenn zwei Basisinterfasces eine Methode mit der gleichen Signatur deklarieren:
	 */
	
	static class SportFrosh implements Sprungfahig, Sportler{

		@Override
		public void springen() {
		}
		
	}
	
	public static void main(String[] args) {
		
		Lauffaehig var1 = null;
		Sportler var2 = null;
		Fahrbar var3 = null;
		
//		var1 = var2; // keine IS-A
		var1 = var3; // Fahrbar IS-A Lauffaehig
//		var3 = var1; // keine IS-A von rechts nach links
		
		Sprungfahig sprungfahig = new SportFrosh();
		sprungfahig.springen();
		
		Sportler sport = new SportFrosh();
		sport.springen();
		
	}
	
}
