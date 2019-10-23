package wrapper;

import java.util.Arrays;

public class B04_Autoboxing_nochmal {

	public static void main(String[] args) {
		
		
//		System.out.println(1200.toString()); // CF - primitive
//		System.out.println(1200.getClass()); // CF - primitive
		
		int var1 = 1200;
//		System.out.println(var1.getClass()); // CF - primitive
		
		Integer var2 = new Integer(1200);
		System.out.println(var2.toString());  // 1200
		System.out.println(var2.getClass().getName()); // java.lang.Integer
		System.out.println("var2.intValue(): " + var2.intValue()); // return int value
		
		Integer var3 = Integer.valueOf(1300);
		System.out.println(var3.toString());  // 1300
		System.out.println(var3.getClass().getName()); // java.lang.Integer
		System.out.println("var3.intValue(): " + var3.intValue()); // return int value
		
		Integer var4 = 1400;
		System.out.println(var4.toString());  // 1400
		System.out.println(var4.getClass().getName()); // java.lang.Integer
		System.out.println("var3.intValue(): " + var4.intValue()); // return int value
		
		int var5 = var4.intValue();
		System.out.println("var5 = " + var5);
		
		int var6 = var4;	// Autounboxing var4.intValue()
		System.out.println("var6 = " + var5);
		
		Integer var7 = null;
//		int var18 = var7; // Autounboxing - var7.intValue(); - NullPointerException
		
		System.out.println("--------------------------------------------");
		
		double var8 = 22.45;
		Double var9 = var8; // Autoboxing Double.valueOf(var8)
		
		Integer var10 = 3000; // Autoboxing Integer.valueOf(3000)
		
		var10++;
		
		/*
		 * Inkrementieren
		 * 
		 * var10 = var10 + 1;
		 * 
		 * 1. Autounboxing: var10.intValue()
		 * 2. Zwei primitive addieren: 3000 + 1 -> 3001
		 * 3. Autoboxing von Ergebnis: Integer.valueOf(3001)
		 * 4. Referenzenzuweisung
		 * 
		 * var10  = Integer.valueOf(var10.intValue() + 1);
		 */
		
		System.out.println("var10 = " + var10);
		
		System.out.println("--------------------------------------------");
		
		float f1 = 13f;
		
		Float f2 = 13.5f;
		
		System.out.println("f1 < f2 " + (f1 < f2)); // Autounboxing von f2
		
		int i1 = 12;
		
		System.out.println("f1 < i1 " + (f1 < i1)); // Vergleich von primitiven
		
		System.out.println("f2 < i1 " + (f2 < i1)); // Vergleich von primitiven (nach dem Autounboxing)
		
		/*
		 * Achtung!
		 * 
		 * Es gibt den Operator '<' nut fur primitive, ABER
		 *  - den Operator '==' gibt es sowohl fur primitive als auch fur Referenzen
		 *  
		 *  - Java ist eine OO-Sprache: Beim == oder != Vergleich zwei referenzen bleibt es immer beim
		 *   Referenzvergleich
		 *  
		 *  - Unboxing wird bevorzugt, wenn es entweder Unboxing oder Boxing notig ist
		 */
		
		System.out.println("f1 == f2 " + (f1 == f2)); // Autounboxing und vergleich der primitiven
		 
		System.out.println("i1 == f2 " + (i1 == f2));  // Autounboxing und vergleich der primitiven
		
		Integer i2 = 13;
		
//		System.out.println(i2 == f2); // Referenzvergleich zwei Gechwistertypen-Referenzen
		System.out.println("i2 == f2 " + (i2 < f2));  // Autounboxing und vergleich der primitiven
		
		Number n2 = 12f;
		System.out.println("n2 == f2 " + (n2 == f2)); // Referenzvergleich 
		
		System.out.println("--------------------------------------------");
		
		Object obj = 12; // Autoboxing zu Integer
		System.out.println("Typ des Objects hinter obj: " + obj.getClass().getSimpleName());	//Integer
		
		Object[] arr = {
				17,  // Integer.valueOf(12)
				13f, // Float.valueOf(13f)
				14d, // Double.valueOf(14d)
				15L  // Long.valueOf(15L)
				};
		
		System.out.println("Object auf Pos. 0 im Array: " + arr[0].getClass().getSimpleName());
		System.out.println("Object auf Pos. 2 im Array: " + arr[2].getClass().getSimpleName());	
		
//		Arrays.sort(arr); // ClassCastException
		

		
	}
	
}
