package Person;

import java.util.Random;

public class IntMatrix {
	public static void main(String[] args) {
	
		IntMatrix m1 = new IntMatrix(2, 3);

		IntMatrix m2 = new IntMatrix(5, 3, 100);
		
		print(m1);
		System.out.println(m1);
		
//		IntMatrix m3 = IntMatrix.getRandomMatrix(4, 6, 200);
	}
	
	int rows;
	int columns;
	int number;
	
	public IntMatrix(int rows, int columns){
		this(rows,columns,0);
	}
	
	public IntMatrix(int rows, int columns, int number){
		this.rows = rows;
		this.columns = columns;
		this.number = number;
	}
	
	static void print(IntMatrix intMatrix) {
		int r = intMatrix.rows;
		int c = intMatrix.columns;
		int n = intMatrix.number;
		
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c-1; j++) {
				System.out.print(n + " ");
			}
			System.out.println(n);
		}
	}
	
	@Override
	public String toString() {
		
		int r = this.rows;
		int c = this.columns;
		int w = 0;
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns-1; j++) {
				System.out.print(w + ", ");
			}
			System.out.println(w);
		}
		
		return "Test";
	}
	
	public IntMatrix getRandomMatrix(int rows, int colums, int number) {
		Random random = new Random();
		int rand = random.nextInt(200);
		return new IntMatrix(rows, columns, rand);
	}
}
