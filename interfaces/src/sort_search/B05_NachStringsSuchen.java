package sort_search;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class B05_NachStringsSuchen {
	
	static class MyComp implements Comparator<String>{

		@Override
		public int compare(String s1, String s2) {
			return s2.compareTo(s1);
		}
		
	}

	public static void main(String[] args) {

		String[] array = {
			"bb", "pp", "ff", "jj", "fh"	
		};
		Arrays.sort(array);
		System.out.println("Array: " + Arrays.toString(array));
		
		/*
		 *    0   1   3   3   4
		 *  [bb, ff, fh, jj, pp]
		 */
		
		int pos = Arrays.binarySearch(array, "pp");
		System.out.println("Gesucht nach pp. Position: " + pos); // 4
		
		pos = Arrays.binarySearch(array, "aa");
		System.out.println("Gesucht nach aa. Position: " + pos); // -1
		
		
		
		System.out.println("**********Absteigend sortieren*************");
		
		Comparator<String> cmp = new MyComp();
		Arrays.sort(array, cmp);
		System.out.println("Array: " + Arrays.toString(array));
		
		System.out.println("**********************");
		pos = Arrays.binarySearch(array, "pp"); // sucht im naturlich aufstregend sortierten Array aber hier ist das
		System.out.println("Falsch gesucht im alternativ sortieren Array pp. Position: " + pos); // 4
		
		//richtige BinarySearch
		pos = Arrays.binarySearch(array, "pp", cmp); // sucht im  sortierten Array
		System.out.println("Richtig gesucht im alternativ sortieren Array nach pp. Position: " + pos); // 4
		
	} // end of main

}
