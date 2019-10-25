package importe;

/*
 * - Besonderes Package java.lang - alle Typen aus dem Package sind ohne import-Anweisung verwendbar
 * 
 * - Nur sichtbare Elemente lassen sich importieren!
 *  
 * - import: importiert einen oder alle Toplevel-Namen aus einem Package!
 * 
 */

import importe.p1.Utils; // eine Klasse Utils importieren
//import importe.p2.Utils; // CF
import importe.p2.*; // CF
import java.util.*; // alle Toplevel - Typen importieren

public class Regeln_import {

	public static void main(String[] args) {
		/*
		 *  fur Typen aus java.lang geht es ohne import:
		 */
		java.lang.String s1;
		String s2;
		
		/*
		 * einen Klasse wurde importieren
		 */
		importe.p1.Utils u; // Vollqualifizierter Klassenname
		System.out.println(importe.p1.Utils.P1);
		
		Utils u2; // 'vereinfachte Klassenname (importiert)
		System.out.println(Utils.P1);
		
		/*
		 * Alle Toplevel-Klassen wurden importieren
		 */
		java.util.Random random; // Vollqualifizierter Klassenname
		Random r2; // 'vereinfachte Klassenname (importiert)
		
		java.util.ArrayList<Integer> list; // Vollqualifizierter Klassenname
		ArrayList<Integer> list2; // 'vereinfachte Klassenname (importiert)
	}
	
}
