package exceptions;

public class WdhVonWdh {
	
	static class Foo {
		void m() throws ArithmeticException {
			System.out.println(5/0);
		}
	}
	
	static class Bar extends Foo {
		void m( )  {
			try {
				super.m(); 
			} catch (Exception e) {
				System.out.println("a ");
			}
			
		}
	}

	public static void main(String[] args) {
		
		
		
		try {
			Foo foo = new Bar();
			foo.m(); // <- Polumorphischer Aufruf
			 
		} catch (Exception e) {
			System.out.println("b ");
		}
	}
	
}
