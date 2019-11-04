package aufgabe.matrix;

import java.util.Random;


public class IntMatrix {
	
//	Ros, Columns,max,return
	public static IntMatrix getRandomMatrix(int rows, int columns, int max) {
		IntMatrix m = new IntMatrix(rows, columns);
		
		Random random = new Random();
		
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < columns; col++) {
				int val = random.nextInt(max+1);
				m.values[row][col] = val;
//				m.set(row, col, 2);
			}
		}
		
		return m;
	}
	
	private int[][] values;
	
	public IntMatrix(int rows, int columns){
		//todo: Argumente uberprufen
		this.values = new int[rows][columns];
	}
	
	
	public IntMatrix(int rows, int columns, int initValue){
		//todo: Argumente uberprufen
		this(rows, columns);
		
		for (int row = 0; row < getCountRows(); row++) {
			for (int col = 0; col < getCountColumns(); col++) {
				values[row][col] = initValue;
			}
		}
	}
	
	
	public int getCountRows() {
		return values.length;
	}
	
	public int getCountColumns() {
		return values[0].length;
	}
	
	public int get(int row, int col) {
		return values[row][col];
	}
	
	public void set(int row, int col , int newValue) {
		values[row][col] = newValue;
	}
	

	@Override
		public boolean equals(Object obj) {     //Uberschreiben
		
		if ( !(obj instanceof IntMatrix) ) {
			return false;
		}
		
		IntMatrix m2 = (IntMatrix) obj;								//Uberladen
		return equals(m2);
	}
	
	public boolean equals(IntMatrix m2) { // Überladen der Methode mit der Signatur equals(Object)
		
		if(m2==null) {
			return false;
		}
		
		if( getCountRows() != m2.getCountRows() || getCountColumns() != m2.getCountColumns() ) {
			return false;
		}
	
		for (int row = 0; row < getCountRows(); row++) {
			for (int col = 0; col < getCountColumns(); col++) {
				if( get(row, col) != m2.get(row, col) ) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		
		String text = "";
		
//		text = text + values[0][0];
//		text = text + ", ";
//		text = text + values[0][1];
		
		for (int row = 0; row < getCountRows(); row++) {
			for (int col = 0; col < getCountColumns(); col++) {
				if (col == getCountColumns()-1) {
					text = text + values[row][col];
				}else {
					text = text + values[row][col] + ", ";
				}
				
			}
			text = text + '\n';
		}
		
		return text;
	}
}
