package enums;

import java.util.Random;

/*
 * Exam-Inhalte
 */

enum AmpelFarbe{
	
	ROT, GELB, GRUEN;
	
}

public class B03_AufzaehlungMitEnum {

	public static void main(String[] args) {
		
		System.out.println("*** Vor einer Ampel (mit switch) ****");
		
		AmpelFarbe farbe = getAmpelFarbe();
		
		switch (farbe) {
//		case AmpelFarbe.ROT: // <- leider kompiliert es nicht 
		case ROT: 
			System.out.println("Rot! Stehen bleiben!"); 
			break;
		case GELB:
			System.out.println("Gelb! Stehen bleiben!");
			break;
		case GRUEN:
			System.out.println("Grun! Los!");
			break;
		default:
			System.out.println("Fehler! Unbekannte Farbe: " + farbe);
		}
		
		System.out.println("*** Vor einer Ampel (mit else/ else if/ else) ****");
		
		if ( farbe == AmpelFarbe.ROT ) {
			System.out.println("Rot! Stehen bleiben!");
		} else if (farbe == AmpelFarbe.GELB) {
			System.out.println("Gelb! Stehen bleiben!");
		} else if (farbe == AmpelFarbe.GRUEN) {
			System.out.println("Grun! Los!");
		} else {
			System.out.println("Fehler! Unbekannte Farbe: " + farbe);
		}
		
	} // End of main
	
	static AmpelFarbe getAmpelFarbe() {
		AmpelFarbe[] alleFarben = AmpelFarbe.values();
		int index = new Random().nextInt(alleFarben.length);
		return alleFarben[index];
	}
	
}
