package functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class B10_Predicate_und_ArrayList {
	
	static class IsNegative implements Predicate<Integer>{

		@Override
		public boolean test(Integer x) {
			return x < 0;
		}
		
	}

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(-3);
		list.add(55);
		list.add(-17);
		list.add(100);
		
		System.out.println("list: " + list);
		
		List<Integer> listCopy = new ArrayList<Integer>(list); 
		List<Integer> listCopy2 = new ArrayList<Integer>(list); 
		
		/*
		 * removeIf(Predicate)
		 */
		
		Predicate<Integer> filter = new IsNegative();
		listCopy.removeIf(filter);
		System.out.println("listCopy: " + listCopy);
		
		list.removeIf(x -> x > 0);
		System.out.println("list nach remove: " + list);
		
		System.out.println("-------------------------");
		
		/*
		 * Predicates ableiten/kombinieren
		 */
		
		Predicate<Integer> isGerade = x -> x % 2 == 0;
		Predicate<Integer> isUngeradeA = x -> !isGerade.test(x);
		Predicate<Integer> isUngeradeB = isGerade.negate();
		
		System.out.println("ist 12 gerade: " + isGerade.test(12));
		System.out.println("ist 12 ungerad: " + isUngeradeA.test(12));
		System.out.println("ist 12 ungerad: " + isUngeradeB.test(12));
		System.out.println("ist 12 gerade: " + isGerade.negate().test(12));


		Predicate<Integer> isZero = x -> x == 0;
		Predicate<Integer> isUngeradeOderZero = isUngeradeA.or(isZero);
		System.out.println("ist 33 ungerade oder 0: "+ isUngeradeOderZero.test(33));
		System.out.println("ist 33 ungerade oder 0: "+ isUngeradeOderZero.test(0));
		System.out.println("ist 33 ungerade oder 0: "+ isUngeradeOderZero.test(-12));
		
		listCopy = new ArrayList<Integer>(listCopy2);
		listCopy.add(2 , 0);
		System.out.println(listCopy);
		listCopy.removeIf(isUngeradeOderZero);
		System.out.println(listCopy);
		
		/*
		 * Evtl. in einfachen Fragen: foreach(Consumer)
		 * 
		 * Z.B. alle Elemente einer ArrayList einem Consumer
		 */
		
		Consumer<Integer> action = element -> System.out.println(element);
		listCopy.forEach(action);
	}
	
}
