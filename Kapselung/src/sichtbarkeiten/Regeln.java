package sichtbarkeiten;

/*
 * 		- private: 
 * 			sichtbar nur in der eigenen Klasse
 * 
 * 		- 'default' oder 'package private'
 * 			sichtbar im ganzen Package
 * 
 * 		- protected
 * 			sichtbar:
 * 				- im ganzen Package 
 * 				- und in abgeleiteten Klasse (auch wenn sie in anderen Packages liegen),
 * 				  ABER NUR mit Referenzen vom abgeleiteten Typ
 * 
 * 		- public
 * 			sichtbar uberall
 * 
 * Topleveltypen in einem Package konnen entweder publuc oder ' package private' sein
 * 
 * - Die Elemente eines Interfaces sind immer public (Java 8)
 * 
 * - Die Elemente einer Klasse (statiche und nichtstatische Methoden, Konstruktoren, statische/n.s. Attribute , 
 * 		innere konnen einer der 4 Sichtbarkeiten bekommen
 * 		Ausnahme: beim Uberschrieben darf die Sichtbarkeit nicht verscharft werden.
 */

//public class X{} // CF: public class X miss in der Datei X.java definiert werden

public class Regeln { // OK: innere Klasse dart bekiebege Sichtbarkeit haben

	public static void main(String[] args) {
		
		
		
	}
	
}
