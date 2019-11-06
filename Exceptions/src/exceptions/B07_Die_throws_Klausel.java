package exceptions;

import java.io.IOException;

public class B07_Die_throws_Klausel {
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return Summe von a und b
	 * @throws IllegalArgumentException beim Integer - Overflow
	 */
	
	public static int add(int a, int b) throws IllegalArgumentException {
		long result = (long) a + b;
		
		if (result<Integer.MIN_VALUE || result>Integer.MAX_VALUE) {
			throw new IllegalArgumentException("Integer overflow");
		}
		
		return (int)result;
	}
	
	static void m1() {
		throw new NullPointerException();
	}
	
	static void m2() throws NullPointerException, Exception {
		
	}
	
//	static void m3() throws String { // CF: String ist nicht Throwable
//		
//	}
	


	public static void main(String[] args) {
		
		add(2, 3);
		add(0, Integer.MAX_VALUE);
		
	}
	
}
