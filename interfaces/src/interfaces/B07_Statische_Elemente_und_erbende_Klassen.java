package interfaces;

interface Laeufer{
	int MAX_DISTANZ = 100;
	
	static int getMaxDistanz() {
		return MAX_DISTANZ;
	}
}

class Person implements Laeufer{
	public static final int MAX_ALTER = 150;
	
	public static int getMaxAlter() {
		return MAX_ALTER;
	}
}

class Dozent extends Person{
	static void DozentTest() {
		System.out.println(Person.MAX_ALTER);
		System.out.println(MAX_ALTER);
		
		System.out.println(getMaxAlter());
//		System.out.println(getMaxDistanz()); // Statische nur fur Interface name
		System.out.println(Laeufer.getMaxDistanz()); // Statische nur fur Interface name
	}
}

public class B07_Statische_Elemente_und_erbende_Klassen {

	public static void main(String[] args) {
		
//		System.out.println("1: " + MAX_ALTER); // CF
		
		System.out.println("1: " + Person.MAX_ALTER);
		
		System.out.println("2: " + Dozent.MAX_ALTER);
		
		System.out.println("3: " + Laeufer.MAX_DISTANZ);
		
		System.out.println("4: " + Person.MAX_DISTANZ);
		
		System.out.println("*******************");
		/*
		 * 
		 */
		
		System.out.println("5: " + Person.getMaxAlter());
		System.out.println("6: " + Dozent.getMaxAlter());
		
		System.out.println("7: " + Laeufer.getMaxDistanz());
//		System.out.println("7: " + Person.getMaxDistanz()); // Statische Methode nur fur Interface
		
	}
	
}
