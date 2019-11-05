package enums;

import java.util.Arrays;

/*
 * Basisklasse einer Enum-Klasse extends Object
 * implements Comparable<E>, Serializable
 */

enum Element{
	
	WASSER(11),   // New Element("WASSER", 0, 11)
	FEUER(12),		// New Element("FEUER", 1, 12)
	LUFT(77) {		// New 'anonyme Klasse' ()
		@Override
		public String toString() {
			return "Luft ist luftig";	// Uberschreibt toString der Klasse Element speziell fur das Objekt LUFT
		}
	},			
	ERDE();			// New Element("ERDE", 3, 0)
	
	/*
	 * Statische Elemente wie in jeder Klasse
	 */
	public static Element[] valuesAbsteigend() {
		Element[] vals = values();
		Arrays.sort( vals, (e1,e2) -> e2.ordinal() - e1.ordinal() );
		return vals;
	}
	
	/*
	 * Objekt - Element wie in jeder Klasse
	 * Ausnahme: alle Konstruktoren sind immer private (auch implizit)
	 */
	private int x;

	//implizit private:
	private Element() {
		
	}
	
	private Element(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}

	@Override
	public String toString() {
		return name().toLowerCase() + ". x = " + x;
	}
} // end of element

class MyValue{
	static final MyValue V1 = new MyValue(){ // 'anonyme Klasse' extends MyValue
		@Override
		public String toString() {
			return "123";
		}
	};
	
	@Override
	public String toString() {
		return "My Value";
	}
}

public class B05_EigenerCodeInEnum {

	public static void main(String[] args) {
		
		for (Element e : Element.values()) {
			System.out.println(e.ordinal() + ". " + e);
		}
		
		System.out.println(new MyValue());
		System.out.println(MyValue.V1);
		
	}
	
}
