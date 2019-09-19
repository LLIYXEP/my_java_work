package test;

import java.util.Random;

public class Aufgabe {
	public static void main(String[] args) {
		zeichneRechteck(5, 10, 20);
		
	}
	
	static void zeichneRechteck(int MAL, int VON, int BIS) {
		for (int i = 0; i < MAL; i++) {
			
			System.out.println(getRandomNumberInRange(VON, BIS));
		}
		
	}
	
	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
	
}
