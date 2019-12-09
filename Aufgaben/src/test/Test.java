package test;

interface IFoo {
	void motorAn() {}	// A
	default void motorAus() {} // B
	private default void bremsen() {} // C
	final default void fahren() {} // D
}

class Bar implements IFoo {
    static void staticMethod2() { System.out.println("Bar.staticMethod2"); }
    private static void staticMethod3() { System.out.println("Bar.staticMethod3"); }
}

public class Test implements Comparable<Test> {
	
	

	public static void main(String[] args) {
		
		IFoo.staticMethod1();	// A
	    IFoo.staticMethod2();	// B
	    IFoo.staticMethod3();	// C
	    
	    Bar.staticMethod1();	// D
	    Bar.staticMethod2();	// E
	    
	    IFoo v1 = new Bar();
	    v1.staticMethod1();		// F
	    v1.staticMethod2();		// G
	    
	    Bar v2 = new Bar();
	    v2.staticMethod1();		// H
	    v2.staticMethod2();		// I
			
		
		
	}

	
	
}
