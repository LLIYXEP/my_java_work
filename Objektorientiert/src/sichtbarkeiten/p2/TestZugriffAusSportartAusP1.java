package sichtbarkeiten.p2;

import sichtbarkeiten.p1.Sportart;

class Arena{
	void testZugriff() {
		Sportart sa = new Sportart();
		System.out.println(sa.olympish); // protected. Arena erbt nicht von Sportart
		System.out.println(((Ringen)sa).olympish); // protected. Arena erbt nicht von Sportart
	}
}

class Ringen extends Sportart{
	public Ringen() {
		this.olympish = true;   // Zugriff mit Referenz
	}
	
	void testZugriff() {
		Sportart sa = new Ringen();
		System.out.println(sa.olympish); // protected. Zugriff mit Basistypreferenz
		System.out.println(((Ringen)sa).olympish); // Zugriff mit Referenz vom abgeleiteten Typ
	}
}

public class TestZugriffAusSportartAusP1 {

	public static void main(String[] args) {
		
		Sportart sa = new Sportart(); // Klassseist public, Constructor ist publik
		
		System.out.println(Sportart.MAX_ALTER); // Attribut ist public
		
		System.out.println(sa.name); // // Attribut ist private
		System.out.println(sa.getMaxAlter()); // private
	}
	
}
