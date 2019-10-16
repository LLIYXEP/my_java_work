package interfaces;

/*
 * Alle Elemnete in einem Interface sind Public
 */

interface MyInterface{
	/*
	 * Deklarationen abstrakte Methoden
	 */
	void m1(); 				// impliziert auch: public abstract
	abstract void m2(); 	// impliziert auch noch: public
	public abstract void m3(); 
	
	/*
	 * default Definizionen der Instanzmethoden (auch immer public)
	 */
	default void m4() {		// implizit public
		System.out.println("m4. Definiert in einem Interface");
	}
	
	/*
	 * keine Object-Attribute (Instanz-Attribute, Felder)
	 */
	
	/*
	 * Statiche Konstatn (auch immer public)
	 */
//	int ATT0; // impliziert auch noch: public static final, CF muss manuell explizit initialisiert werden
	int ATT = 2; 				// impliziert auch noch: public static final
	static int ATT2 = 2; 		// impliziert auch noch: public final
	public int ATT3 = 2; 		// impliziert auch noch: static final
	public static int ATT4 = 2; // impliziert auch noch:  final
	
	/*
	 * Statische Methoden (auch public)
	 */
	static void m5() {   // implizit public
		System.out.println("m5. Statische Methode aus einem Interface");
	}
	
	/*
	 * Innere Typen (Nicht in der OCA - Prufung)
	 */
	class InnerClass{} // static public
}

interface ExamInterface{
	void m();
}

class ExamClass implements ExamInterface{
//	void m() {}; // CF: Sichtbarkeit verscharft
	public void m() {
	}
}

public class B04_ElementeEinesInterfaces {

	public static void main(String[] args) {
		
		ExamClass class1 = new ExamClass();
		
		
	}
	
}
