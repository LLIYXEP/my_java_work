package Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class HA {
	public static void main(String[] args) {
		
//		int[] a1 = createArray(12,  5, 13);
//		for (int i : a1) {
//			System.out.println(i);
//		}
		
	
		int[] a2 = createArray(2, 15, 30);
		printArray(a2);
		System.out.println();
		checkUmlaute('a');
	}
	
	static int[] createArray(int x, int y, int m) {
		
		
		
		int[] arr = new int[m];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = getRandomNumberInRange(x, y);
		}
		
		return arr;
	}
	
	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
	
	static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}
	
	static void checkUmlaute(char i) {
		char[] umlautArray = new char[]{'ä','ö', 'ü'};
		
		List<char[]> list = Arrays.asList(umlautArray);
		
		 
		if (list.contains(i)) {
			System.out.print("Good " + "[" + i + "]" + " ist eine deutsche Buchstabe mit dem Umlaut!");
		} else {
			 System.out.println("Hm " + "[" + i + "]" + " ist keine Buchstabe mit dem Umlaut!");
		}
	}
	
	
}
