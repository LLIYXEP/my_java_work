package functional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * Situation: 
 * 		- Eine Komponente einbunden, die auf ein Interface programiert wurde 
 * 			Hier Collections.sort(List, Comparator) aufrufen, um besonders eine List zu sortieren
 * 
 * Dafur notig:
 * 		- Interface Comparator realisieren (eine neue Klass schreiben, compare-Methode implementrieren)
 * 		- Neues Objekt von der neuen Klasse erzeugen
 * 		- sort, aufrufen, die Referenz auf das neue Comparator ubergeben und mit dem Objekt auf die konkrete Realisierung der Merhode 'compare'
 * 
 * Design-Problem und losungen:
 * 
 * Problem 1:
 * 		- Kein direktes Losen der Aufgabe: (Verlgleischlogik an die sort ubergeben)
 * 		- Damit wird immer ahnlicher Dienstcode notig: Klasse realisieren...	
 * 
 * 	- Losung vor Java 8: anonyme Klassen
 *  - Losung nach Java 8: Lambda-Functionen (nur bei funktionallen Interfaces)
 * 
 * Problem 2: 
 * 		- Es entsteht eine weitere Klasse in der Anwedungsbibliothek (mehr Moglichkeiten fur Kopplung, mehr Namen zu berucksichten)
 * 
 *  - Losung: Klassen verstecken,(innere Klassen, Sichtberkeiten) Gultigkeitsbereich der Klassen reduzieren
 */

/*
 * Toplevel-Klasse - (Nicht so toll, wenn die Klassen nur innerhalb einer anderen Klasse verwendet wird)
 * 
 */

class TopLevelCmp implements Comparator<Integer>{
	@Override
	public int compare(Integer i1, Integer i2) {
		return i2 - i1;
	}
}

public class B02_Loesungswege_mit_Sprachmitteln {
	
	/*
	 * Innere Klasse
	 * besser als ToplevelKlasse, wenn die Comparator-Klasse nur innerhalb einer anderen Klasse (B02) verwendet wird
	 * gute Losung, wenn in mehreren Methoden der Ausseren Klasse die innere Klasse wiederverwendet wird
	 */
	private static class NestedCmp implements Comparator<Integer>{
		@Override
		public int compare(Integer i1, Integer i2) {
			return i2 - i1;
		}
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(13);
		list.add(22);
		list.add(-7);
		list.add(0);
		
		/*
		 * Toplevel-Klasse verwenden
		 */
//		Collections.sort(list, new TopLevelCmp());
		
		/*
		 * Innere-Klasse verwenden
		 */
//		Collections.sort(list, new NestedCmp());
		
		/*
		 * Lokale Klasse definieren : 
		 * - besser sogar als innere Klasse , wenn der Comparator nur in der main - Methode gultig ist
		 */
		class LocalCmp implements Comparator<Integer>{
			@Override
			public int compare(Integer i1, Integer i2) {
				return i2 - i1;
			}
		}
		
		/*
		 * Lokale Klasse verwenden: 
		 */
//		Collections.sort(list, new LocalCmp());
		
		
		/*
		 * Anonyme Klasse definieren und sofort verwenden
		 */
		Comparator<Integer> cmp = new Comparator<Integer>(){
			public int compare(Integer i1, Integer i2) {
				return i2 - i1;
			}
		};
	
//		Collections.sort(list, cmp);
		
		/*
		 * Nochmal Anonyme Klasse definieren und sofort verwenden
		 */	
	
//		Collections.sort(list, new Comparator<Integer>(){
//				public int compare(Integer i1, Integer i2) {
//			return i2 - i1;
//		}
//	});
		
		/*
		 * Das Problem mit unlesbaren anonymen Klassen sollen Lambda- Functiionen losen
		 */	
		
		Collections.sort(list, (i1,i2) -> i2 - i1);
		
		System.out.println(list);
		
	}
	
}
