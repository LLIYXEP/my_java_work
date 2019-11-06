package exceptions;

/*
 * Regeln beim Uberschreiben:
 * 1. Sichtbarkeit nicht verscharfen
 * 2. Ruckgabetyp nicht andern
 * 3. Keine zusatslichen ( breiteren, Geschwister ) checked Exceptions deklarieren
 */

interface Fahrzeug {
	void fahren();
}

class Rennwagen implements Fahrzeug {

	private int fahren(int x) { // Uberladen
		return 3;
	}
	
	public void fahren() {
		System.out.println("Rennwagen fahrt...");
	}
}


public class WdhUberschreiben {
	
	static void rennen(Fahrzeug f1, Fahrzeug f2) {
		f1.fahren();
		f2.fahren();
	}

	public static void main(String[] args) {
		
		Fahrzeug f1 = new Rennwagen();
		Fahrzeug f2 = new Rennwagen();
		
		rennen(f1, f2);
		
	}

	
}
