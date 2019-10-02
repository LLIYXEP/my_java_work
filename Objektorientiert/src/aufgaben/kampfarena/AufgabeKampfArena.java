package aufgaben.kampfarena;

import java.util.Random;

public class AufgabeKampfArena {
	public static void main(String[] args) {

		// Kampfer vorbereiten ( 8 Kampfer erzeugen und auf einer Sitzbank plazieren)
		Sitzbank bank = new Sitzbank();

		bank.add(new Kampfer("Tom"));
		bank.add(new Kampfer("Jerry"));
		bank.add(new Kampfer("Tyson"));
		bank.add(new Kampfer("Klitchko"));
		bank.add(new Kampfer("Popeye"));
		bank.add(new Kampfer("Achil"));
		bank.add(new Kampfer("Peter"));
		bank.add(new Kampfer("Paul"));
		// Kampfer durchfuhren:

		// solange es mindestens zwei Kampfer auf der Bank sitzen
		while (bank.getSize() > 1) {
			System.out.println("-----------------");
			System.out.println("Neuer Kampf! Auf der Bank: " + bank);
			
			// Ein Kampf
			
			// - Zwei zufallige Kampfer von Sitzbank in die Arena holen
			Kampfer k1 = bank.removeRandom();
			Kampfer k2 = bank.removeRandom();
			System.out.println("Kampfer 1: " + k1);
			System.out.println("Kampfer 2: " + k2);

			Kampfer kampfSieger = null;

			// wiederholen
			while (true) {
				if (k1.schlagen()) {// - k1 schlagt k2.
					kampfSieger = k1;
					// - wenn k2 KO ist Kampf beenden
					break;
				} else if (k2.schlagen()) { // - k2 schlagt k1.
					kampfSieger = k2;
					// - wenn k1 KO ist Kampf beenden
					break;
				} else {
					System.out.println("Kein KO, der Kampf geht weiter");
				}
			}

			// nach dem Kampf:
			System.out.println("*** Dre Kampf ist vorbei***");

			// Sieger/Verlierer zeigen
			Kampfer kampfVerlierer = kampfSieger == k1 ? k2 : k1;
			System.out.println("Gewonnen: " + kampfSieger);
			System.out.println("Verloren: " + kampfVerlierer);
			// Verlierer rauswerfen
			// Sieger zuruck auf die Sitzbank
			
			bank.add(kampfSieger);
		}

		// Endsieger von der Bank holen und gratulieren
		Kampfer endSieger = bank.removeRandom();

		System.out.println("*****************");
		System.out.println("Sieger: " + endSieger);
		System.out.println("*****************");
	}

}
