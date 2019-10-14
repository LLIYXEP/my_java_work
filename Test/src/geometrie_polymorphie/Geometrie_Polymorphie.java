package geometrie_polymorphie;

import java.util.Random;

public class Geometrie_Polymorphie {

	public static void main(String[] args) {
		
		Rechteck r1 = new Rechteck(2, 3);
		System.out.println(r1);
		
		double flaecheRechteck = r1.getFlaeche();
		System.out.println("Flaeche von r1: " + flaecheRechteck);
		
		Kreis k1 = new Kreis(3);
		System.out.println(k1);
		
		double flaecheKreis = k1.getFlaeche();
		System.out.println("Flaeche von k2: " + flaecheKreis);
		
		Random random = new Random();
		
		Figur[] array = new Figur[10];
		
		for (int i = 0; i < array.length; i++) {
			if (random.nextBoolean()) {
				int breite = random.nextInt(20)+1;
				int hoehe = random.nextInt(20)+1;
				array[i] = new Rechteck(breite, hoehe);
			} else {
				int radius = random.nextInt(20)+1;
				array[i] = new Kreis(radius);
			}
		}
		
//		for (Figur figur : array) {
//			System.out.println(figur);
//		}
		
//		print(array);
		
		printFlaechen(array);
		
	}
	
	static void print(Figur[] figuren){
		for (int i = 0; i < figuren.length; i++) {
			System.out.println(i+1 + ". " + figuren[i]);
		}
	}
	
	static void printFlaechen(Figur[] figure) {
		
		for (int i = 0; i < figure.length; i++) {
			Figur figur = figure[i];
			
			double flaeche = figur.getFlaeche();
			
			
			System.out.println(i+1 + ". " + figur);
			System.out.println("Flache: " + flaeche);
			
		}
	}
	
}
