package Arrays;



public class PersonAufgabe {
	public static void main(String[] args) {
		
		int[][] arr = createArray(4,5);
		printArray(arr);
		
		System.out.println("--------------");
		
		arr[1][1] = 5;
		printArray(arr);
		
		System.out.println("--------------");
		
		setValue(arr, 2);
		
	}
	
	static int[][] createArray(int rows, int columns) {
		return new int[rows][columns];
	}
	
	static void printArray(int[][] arr) {
		for (int[] is : arr) {
			for (int is2 : is) {
				System.out.print(is2);
			}
			System.out.println();
		}
	}
	
	static void setValue(int[][] arr, int value) {
		for (int row = 0; row < arr.length; row++) {
			for (int column = 0; column < arr[row].length; column++) {
				arr[row][column] = value;
				if (column < arr[row].length - 1) {
					System.out.print(arr[row][column] + ", ");
				} else {
					System.out.print(arr[row][column]);
				}
			}
			System.out.println();
		}
	}
	
}
