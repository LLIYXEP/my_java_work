package importe;

/*
 *  import static: importiert einen oder alle statische Elemente aus einem typ
 */

import static java.lang.Math.*; // importiert alle statische Elemente der Klasse Math

import importe.p2.Utils;

import static importe.p2.Utils.getMaxValue;

public class Regeln_import_static {

	public static void main(String[] args) {
		
		System.out.println(importe.p2.Utils.getMaxValue()); // vollkualifizierte Klassenname und normaler Zugriff auf die statische Mehode
		
		System.out.println(Utils.getMaxValue()); // 'vereinfachte' Klassenname und normaler Zugriff auf die statische Mehode
		
		System.out.println(getMaxValue()); // 'vereinfachte' Zugriff (geht nicht ohne import static)
		
		System.out.println(Math.PI); // 'normaler' Zugriff auf das statische Methode
		
		System.out.println(PI); // 'vereinfachte' Zugriff (geht nicht ohne import static)
		
		System.out.println(Math.random()); // 'normaler' Zugriff auf das statische Methode
		
		System.out.println(random()); // 'vereinfachte' Klassenname und normaler Zugriff auf die statische Mehode (geht nicht ohne import static)
		
	}
	
	
}
