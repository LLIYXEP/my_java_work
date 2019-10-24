package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class B05_API_erweitert {

	public static void main(String[] args) {
		
		/*
		 * Konstruktoren
		 */
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(12);
		list1.add(13);
		
		List<Integer> list2 = new ArrayList<>(list1);
		System.out.println("list2: " + list2); // [12, 13]
		
		/*
		 * addAll(Collection)
		 */
		list2.addAll(list1);
		System.out.println("list.size(): " + list2.size()); // 4
		System.out.println("list2: " + list2); // [12, 13, 12, 13]
		
		/*
		 * 
		 */
		list2.clear();
		System.out.println("list.size(): " + list2.size()); // 0
		System.out.println("list2: " + list2); // []
		
		/*
		 * Iterable, Iterator (nicht in der Prufung)
		 */
		List<Integer> list3 = new ArrayList<>();
		list3.addAll(list1);
		list3.add(14);
		
		
		Iterable<Integer> iterable = list3;
		Iterator<Integer> it = iterable.iterator();
		
		System.out.println("********list3 mit dem Iterator: ");
		System.out.println(iterable);
		
		boolean hasNext = it.hasNext();
		int result = it.next(); 
		
		System.out.println(hasNext); // 12
		System.out.println(result); // true
		
		while (it.hasNext()) {
			int e = it.next(); 
			System.out.println(e);
		}
		
		/*
		 * Aufgabe
		 */
		System.out.println();
		System.out.println("******* Aufgabe **********");
		
		ArrayList<String> list = new ArrayList<>();
		list.add("montag");
		list.add("di");
		list.add("mittw");
		list.add("freitagabend");
		list.add("samstag");
		
		/*
		 * .sort(Comparator)
		 */
		
		Comparator<String> cmp = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		};
		
		list.sort(cmp);
		System.out.println(list);
		
		/*
		 * In der Klasse java.util.Collections gibt es die Methoden sort und binarySearch fur Listen
		 */

	}
	
}
