package aufgaben;

import java.util.function.Function;

public class KleineAufgabeFunction {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f1 = a -> a*2;
		System.out.println(f1.apply(12));
	}
	
}
