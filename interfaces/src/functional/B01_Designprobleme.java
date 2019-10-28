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
 * Design-Problem:
 * 		- Kein direktes Losen der Aufgabe: (Verlgleischlogik an die sort ubergeben)
 * 		- Damit wird immer ahnlicher Dienstcode notig: Klasse realisieren...
 * 		- Es entsteht eine weitere Klasse in der Anwedungsbibliothek (mehr Moglichkeiten fur Kopplung, mehr Namen zu berucksichten)
 */

class MyStringCmp implements Comparator<String>{
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
	}
}

public class B01_Designprobleme {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("abcdefgh");
		list.add("ab");
		list.add("aaaa");
		list.add("def");
		
		
		Collections.sort(list, new MyStringCmp());
		System.out.println(list);
		
		
	}
	
}
