package vererbung;

/*
 * Interface ist auch eine Typ-Beschreibung (wie eine Klasse), aber abstrakt 
 * 
 * Zu einem Interface kann eine Klasse eine IS-A-Beziehung definieren
 */

interface Lauffaehig{
	
	void laufen();
}

public class B15_Interfaces {
	
	static class Auto{
		
	}
	
	static class PKW extends Auto implements Lauffaehig{

		public void laufen() {
			System.out.println("PKW fahrt...");
		}
		
	}
	
	static class Person{
		
	}
	
	static class Dozent extends Person implements Lauffaehig{

		public void laufen() {
			System.out.println("Dozent fahrt...");
		}
		
	}

	public static void main(String[] args) {
		
		PKW pkw = new PKW();
		zumLaufenBringen(pkw);
		
		Dozent dozent = new Dozent();
		zumLaufenBringen(dozent);
		
//		Lauffaehig var = new Auto(); //CF -  Auto is kein Lauffaehig
		Lauffaehig var = new PKW(); //CF -  Auto is kein Lauffaehig
		
		
	}
	
	static void zumLaufenBringen(Lauffaehig var) {
		var.laufen();
	}
	
}
