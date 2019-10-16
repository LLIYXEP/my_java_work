package aufgaben;

import java.util.Arrays;
import java.util.Random;

public class KleineAufgabeComparable  {
	
	static class Kreis implements Comparable<Kreis>{
		private int radius;

		public Kreis(int radius) {
			this.radius = radius;
		}

		@Override
		public int compareTo(Kreis o) {
			return radius - o.radius;
		}

		@Override
		public String toString() {
			return "Kreis [radius=" + radius + "]";
		}
		
		
		
	}

	public static void main(String[] args) {
		
		Kreis[] newArray = fillArray(10);
		System.out.println("Array Without Sort -> " + Arrays.toString(newArray));
		
		Arrays.sort(newArray);
		System.out.println("Array With Sort -> " + Arrays.toString(newArray));
		
//		int[] intArray = {5, 52, 2, 3, 6, 7, 12, 45, 1, 2, 4, 2};
//		int[] intArray2 = {5, 52, 2, 3, 6, 7, 12, 45, 1, 2, 4, 2};
//		int[] intArray3 = Arrays.copyOf(intArray, 4);
//		System.out.println(Arrays.toString(intArray3));
	}
	
	static Kreis[] fillArray(int x) {
		Kreis[] kreisArray = new Kreis[x];
		for (int i = 0; i < x; i++) {
			int random = new Random().nextInt(99) + 1;
			Kreis kreis = new Kreis(random);
			kreisArray[i] = kreis;
		}
		return kreisArray;
	}
	
}
