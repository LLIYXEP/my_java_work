package Arrays;

public class Arr02 {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		
//		Variant 1
		
		arr1[0] = 12;
		arr1[1] = 13;
		arr1[2] = 14;
		
//		Variant 2
		
		int[] arr2 = {15, 16, 17};
		
//		Variant 3
		
		int[] arr3 = new int[] {18, 19, 20};
		
//		Unetrschiede
		
		int res = sum(arr1);
		int res2 = sum(arr2);
		int res3 = sum(arr3);
		
		System.out.println(res);
		System.out.println(res2);
		System.out.println(res3);
		
		int res4 = sum( new int[] {12,13,14});
		System.out.println(res4);
		
		System.out.println("-----------------");
		
		int[] arr5 = buidArray();
		System.out.println(arr5[0]);
		System.out.println("-----------------");
		
//		Unterschiede
		
		int[] arr6;
		 arr6 = new int[3];
//		 arr6 = {15, 16, 17}; Kann nicht so sein
		 arr6 = new int[] {18, 19, 20};
		
//		System.out.println(arr3[3]);
	}
	
	static int sum(int[] arr) {
		int result = 0;
				for (int i : arr) {
					result += i;
				}
		return result;
	}
	
	static int[] buidArray() {
		return new int[]{12,13,14};
	}
}
