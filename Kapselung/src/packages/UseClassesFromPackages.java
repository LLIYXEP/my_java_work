package packages; // <- fuhrt dazu, dass die Toplezeltypen dieser java-Datein in dem vollqualifizierten Namen auch den package -Namen beeinhalten

/*
 * package-Angabe ist immer die erste ubersetzbare Anweisung in der javas-Datei
 * 
 * import-Anweisungen , wenn es die gibt, stehen immer danach.
 * 
 * Und alle andere muss nach import-Anweisungen definiert werden
 */
import importe.p1.Utils;

import static java.lang.Math.PI;

class Auto { // <- heisst packages.Auto
	
} 



public class UseClassesFromPackages { // <- heisst packages.UseClassesFromPackages
	

	public static void main(String[] args) {
		
		Auto a1; // Der Compiler sucht nach dem Typ-Namen (Auto) zuerst in dem direkt umschlissenden Modul (Methode main)
					// dann eine Ebene hoher (Klasse UseClasseFromPackages)
					// dann im Package 'packages' (Treffer)
		
		Utils u; // Der Compiler sucht nach dem Typ-Namen (Auto) zuerst in dem direkt umschlissenden Modul (Methode main)
					// dann eine Ebene hoher (Klasse UseClasseFromPackages)
					// dann im Package 'packages' (Treffer)
					// dann in den import-Anweisungen (Treffer)
		
//		int PI = 2;
		System.out.println( PI ); // Der Compiler sucht nach dem Typ-Namen (Auto) zuerst in dem direkt umschlissenden Modul (Methode main)
									// dann eine Ebene hoher (Klasse UseClasseFromPackages)
									// dann im Package 'packages' (Treffer)
									// dann in den import-Anweisungen (Treffer)
		
		System.out.println("end of main Methode" + UseClassesFromPackages.class.getName());
	}
	
//	static String PI = "hallo";
	
}
