package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * In der Prufung : nur die Klasse ArrayList, keine weiteren Collections
 */

public class B06_Array_asList_toArray {

	public static void main(String[] args) {
		
		/*
		 * List<T> Arrays.asList(T... arr)
		 * 
		 * Die asList liefert an das Array gekoppelte Liste. Jede Anderung im Array spiegelt sich auf die Liste ab und umgekehrt.
		 * Die Grosse der Liste kann nicht geandert werden
		 */
		
		Integer[] arr = {1, 2, 3};
		arr[0] = 77;
		
		List<Integer> list = Arrays.asList(arr); 
		arr[1] = 377;
		List<Integer> list2 = Arrays.asList(1 , 2, 3);
		
//		list.remove(0); // Exc  - Die Grosse der Arrays.asList Liste kann nicht geandert werden
		System.out.println(list); // [77, 377, 3]
		System.out.println(list2); // [1, 2, 3]
		
		List<Integer> list3 = new ArrayList<>(list2);
		list3.add(25);
		System.out.println(list3);
		
		/*
		 * Object[] toArray(); 
		 */
		Object[] arr3 = list3.toArray(); // Kein Integer[] !
		System.out.println("Typ von Object hinter arr3: " + arr3.getClass().getName());
		
//		Integer[] tmp = (Integer[]) arr3; // Classcastexc
		
		/*
		 * 
		 */
		Object[] arra4 = list3.toArray(new Object[0]);
		Integer[] arra5 = list3.toArray(new Integer[0]);
		
		for (Integer integer : arra5) {
			System.out.println(integer);
		}
	}
	
}
