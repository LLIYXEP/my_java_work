package enums;

import java.util.Random;

class AmpelFarbeAlsKlasse  {
	
	public static final AmpelFarbeAlsKlasse ROT = new AmpelFarbeAlsKlasse();
	public static final AmpelFarbeAlsKlasse GELB = new AmpelFarbeAlsKlasse();
	public static final AmpelFarbeAlsKlasse GRUEN = new AmpelFarbeAlsKlasse();
	
	public static AmpelFarbeAlsKlasse[] values() {
		return new AmpelFarbeAlsKlasse[] { ROT, GELB, GRUEN};
	}
	
	private AmpelFarbeAlsKlasse() {}
}

public class B02_EigenerTypMitClass {


	public static void main(String[] args) {
		
		System.out.println("*** Ampel ***");
		
		AmpelFarbeAlsKlasse farbe = getAmpelFarbe();
		
//		switch (farbe) {
//		case ROT: 
//			System.out.println("Rot! Stehen bleiben!"); 
//			break;
//		case GELB:
//			System.out.println("Gelb! Stehen bleiben!");
//			break;
//		case GRUEN:
//			System.out.println("Grun! Stehen bleiben!");
//			break;
//		default:
//			System.out.println("Fehler! Unbekannte Farbe: " + farbe);
//		}
		
		if ( farbe == AmpelFarbeAlsKlasse.ROT ) {
			System.out.println("Rot! Stehen bleiben!");
		} else if (farbe == AmpelFarbeAlsKlasse.GELB) {
			System.out.println("Gelb! Stehen bleiben!");
		} else if (farbe == AmpelFarbeAlsKlasse.GRUEN) {
			System.out.println("Grun! Los!");
		} else {
			System.out.println("Fehler! Unbekannte Farbe: " + farbe);
		}
		
	} // end of main
	
	static AmpelFarbeAlsKlasse getAmpelFarbe() {
//		return new AmpelFarbeAlsKlasse();
		
		AmpelFarbeAlsKlasse[] alleFarben = AmpelFarbeAlsKlasse.values();
		int index = new Random().nextInt(4); // Bug aber garantiert keine falsche Farbe
		return alleFarben[index];
	}
	
}
