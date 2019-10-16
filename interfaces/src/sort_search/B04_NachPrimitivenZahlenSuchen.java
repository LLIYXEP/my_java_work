package sort_search;

import java.util.Arrays;

public class B04_NachPrimitivenZahlenSuchen {

	public static void main(String[] args) {
		
		int[] array = {2 , 5, 1 ,7 , 22};
		Arrays.sort(array);
		System.out.println("array " + Arrays.toString(array)); //[1, 2, 5, 7, 22]
		
		System.out.println("Gesucht nach 22");
		int pos = Arrays.binarySearch(array, 22);
		
		System.out.println("Gesucht nach 22 , Position: " + pos); //Gesucht nach 22 , Position: 4
		
		System.out.println("Gesucht nach 3");
		pos = Arrays.binarySearch(array, 3);
		
		System.out.println("Gesucht nach 3 , Position: " + pos); //Gesucht nach 22 , Position: 4
	}
	
}
