package arrayList;

import java.util.ArrayList;
import java.util.List;

public class B03_Iterieren {

	public static void main(String[] args) {
		
		System.out.println("*****Array mit for****");
		
		Integer[] arr = {1, 3, -22, 5};
		
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		System.out.println("*****ArrayList mit for****");
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(3);
		list.add(-22);
		list.add(5);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		System.out.println();
		System.out.println("*****Array mit foreach****");
		for (Integer x : arr) {
			System.out.print(x + " ");
		}
		
		System.out.println();
		System.out.println("*****ArrayList mit foreach ****");
		for (Integer x : list) {
			System.out.print(x + " ");
		}
		
		System.out.println();
		System.out.println("Aufgabe");
		
		String[] arr1 = {"mo", "di", "mi"};
		ArrayList<String> arr2 = new ArrayList<String>();
		
		for (int i = 0; i < arr1.length; i++) {
			arr2.add(arr1[i]);
		}
		
		for (String string : arr2) {
			System.out.println(string);
		}
	}
	
}
