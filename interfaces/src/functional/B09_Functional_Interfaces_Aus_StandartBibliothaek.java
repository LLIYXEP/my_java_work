package functional;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class B09_Functional_Interfaces_Aus_StandartBibliothaek {

	public static void main(String[] args) {
		
		testPredicate();
		testConsumer();
		testSupplier();
		testFunction();
	}
	
	/*
	 * Achtung! Predicate ist sehr oft in der Prufung
	 */
	
	static void testPredicate() {
		
		System.out.println("***** Predicate *******");
		
		// Mit der anonyme Klasse
		Predicate<Integer> p1 = new Predicate<Integer>() {
			public boolean test(Integer value) {
				return value > 0;
			}
		};
		
		// Mit Lambda
		Predicate<Integer> p2 = value -> value > 0;
		System.out.println(p2.test(22));
	}
	
	/*
	 * Consumer ist unwarscheinlich in der Prufung
	 */
	static void testConsumer() {
		System.out.println("***** Consumer *******");
		
		// Mit der anonyme Klasse
		Consumer<String> c1 = new Consumer<String>() {

			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		};
		
		// Mit Lambda
		Consumer<String> c2 = s -> System.out.println(s);
		c2.accept("Mittwoch");
		
	} // end of testConsumer()
	
	
	/*
	 * Supplier ist nicht in der OCA-Prufung
	 */
	static void testSupplier() {
		System.out.println("***** Supplier *******");
		
		// Mit der anonyme Klasse
		Supplier<Double> s1 = new Supplier<Double>() {
			
			@Override
			public Double get() {
				return 22.67;
			}
		};
		
		// Mit Lambda
		Supplier<Double> s2 = () -> 22d;
		Double d1 = s2.get();
		System.out.println(d1);
		
	} // end of testSupplier()
	
	/*
	 * Function ist nicht in der OCA-Prufung
	 */
	static void testFunction() {
		System.out.println("***** Function *******");
		
		// Mit der anonyme Klasse
		Function<Integer, String> f1 = new Function<Integer, String>() {

			@Override
			public String apply(Integer t) {
				return "<" + t + ">";
			}

		};

		String str2 = f1.apply(12);
		System.out.println(str2);
		
		// Mit Lambda
		Function<Integer, String> f2 = i -> String.valueOf(i);
		String str = f2.apply(12);
		System.out.println(str);
	}  // end of testFunction()
	
}
