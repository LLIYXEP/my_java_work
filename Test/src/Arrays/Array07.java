package Arrays;

import java.util.Arrays;
import java.util.Random;

public class Array07 {
	public static void main(String[] args) {
		a1();
		a4();
	}
	
	static void a4() {
		char[] letters = dBuch();
		String arAsstr = Arrays.toString(letters);
		System.out.println(arAsstr);
	}
	
	static char[]dBuch(){
		int len = 'z' - 'a' + 5;
		
		char[] letters = new char[len];
		
		for (char i = 'a'; i < 'z'; i++) {
			letters[i-'a'] = i;
		}
		
		
				letters[letters.length-4] = 'a';
				letters[letters.length-3] = 'a';
				letters[letters.length-2] = 'a';
				letters[letters.length-1] = 'a';
		
		return letters;
	}
	
	static void a1() {
		int[] arr = createArray(2,15,30);
		
		
		
		for (int i : arr) {
			System.out.println(i);
		}
		
		
	}
	
	static int[] createArray(int min, int max, int len) {
		
		int[] arr = new int[len];
		
		Random random = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(max-min+1) + min;
		}
		
		return arr;
	}
}


