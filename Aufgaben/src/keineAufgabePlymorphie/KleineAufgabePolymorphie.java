package keineAufgabePlymorphie;

public class KleineAufgabePolymorphie {
	
	static abstract class IntOperation{
		int x;
		
		abstract int execute(int x);
	}
	
	static class AddOne extends IntOperation{

		@Override
		int execute(int x) {
			return x += 1;
		}
		
	}
	
	static class Negate extends IntOperation{
		
		@Override
		int execute(int x) {
			return x = (-x);
		}
		
	}
	
	static class Multiple extends IntOperation{
		
		@Override
		int execute(int x) {
			return x *= 2;
		}
		
	}
	
	static class MinusZwei extends IntOperation{
		
		@Override
		int execute(int x) {
			return x *= (-2);
		}
		
	}

	public static void main(String[] args) {
		
		/*
		 * A1.
		 */
		IntOperation op1 = new AddOne(); // Eine Einz addieren
		IntOperation op2 = new Negate(); // Vorzeichen umkehren
		IntOperation op3 = new Multiple(); // Vorzeichen umkehren
		IntOperation op4 = new MinusZwei(); // Vorzeichen umkehren
		
		IntOperation[] arr = new IntOperation[4];
		arr[0] = op1;
		arr[1] = op2;
		arr[2] = op3;
		arr[3] = op4;
		
		
		run(arr, 5);
		
		
		
		
	}
	
	static void run(IntOperation[] arr, int x) {
		for (int i = 0; i < arr.length; i++) {
			 x = arr[i].execute(x);
			System.out.println("x = " + x);
		}
	}
	
}
