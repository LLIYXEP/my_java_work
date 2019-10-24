package aufgabe.array_erweitert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Array_erweitert {

	public static void main(String[] args) {
		
//		a1();
//		a2();
//		a3();
//		a4();
		a5();
		
		
		
	}
	
	static void a5() {
		Integer[] arr = {1, 2, 3, 4, 5};
		List<Integer> list = Arrays.asList(arr);
		ArrayList<Integer> arrl = (ArrayList)list;
		
		for (Integer integer : arrl) {
			System.out.println(integer);
		}
	}
	
	static void a4() {
		System.out.println();
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			arrayList.add(new Random().nextInt(51));
		}
		Object[] array = arrayList.toArray();
		System.out.println(Arrays.toString(array));
		int[] arr = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			arr[i] = (int)array[i];
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
	
	
	static void a3() {
		System.out.println();
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			arrayList.add(new Random().nextInt(51));
		}
		
		MyOperator<Integer> operator;
		operator = new MyOperator<>();
		operator.number = 0;
		arrayList.replaceAll(operator);
		for (Integer integer : arrayList) {
			System.out.print(integer + " ");
		}
	}
	
	
	
	static void a2() {
		System.out.println();
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			arrayList.add(new Random().nextInt(51));
		}
		arrayList.removeIf(n -> (n % 2 != 0));
		for (Integer integer : arrayList) {
			System.out.print(integer + " ");
		}
	}
	
	static void a1() {
		
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("mo");
		arrayList.add("di");
		arrayList.add("mi");
		arrayList.add("do");
		arrayList.add("fr");
		
		Iterable<String> itStr = arrayList;
		Iterator<String> it = itStr.iterator();
		
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		
	}
	
}
