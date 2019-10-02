package klassen;

/*
 * Wenn der GC aktiv wird, sammelt (loscht) er die Objekte auf derm Heap, zu dennen es keine Virbindung vom Stack oder mit statischen Referenzen gibt.
 * 
 * - Fur die Prufung: Klassenobjekte bleiben nach dem laden im Arbeitspeicher bis zum ende und werden nicht vom GC geloscht
 */

public class B12_GarbageCollector {
	public static void main(String[] args) {
		
//		Zeile A:  0 Objekte stehen dem GC zu verfugung
		
		args = null;
		
//		Zeile B:  1 Objekt steht dem GC zu verfugung
		
	}
}
