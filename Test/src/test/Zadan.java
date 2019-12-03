package test;

interface I1{
	default int a() {return 1;};
}
interface I2{
	default int a() {return 2;};
}

class Test{
	
}

public class Zadan extends Test implements I1, I2{

	public int a() {return 3;};

	public static void main(String[] args) {
		
		Zadan zadan = new Zadan();
		Test test = new Test();
		if (zadan instanceof Test) {
			System.out.println("dfdf");
		}
		
		
		
	}
	void go() {
		System.out.println(a());
	}
}
