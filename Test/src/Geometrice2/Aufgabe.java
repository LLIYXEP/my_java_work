package Geometrice2;



public class Aufgabe {
	public static void main(String[] args) {
		System.out.println("**********Rechteck********");
		Rechteck r1 = new Rechteck(2,3);
		System.out.println(r1);
		r1.bewegen(191345, -2232);
		System.out.println(r1);
		
		System.out.println("**********Kreis********");
		Kreis k1 = new Kreis(7);
		System.out.println(k1);
		k1.bewegen(191, -2223423);
		System.out.println(k1);
	
		
	}
}
