package functional;


public class WdhLambdaSyntax {
	
	interface GetString{
		String get();
	}

	interface UseString{
		void use(String s);
	}
	
	class UseStringImpl implements UseString{

		@Override
		public void use(String s) {
			new String("halle");
		}
		
	}
	
	public static void main(String[] args) {
		
//		GetString g1 = () -> {return new String("Hello");};
//		GetString g2 = () -> new String("Hello");
//		GetString g3 = () -> { return "Hello";};
//		GetString g4 = () -> "Hello";
		
		UseString u1 = s -> {new String("Hello");};
		UseString u2 = s -> new String("Hello");
		UseString u3 = s -> s = "Hello";
		
		class PrintTwice implements UseString{
			public void use(String s) {
				System.out.println(s + s);
			}
		}
		
		UseString u5 = new PrintTwice();
		u5.use("di");
		
		UseString u6 = s -> System.out.println(s);
	}
	
}
