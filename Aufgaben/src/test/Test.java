package test;

class  Animal{
	int x = 1;
	
	public void m1() {
		System.out.println(x);
	}
}

class Dog {
	
}

public class Test {
	
	static int x = 2;
	
	public void m1() {
		x += 1;
	}
	
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		
		animal.m1();
		
		Test dog = new Test();
		System.out.println(x);
		dog.m1();
		System.out.println(x);
		dog.m1();
		System.out.println(x);
	}
}


