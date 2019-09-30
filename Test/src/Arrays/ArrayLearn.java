package Arrays;

public class ArrayLearn {
	public static void main(String[] args) {
		int[][] a1;
		int[] a2[];
		int a3[][];
		
		a1 = new int[2][];
		a2 = new int[2][];
		a3 = new int[2][];
		
		a3[0] = new int[2];
		a3[0][0] = 77;
		
		int [] arrA, arrB[], arrC[][];
		
		arrA = new int[2];
		arrB = new int[2][];
		arrC = new int[2][2][];
		
		arrB[0] = arrA;
		arrC[0] = arrB;
		
		int[] x = m1();
		int[] y = m2();
	}
	
	static int[] m1(){
		return null;
	}
	static int[] m2(){
		return null;
	}
}
