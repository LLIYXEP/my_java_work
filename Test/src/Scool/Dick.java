package Scool;

public class Dick {
	public static void main(String[] args) {
		Reader r= new Reader();
		r.scan();
		r.i = count(r.i);
		r.k = count(r.k);
		System.out.println("teperi va6e pervoe 4islo = " + r.i);
		System.out.println("teperi va6e vtoroe 4islo = " + r.k);
	}
	
	private static int count(int x) {
		x = x + 1;
		return x;
	}
}
