package Arrays;

public class Arr10_VarArgs_Methoden {
	
	static void m1(int x, boolean... p1) {};
	
	public static void main(String[] args) {
		
		System.out.println(sum());
		System.out.println(sum(2));
		
		System.out.println(sum(2, 3));
		System.out.println(sum(new int[] {2,3}));
		
		System.out.println(sum(2, 3, 4));
		System.out.println(sum(2, 3, 4, 5));
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println(sum(arr));
		
	} // end of main
	
//	static int sum(int a, int b) {
//		return a + b;
//	}
//	
//	static int sum(int a, int b, int c) {
//		return a + b + c;
//	}
//	
//	static int sum(int a, int b, int c, int d) {
//		return a + b + c + d;
//	}
	
	static int sum(int... arr) {
		int result = 0;
		
		for (int x : arr) {
			result += x;
		}
		
		return result;
	}
	
//	static int sum(int[] arr) {
//		int result = 0;
//		
//		for (int x : arr) {
//			result += x;
//		}
//		
//		return result;
//	}
	
	
}
