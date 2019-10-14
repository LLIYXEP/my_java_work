package vererbung;

/*
 * Signatur: Methodename + List der Parametertypen
 * 
 * Uberladen: in derselben Klasse mehrere Methode mit denseben Namen definieren (Signaturen mussen sich unterscheiden)
 * 
 * Uberschreiben: Die aus basisklasse geerbte Methode mit einer neuen Definition ersetzen
 * 
 * *************Regeln Ubeschreiben/ Implementrieren abstrakte Methode**************
 * 
 * 1. Die Sichtbarkeit darf nicht verscharft werden
 * 2. Ruckgabetyp darf nicht geandart werden (Ausnahme: kovarianter Typ)
 * 3. Keine zusatslichen checked-Exceptions durfen in der throws-Klausel deklariert werden
 */

public class B11_Uberschreiben {
	
	static class Auto{
		public void fahren() {	}
		
		int bremsen() {
			return 3;
		}
		
		private void besch() {} // Private Methode weden nicht verrerbt
	}
	
	static class PKW extends Auto{
		// void fahren() {  // Compiletfehler : Sichtbarkeit verscharft
//		protected void fahren() {  // Compiletfehler : Sichtbarkeit verscharft
//		private void fahren() {  // Compiletfehler : Sichtbarkeit verscharft
		public void fahren() {  // Compiletfehler : Sichtbarkeit verscharft	
//		}
	}
		
//		public String bremsen() {return null;} // Compiletfehler : Ruckgabetyp geandart	
//		short bremsen() {return 33;} // Compiletfehler : Ruckgabetyp geandart	
		protected int bremsen() {return 33;} 
		
		private int fahren(int x) { return x+2;}
		
		//Achtung ! Private Methode weden nicht verrerbt
		
		int besch() {return 22;}

	
	public static void main(String[] args) {
		
		System.out.println(123);
		
	}
	
	}
}
