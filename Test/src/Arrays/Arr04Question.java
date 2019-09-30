package Arrays;



public class Arr04Question {
	public static void main(String[] args) {
	
		int[] a1 = {1,2,3};
		int[] a2 = {12,13,14};
		int[] a3 = add(a1, a2);
//		int[][] a4 = add2(a1,a2);
//		System.out.println("Array length " + a4.length);
		System.out.println("--------------");
		
//		for (int[] is : a4) {
//			for (int i : is) {
//				System.out.println(i);
//			}
//		}
		
		for (int i : a3) {
			System.out.println(i + " ");
		}
		
		
	}//end of main
	
	static int[] add(int[] a1, int[] a2) {
		int len = a1.length > a2.length ? a1.length : a2.length;
		
		
		int[] arr = new int[len];
		
		for (int i = 0; i < len; i++) {
			int x = a1.length <= i ? 0 : a1[i];
			int y = a2.length <= i ? 0 : a2[i];
			
			arr[i] = x + y;
		}
		
		return arr;
	}
	
	
	
	static int[][] add2(int[] a1, int[] a2) {
		return new int[][]{a1,a2};
	}
	
	
}

