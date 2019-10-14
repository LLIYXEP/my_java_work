package kleaineAufgabePolymorphie;

public class KleaineAufgabePlymorphie {
	
	static abstract class IntOperation{
		int x;
		
		abstract int execute(int x);
		
		IntOperation andThen(IntOperation secondOperation) {
			return new TwoOperations(this, secondOperation);
		}
		
	}
	
	static class TwoOperations extends IntOperation{
		private IntOperation firstOperation;
		private IntOperation secondOperation;
		
		public TwoOperations(IntOperation firstOperation, IntOperation secondOperation) {
			super();
			this.firstOperation = firstOperation;
			this.secondOperation = secondOperation;
		}

		@Override
		int execute(int x) {
			int y  = firstOperation.execute(x);
			return secondOperation.execute(y);
		}
	}
	
	static class AddOne extends IntOperation{

		@Override
		int execute(int x) {
			if (x > 0) {
				return x + 1;
			} else {
				return x = x * (-1) + 1;
			}
		}

		
	}
	
	static class Multiply extends IntOperation{
		private int factor;
		
		public Multiply(int factor) {
			this.factor = factor;
		}

		@Override
		int execute(int x) {
			return x * factor;
		}


	}
	
	static class Change extends IntOperation{
		int execute(int x) {
			if(x > 0) {
				return -x;
			} else {
				return x *= -1;
			}
		}


	}
	
	static class Subtract extends IntOperation{
		private int value;
		
		public Subtract(int value) {
			this.value = value;
		}

		@Override
		int execute(int x) {
			return x - value;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		IntOperation op1 = new AddOne();
		IntOperation op2 = new Change();
		
		int x = 5;
		
		x = op1.execute(x);
		System.out.println("x = " + x); // 6
		
		x = op2.execute(x);
		System.out.println("x = " + x); // -6
		
		x = 2;
		
		IntOperation[] arr = {
				new AddOne(), 
				new Change(),
				new Multiply(4),
				new Subtract(7),
				};
		
		for (IntOperation op : arr) {
			x = op.execute(x);
		}
		
		System.out.println("x= " + x);
	
		
		IntOperation op = new AddOne()
				.andThen(new Change())
				.andThen(new Multiply(4))
				.andThen(new Subtract(7));
		
		int result = op.execute(2);
		System.out.println("Result: " + result);
		
		
	} // End of Main

}
