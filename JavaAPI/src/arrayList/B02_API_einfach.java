package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class B02_API_einfach {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		/*
		 * int size()
		 */
		System.out.println("1. size: " + list.size());
		
		/*
		 * boolean isEmpty()
		 */
		System.out.println("1. isEmpty: " + list.isEmpty());
		
		/*
		 * boolean add(E element)
		 */
		boolean result = list.add("mo"); // immer true fur ArrayList
		System.out.println("3. add: " + result);
		
		System.out.println("2. size: " + list.size());
		System.out.println("2. isEmpty: " + list.isEmpty());
		
		/*
		 * toString ist uberschrieben
		 */
		System.out.println("A. list: " + list);
		list.add("mi");
		list.add("fr");
		
		System.out.println("B. list: " + list); // [mo, mi, fr]
		
		/*
		 * boolean remove(Object) // Sucht und loscht das Element
		 */
		result = list.remove("so");
		System.out.println("remove(\"so\"): " + result); // false (so war nicht in der Liste)
		
		result = list.remove("fr");
		System.out.println("remove(\"so\"): " + result); // true (fr gefunde und entfertnt)
		
		System.out.println("C. list: " + list); // [mo, mi]
		
//		a1();
		
		/*
		 * Operation mit index
		 */
		
		/*
		 * void add(int index, E element)
		 */
		list.add(1, "di");
		System.out.println("D. list: " + list); // [mo, di, mi]
		
		/*
		 * E remove(int index)
		 */
		String element = list.remove(0);
		System.out.println("remove(0): " + element);
		System.out.println("E. list: " + list); // [di, mi]
		
//		list.add(-1, "mo"); // IndexOutOfBound int x < 0
		
		list.add(0, "mo");
		list.add(list.size(), "do");
		System.out.println("F. list: " + list); // [mo, di, mi, mo]
		
		/*
		 * E set(int index, E element)
		 */
		String str = list.set(0, "Montag"); // return the element previously at the specified position
		System.out.println(str);
		System.out.println("G. list: " + list); // [Montag, di, mi, mo]
		
		/*
		 * E get(int index)
		 */
		System.out.println("list.get(1): " + list.get(1));
		
		/*
		 * int indexOf(Object)
		 * int lastIndexOf(Object)
		 */
		list.add(1, "mi");
		System.out.println("H. list: " + list); // [Montag, mi, di, mi, do]
		
		System.out.println("indexOf(Object): " + list.indexOf("mi")); // 1
		System.out.println("lastIndexOf(Object): " + list.lastIndexOf("mi")); // 3
		
	} // end of main
	
	
	
	static void a1() {
		System.out.println("************ A1************");
		ArrayList<String> list = new ArrayList<String>();
//		arr2.add("mo");
//		arr2.add("fr");
//		arr2.add("di");
//		arr2.add("fr");
//		arr2.add("mi");
//		arr2.add("fr");
//		arr2.add("do");
//		arr2.add("fr");
		
		List<String> newArr = Arrays.asList("mo","fr","di","fr","mi","fr","do","fr");
		
		list.addAll(newArr);
		
		System.out.println(list);
		
		while (list.remove("fr")) {
			System.out.println("while: " + list);
		}
	}
	
}
