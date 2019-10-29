package functional;

public class B08_Lambda_Syntax_nochmal {
	
	interface Combiner{
		int combine(int a, int b);
	}
	
	static class Adder implements Combiner{
		@Override
		public int combine(int a, int b) {
			return a+b;
		}
	}


	public static void main(String[] args) {
		
		Combiner c1 = new Combiner(){

			@Override
			public int combine(int a, int b) {
				return a+b;
			}
			
		};
		
		System.out.println("c1: " + c1.combine(2, 3)); // 5
		
		Combiner c11 = new Adder();
		
		System.out.println("c11: " + c11.combine(2, 3)); // 5
		
		Combiner c2 = (a,b) -> a + b;
//		Combiner c2 = (a,b) -> {a + b};
		
		System.out.println("c2: " + c2.combine(2, 3)); // 5
		
	}
	
}
