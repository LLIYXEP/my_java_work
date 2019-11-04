package Klassen2;

class Hund{
	private String name;
	private int alter;
	private String besitzer;
	
	Hund(String name, int alter){
		this(name, alter, "Kein");
	}
	
	Hund(String name, int alter , String besitzer){
		this.alter = alter;
		this.name = name;
		this.besitzer = besitzer;
	}
	
	public String toString() {
		return "Name - " + this.name + ". Alter - " + this.alter + ". Besitzer - " + this.besitzer;
	}
	
	@Override
	public boolean equals(Object param) {
		Hund hund = (Hund)param;
		
		return this.name.equals(hund.name) && alter == hund.alter && this.besitzer.equals(hund.besitzer);
	}
}

public class EqualsChange {
	public static void main(String[] args) {
		Hund hund1 = new Hund("Bem", 10, "Pedro");
		Hund hund2 = new Hund("Bem", 10, "Pedro");
		
		System.out.println(hund1);
		System.out.println("-----------------------------");
		System.out.println(hund2);
		System.out.println("-----------------------------");
		
		System.out.println(hund1 == hund2);
		System.out.println("-----------------------------");
		
		boolean result = hund1.equals(hund2);
		System.out.println(result);
		System.out.println("-----------------------------");
		

	}
}
