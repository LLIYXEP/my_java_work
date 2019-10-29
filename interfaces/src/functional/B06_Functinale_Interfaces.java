package functional;

/*
 * functional Interface: Interface mit nur einer astrakten Methode
 * 
 * Nur Funktionale Interfaces konnen mit Lambda-Funktionen realisiert werden
 * 
 * Die Annotation @FunctionalInterface muss nicht sein.
 */

interface I1{} // kein functionales Interface

interface I2{ // kein functionales Interface
	void m1();
	void m2();
} 
	
interface I3{ // functionales Interface
	void m1();
}

interface I4{ // functionales Interface
	void m1();
	default void m2() {};
}

interface I5 extends I4{} // functionales Interface

interface I6 extends I4{ // functionales Interface
	void m1();
} 

@FunctionalInterface // <- Compiler soll uberprufen ob es wirklisch ein funktionales Interface ist
interface I7{ // functionales Interface
	void m1();
//	void m2();
} 

//class c1 implements I3{
//	
//}

public class B06_Functinale_Interfaces {

	public static void main(String[] args) {
		
		I1 var0 = new I1() {}; // anonyme Klasse, Lambda geht nicht
		
		I3 var1 = () -> {};
		
		I4 var2 = () -> {};
		
		I5 var3 = () -> {};
		
		I6 var4 = () -> {};
		
		I7 var5 = () -> {};
		
		Runnable var6 = () -> {};
	}
	
}
