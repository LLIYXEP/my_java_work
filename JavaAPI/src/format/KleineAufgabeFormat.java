package format;

import java.util.Random;

public class KleineAufgabeFormat {

	public static void main(String[] args) {
		
		int[] array = randomArray(100, 10000, 500); //Array mit zufallswerten aus dem Bereich [-10000...10000]

		print(array);
		
	}
	
	static int[] randomArray(int x, int from, int bis) {
		int[] arr = new int[x];
		
		for (int i = 0; i < arr.length; i++) {
			int random = new Random().nextInt(((from - bis)+1)+bis);
			arr[i] = random;
		}
		return arr;
	}
	
	static void print(int[] arr) {
		System.out.format("| %5s| %8s|%n", "Nr.", "Wert");
		for (int i = 1; i < arr.length; i++) {
			
			System.out.format("| %05d| %8d|%n", i, arr[i]);
		}
	}
}
