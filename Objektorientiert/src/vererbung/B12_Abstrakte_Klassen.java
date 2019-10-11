package vererbung;

/*
 *  Von abstrakte klaasse konnen keine Objekte gebildet weden
 *  Abstrakten Klassen durfen (nicht mussen) abstrakte Methoden deklarieren
 *  
 *  Jede konkrete Klasse muss alle abstrakten Basisklassen realisieren
 */

public class B12_Abstrakte_Klassen {
	
	static abstract class Figur{
		int x , y;
		
//		double getFlaeche() {return -1;}; //Sinlose Realisierung (Schwache in Design)
		
		abstract double getFlaeche(); 
		
		void bewegen ( int x , int y) {
			this.x = x;
			this.y = y;
		}
	} //end of Figur
	
	static class Kreis extends Figur{
		int radius = 3;
		
		@Override
		double getFlaeche() {
			return Math.PI * radius * radius;
		}
	} //end of Kreis
	
	static class Rechteck extends Figur{
		int breite=2, hoehe=3;
		
		@Override
		double getFlaeche() {
			return breite * hoehe;
		}
	} //end of Rechteck
	
//	static class Dreieck extends Figur{  // CF : die abstrakte Methode 'getFlaeche' nicht realisiert
//		
//	}
	
	public static void main(String[] args) {
		
		Figur f = new Kreis();
		
		System.out.println(f.getFlaeche());
		
		f = new Rechteck();
		
		System.out.println(f.getFlaeche());
		
//		f = new Figur(); //Compilerfehler: keine Objekte von abstrakten Klassen (ware sowieso sinloss)
		
	} //end of Main

}
