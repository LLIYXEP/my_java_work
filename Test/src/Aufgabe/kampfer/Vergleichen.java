package Klassen2;

class Blume{
	int preis;
	
	public Blume(int price) {
		this.preis = price;
	}
	
	public String toString(){
		return "Blume price " + preis;
	}
	
	public boolean equals(Object param) {
		Blume b2 = (Blume)param;
		
		return preis == b2.preis;
	}
}

public class Vergleichen {
	public static void main(String[] args) {
		Blume b1 = new Blume(12);
		Blume b2 = new Blume(12);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println("x == y " + (b1.preis == b2.preis));
		
		boolean result = b1.equals(b2);
		System.out.println(result);
		
		b1 = b2;
		System.out.println("x == y " + (b1.preis == b2.preis));
		System.out.println(b1);
		
		result = b1.equals(b2);
		System.out.println(result);
		
		
	}	
	
}
