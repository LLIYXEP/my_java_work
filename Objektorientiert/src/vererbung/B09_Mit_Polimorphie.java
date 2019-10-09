package vererbung;

import vererbung.B08_Ohne_Polimorphie.Fahrrad;
import vererbung.B08_Ohne_Polimorphie.PKW;

public class B09_Mit_Polimorphie {
	
	static class Fahrzeug{

		public void fahren() {
			System.out.println("Ein Fahrzeug fahrt...");
		}
		
	}

	static class PKW extends Fahrzeug{
		public void fahren() {
			System.out.println("Motor an");
			System.out.println("Gas geben");
			System.out.println("Fahren...");
		}
	}
	
	static class Fahrrad extends Fahrzeug{
		public void fahren() {
			System.out.println("Auf die pedalen treten");
			System.out.println("Fahren...");
		}
	}
	
	static class Skateboard extends Fahrzeug{
		public void fahren() {
			System.out.println("Rollen");
		}
	}

	public static void main(String[] args) {
		
		PKW pkw = new PKW();
		startenUndFahren(pkw);
		
		System.out.println();
		
		Fahrrad fRad = new Fahrrad();
		startenUndFahren(fRad);
		
		System.out.println();
		startenUndFahren(new Skateboard());
		
		System.out.println(pkw);
		
	}
	
	static void startenUndFahren(Fahrzeug fahrzeug) {
		System.out.println("Fahren mit " + fahrzeug.getClass().getSimpleName());
		fahrzeug.fahren();
	}
	
}
