package vererbung;

public class B08_Ohne_Polimorphie {
	
	static class PKW {
		public void fahren() {
			System.out.println("Motor an");
			System.out.println("Gas geben");
			System.out.println("Fahren...");
		}
	}
	
	static class Fahrrad {
		public void fahren() {
			System.out.println("Auf die pedalen treten");
			System.out.println("Fahren...");
		}
	}

	public static void main(String[] args) {
		
		PKW pkw = new PKW();
		startenUndFahren(pkw);
		
		System.out.println();
		
		Fahrrad fRad = new Fahrrad();
		startenUndFahren(fRad);
		
		
	}
	
	static void startenUndFahren(Object fahrzeug) {
		
		System.out.println("Versuche mit " + fahrzeug.getClass().getSimpleName() + " zu fahren");
		if (fahrzeug instanceof PKW) {
			PKW pkw = (PKW) fahrzeug;
			pkw.fahren();
		} else if (fahrzeug instanceof Fahrrad) {
			Fahrrad fRad = (Fahrrad) fahrzeug;
			fRad.fahren();
		} else {
			System.out.println("Der Typ wird nicht unterstuzt " + fahrzeug.getClass());
		}
		
		
	}
	
}
