package aufgabe.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Aufgabe_array  {
	static class Sportart{
		String name;
		boolean olympisch;
		public Sportart(String name) {
			super();
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		
	}
	
	static Sportart findObj(ArrayList<Sportart> l, String str){
		Sportart result = null;
		for (int i = 0; i < l.size(); i++) {
			if (l.get(i).getName().equals(str)) {
				return result = l.get(i);
			}
		}
		return result;
	}
	
	static boolean remove(List<String> strArr, String str) {
		boolean result = true;
		if (strArr.contains("fr")) {
			int i = strArr.indexOf("fr");
			strArr.remove(i);
			result = true;
			return result;
		} else {
			result = false;
			return false;
		}
	}
	

	public static void main(String[] args) {
		System.out.println("###### A12");
		int[] a1 = { 1, 2, 3};
		int[] a2 = { -7, -5 };
		int[] a3 = { 101, 202, 303 };
		ArrayList<Integer> list8 = new ArrayList<>();
		for (int i = 0; i < a1.length; i++) {
			list8.add(a1[i]);
		}
		for (int i = 0; i < a2.length; i++) {
			list8.add(a2[i]);
		}
		for (int i = 0; i < a3.length; i++) {
			list8.add(a3[i]);
		}
		
		System.out.println(list8);
		
		System.out.println("###### A11");
		List<String> strArr = new ArrayList<>();
		strArr.add("mo");
		strArr.add("fr");
		strArr.add("di");
		strArr.add("fr");
		strArr.add("mi");
		strArr.add("fr");
		strArr.add("do");
		strArr.add("fr");
		while (remove(strArr, "fr") == true) {
			System.out.println(strArr);
		}
		
		
		
		System.out.println("###### A10");
		Sportart s1 = new Sportart("Beg");
		Sportart s2 = new Sportart("Prig");
		Sportart s3 = new Sportart("Plav");
		Sportart s4 = new Sportart("Ringen");
		Sportart s5 = new Sportart("Skok");
		ArrayList<Sportart> sports = new ArrayList<>();
		sports.add(s1);
		sports.add(s2);
		sports.add(s3);
		sports.add(s4);
		sports.add(s5);
		boolean result = sports.contains(findObj(sports, "Ringen"));
		System.out.println(result);
		
		System.out.println("###### A1");
		ArrayList<Integer> list = makeArray(20);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(i + ". " + list.get(i)  + " ");
		}
		
		System.out.println();
		System.out.println("###### A5");
		Collections.sort(list);
		System.out.println(list);
		ArrayList<Integer> reverseArr = reverseArr(list);
		System.out.println(reverseArr);
		
		System.out.println();
		System.out.println("###### A3");
		List<Integer> list2 = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80);
		for (int i = 0; i < list2.size(); i++) {
			if (i % 2 == 1) {
				System.out.print(list2.get(i) + " ");
			}
		}
		
		System.out.println();
		System.out.println("###### A6");
		ArrayList<Integer> list3 = makeArray2(10);
		System.out.println(list3);
		System.out.println(list3.contains(12));
		
		System.out.println();
		System.out.println("###### A7");
		ArrayList<Integer> list4 = makeArray3(10);
		System.out.println(list4);
		Collections.sort(list4);
		System.out.println(Collections.binarySearch(list4, 12));
		
		System.out.println();
		System.out.println("###### A8");
		ArrayList<Integer> list5 = makeArray3(10);
		list5.removeIf( n -> (n % 2 == 1) );
		System.out.println(list5);
		
		System.out.println();
		System.out.println("###### A9");
		ArrayList<Integer> list6 = makeArray3(10);
		for (int i = 0; i < list6.size(); i++) {
			if (list6.get(i) % 2 == 1 || list6.get(i) == 1) {
				list6.set(i, 0);
			}
		}
		System.out.println(list6);
		
		System.out.println();
		System.out.println("###### A4");
		Collections.reverse(list2);
		System.out.println(list2);
	}
	
	static ArrayList<Integer> makeArray(int x){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < x; i++) {
			int random = new Random().nextInt(201) -100;
			list.add(random);
		}
		return list;
	}
	static ArrayList<Integer> makeArray2(int x){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < x; i++) {
			int random = new Random().nextInt((15 - 10)+1) + 10;
			list.add(random);
		}
		return list;
	}
	static ArrayList<Integer> makeArray3(int x){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < x; i++) {
			int random = new Random().nextInt(51);
			list.add(random);
		}
		return list;
	}

	static ArrayList<Integer> reverseArr(ArrayList<Integer> list){
		ArrayList<Integer> revArr = new ArrayList<>();
		for (int i = list.size() - 1; i >= 0; i--) {
			revArr.add(list.get(i));
		}
		return revArr;
	}
	
}
