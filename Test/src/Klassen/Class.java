package test;

public class Class {
	public static void main(String[] args) {
		
		testGetFak(0,1);
		testGetFak(1,1);
		testGetFak(3,6);
		testGetFak(5,120);
		testGetFak(10,3_628_800);
		
			
	}
	
	
	static void testGetFak(int n, int expected) {
		int actual = getFak(n);
		
		if (actual == expected) {
			System.out.println("Bestanden fur n= " + n);
		} else {
			System.out.println("Nicht bestanden fur n= " + n + " Erwartet " + expected + " Actual " + actual);
		}
	}
	
	
	static int getFak(int n) {
		if (n == 0) {
			return 1;
		}
		return n * getFak(n - 1);
	}
	
}

