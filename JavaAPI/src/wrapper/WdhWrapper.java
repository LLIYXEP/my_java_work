package wrapper;

public class WdhWrapper {
	
	static int getA() {
		return Integer.valueOf(12);
	}
	
	static void test01() {
		Integer a = getA();
		Integer b = (int)getA();
		Integer c = (Integer)getA();
		int d = (int)getA();
		Object f = getA();
		Number e = getA();
		int l3 = 12;
//		Long l = getA();
		Long l = (long)getA();
	}
	
	/*
	 * Test 2
	 */
	
	static class Foo{
		int a;
		Integer b; // null
		
		Foo(int x){
			a = x + b;
		}

		@Override
		public String toString() {
			return String.valueOf(a); // int.value
		}

		public Integer getB() {
			return b;
		}
		
		
		
	}

	public static void main(String[] args) {
		
		System.out.println(new Foo(3));
		
	}
	
}
