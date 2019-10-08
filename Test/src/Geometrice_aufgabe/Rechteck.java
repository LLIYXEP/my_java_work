package Geometrice_aufgabe;

import java.util.Random;

public class Rechteck {
	public int breite;
	public int höhe;
	
	public Rechteck(int breite, int höhe) {
		super();
		this.breite = breite;
		this.höhe = höhe;
	}

	public Rechteck() {
		super();
	}



	public void setSizes(int b, int h) {
		this.breite = b;
		this.höhe = h;
	}


	@Override
	public String toString() {
		return "breite : " + this.breite + " höhe: " + this.höhe;
	}
	
	public void create100Rechtecke() {
		for (int i = 0; i <= 100; i++) {
			Random random = new Random();
			int rand = random.nextInt(20) +1;
			int rand2 = random.nextInt(20) +1;
			Rechteck rechteck = new Rechteck(rand,rand2);
			System.out.println(rechteck);
		}
	}
}
