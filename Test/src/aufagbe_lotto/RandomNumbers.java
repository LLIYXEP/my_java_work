package aufagbe_lotto;

import java.util.Random;

//Generiert einzigartige Zufallswerte und liefert sie in einem Array zuruck

public class RandomNumbers {
	public static int[] createUniqueRandomArray(int length, int min, int max) {
		int [] array = new int[length];
		
		Random random = new Random();
		
		
		for (int i = 0; i < array.length; i++) {
			
//			array[i] = random.nextInt(max - min) + min;
			int number = random.nextInt(max - min) + min;
			if (hasNumber(number, array,i)) {
				i--; // Dekrement i povtor dlia poiska drugogo 4isla
				continue;
			}
			array[i] = number;
		}
		
		return array;
	}
	
	private static boolean hasNumber(int number, int[] array, int toIndex) {
		for (int i = 0; i < toIndex; i++) {
			if (array[i] == number) {
				return true;
			}
		}
		return false;
	}
}
