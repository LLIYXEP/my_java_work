package enums;

import java.util.Random;

public class B01_DasLebenOhneEnums {
	
	public static final byte ROT = 0;
	public static final byte GELB = 1;
	public static final byte GRUEN = 2;

	public static void main(String[] args) {
		
//		boolean boolVar = true; // 2 moglische Werte
//		
//		byte byteVar = 1; // 256
//		
//		short shortVar = 1; // ca. 65000
//		
//		int intVar = 1; // ca. 4 Mrd
		
		System.out.println("*** Ampel ***");
		
		byte farbe = getAmpelFarbe();
		
		switch (farbe) {
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
		
	} // end of Main
	
	static byte getAmpelFarbe() {
		return (byte)new Random().nextInt(((3)+1)-1);
	}
	
}
