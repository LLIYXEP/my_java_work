package Arrays;

public class Array08MaehrDim {
	public static void main(String[] args) {
		int[][] arr = new int[2][];
		
		arr[0] = new int[] {0,77,0};
	
		int[] tmp = {1,2,3,4,5};
		
		arr[1] = tmp;
		
		
		
		
		for (int i = 0; i < arr.length; i++) {
			int var[] = arr[i];
			for (int j = 0; j < var.length; j++) {
				System.out.print(var[j]);
//				int x = arr[i][j];
			}
			System.out.println();
		}
		
		
		
//		FOR
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
//		FOREACH
		
		for (int[] i : arr) {
			int[] arr1 = i;
			for (int j : arr1) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
}
