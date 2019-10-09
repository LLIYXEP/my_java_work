package Geometrice_aufgabe;

import java.util.Random;

public class Aufgabe {

	public static void main(String[] args) {
		Rechteck r = new Rechteck(10, 20);
		r.setSizes(13, 15);
		System.out.println(r);
		
		Rechteck r2 = new Rechteck(1, 2);
		setSizes2(r2,3, 155);
		System.out.println(r2);
		
		Kreis k = new Kreis(20);
		k.setRadius(5);
		System.out.println("k " + k);
		
		Kreis k2 = new Kreis(10);
		System.out.println("k2 " + k2);
		
		Rechteck r3 = new Rechteck(k.getRadius(), k2.getRadius());
		System.out.println(r3);
		
		new Rechteck().create100Rechtecke();
		
		
	}
	
	static void setSizes2(Rechteck r, int b, int h) {
		r.breite = b;
		r.höhe = h;
	}
	
	
	
}
