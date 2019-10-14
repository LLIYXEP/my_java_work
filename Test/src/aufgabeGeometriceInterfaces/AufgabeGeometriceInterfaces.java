package aufgabeGeometriceInterfaces;

import java.util.Random;

public class AufgabeGeometriceInterfaces {

	public static void main(String[] args) {
		
		Rechteck rechteck = new Rechteck(12,23);
		rechteck.getFlaeche();
		
		Kreis kreis = new Kreis(11);
		kreis.getFlaeche();
		
		Figur[] figures = createFiguresArray(10);
		
		gesamtFlaeche(figures);
		
	}
	
	static Figur[] createFiguresArray(int x) {
		Figur[] figur = new Figur[x];
		for (int i = 0; i < x; i++) {
			System.out.println("******Figure******* " + i);
			if (i % 2 == 0) {
				int random  = new Random().nextInt(21);
				int random2  = new Random().nextInt(21);
				Rechteck rechteck = new Rechteck(random, random2);
				figur[i] = rechteck;
				System.out.println(rechteck);
			} else {
				int random  = new Random().nextInt(20) + 1;
				Kreis kreis = new Kreis(random);
				figur[i] = kreis;
				System.out.println(kreis);
			}
		}
		
		return figur;
	}
	
	static void gesamtFlaeche(Figur[] figur) {
		double flache = 0;
		for (Figur fig : figur) {
			flache += fig.getFlaeche();
		}
		System.out.println("Gesamte flaeche von Figuren = " + flache);
	}
}
