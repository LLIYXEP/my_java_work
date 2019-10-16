package sort_search;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class B03_AlternativeVergleicheMitDemComparator {
	
	static class MyStringReverseComparator implements Comparator<String>{

		@Override
		public int compare(String s1, String s2) {
			return s2.compareTo(s1); //reihenfolge der Parameter geandert
		}
		
	}

	public static void main(String[] args) {
		
		String s1 = "aaaa";
		String s2 = "dddd";
		
		int result = s1.compareTo(s2); // naturliche vergleich
		
		System.out.println("1: " + result);
		
		String[] array = {
				s2,s1,"hallo"
		};
		
		/*
		 * sort vergleicht nur vergleichbare (Comparable) Elemnete untereinander
		 * 
		 * sort(Object[])
		 */
		
		Arrays.sort(array); // Naturlich aufteigends Sortieren
		
		System.out.println("2. " + Arrays.toString(array));
		
		/*
		 * Andere sort vergleaicht die Elemente mithilfe des Comparators
		 * 
		 * sort(T[], java.util.Comparator<T>)
		 */
		
		Comparator cmp = new MyStringReverseComparator();
		
		result = cmp.compare(s1, s2);
		System.out.println("3 " + result);
		
		Arrays.sort(array,cmp);
		
		System.out.println("3. " + Arrays.toString(array));
		
		/*
		 * Andere sort: 
		 */
		Arrays.sort(array, Collections.reverseOrder());
		
		System.out.println("4. " + Arrays.toString(array));
	}
	
}
