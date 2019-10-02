package methoden;

public class WdhVarargs {
	public static void main(String[] args) {
		int[] a = {};
		
		m1(a);
		
		int[] b = {};
		
		m1(a,b);
		
		//int[]... c = {}; //CF
		
		int[] c[] = {a , b};
		
		m1(c);
	}
	
	static void m1(int[]... x) {
		
	}
	
}
