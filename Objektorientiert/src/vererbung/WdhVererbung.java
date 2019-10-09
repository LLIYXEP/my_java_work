package vererbung;

import java.util.Random;

public class WdhVererbung {
	
	static class Fahrzeug{
		int baujahr;

		public Fahrzeug(int baujahr) {
			super();
			this.baujahr = baujahr;
		}
		
		public Fahrzeug() {
			this(2000);
		}
		
		
	} // End of Fahrzeug
	
	static class Rentwagen extends Fahrzeug{

	
		
	} //End Rentwagen

	public static void main(String[] args) {
		
		Fahrzeug f = new Fahrzeug(1990);
		
		if (new Random().nextBoolean()) {
			f = new Rentwagen();
		}
		
		System.out.println(f.baujahr);
		
	}
	
}
