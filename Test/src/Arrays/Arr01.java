package Arrays;

public class Arr01 {
	public static void main(String[] args) {
		float[] a1 = new float[3];
		
		a1[1] = 1.0F;
		
//		System.out.println("---------------------");
//		
//		for (int i = 0; i < a1.length; i++) {
//			System.out.println(a1[i]);
//		}
//		
//		System.out.println("---------------------");
//		
//		for (float var : a1) {
//			System.out.println(var);
//		}
//		
//		System.out.println("---------------------");
//		
//		for (float f : a1) {
//			f = 7.0f;
//			System.out.println(f);
//		}
//		System.out.println("---------------------");
//		
//		System.out.println(a1[0]);
//		
//		System.out.println("---------------------");
		
//		int index = 0;
//		for (float f : a1) {
//			System.out.println("f = " +f);
//			System.out.println("a1[index] = " + a1[index]);
//			a1[index] = -5;
//			index++;
//		}
		
		boolean[] arr2 = new boolean[200];
		for (int i = 0; i < arr2.length; i++) {
			if (i % 2 == 0) {
				arr2[i] = true;
			}
			System.out.println(arr2[i]);
		}
		
		
	}
	
	
}
