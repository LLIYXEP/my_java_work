package methoden;

// Achtung ! Bitte in der Praxis nicht os oft uberladen

class SuperTier{}
class Tier extends SuperTier{}
class Hund extends Tier{}
class Katze extends Tier implements Lebewesen{}
interface Lebewesen{}

public class B11_Richtige_uberladene_finden {
	
	static void m() {System.out.println("no-args");}
//	static void m(long x) {System.out.println("long");}
//	static void m(int x) {System.out.println("int");}
//	static void m(float x) {System.out.println("float");}
//	static void m(int... x) {System.out.println("int...");}
//	static void m(float... x) {System.out.println("float...");}
//	static void m(Hund x) {System.out.println("Hund");}
//	static void m(Katze x) {System.out.println("Katze");}
//	static void m(Tier x) {System.out.println("Tier");} 
	static void m(Object x) {System.out.println("Object");}
//	static void m(SuperTier x) {System.out.println("SuperTier");}
//	static void m(Integer x) {System.out.println("Integer");}
//	static void m(Number x) {System.out.println("Number");}
//	static void m(Long x) {System.out.println("Long");}
	

	public static void main(String[] args) {
		
		Integer var = 1;
//		float var2 = 1.5f;
//		Hund var = null;
		m(var);
//		m(var2);
		
	} // End of main
	
	/*
	 * Compiler - Suche nach der richtigen augerufenen Methode bei primitiven Argumenten:
	 * 
	 * 1. Parametertyp exakt gleich dem Argument - Typ
	 * 
	 * 2. Widening nach der Liste:
	 * 		byte -> short -> int -> long -> float -> double
	 * 
	 * 3. Autoboxing vom Argument (auch Parameter-Basistypen nach dem Autoboxing passen)
	 * 
	 * X. Alle Suchschritte fur Varargs-Methoden durchfuren (bis einem Treffer)
	 */
	
	/*
	 * Compiler - Suche nach der richtigen augerufenen Methode bei Referenzen als Argumenten:
	 * 
	 * 1. Parametertyp exakt gleich dem Argument - Typ
	 * 
	 * 2. Basistyp-Parameter
	 * 		Hund -> Tier -> (SuperClass) -> Object
	 * 
	 *
	 */
	
}
