package functional;

/*
 * Innere (nested) Klassen sind nicht in der Prufung
 */


class Buch {
	/*
	 * statische innere Klasse
	 */
	static class Seite {
		
		public void print() {
			Buch buch = new Buch("Harry Potter");
//			System.out.println(title); // CF - Wo ist das Buch?
			
			System.out.println(buch.title); // private , aber sichtbar in der Klasse Buch
		}
		
	}
	
	private String title;

	public Buch(String title) {
		super();
		this.title = title;
	}
	
	
} // end of buch


class Heft {
	/*
	 * Nichtstatische innere Klasse
	 */
	public class Seite{
		
		public void print() {
			System.out.println("Heft . Seite selbst: " + this);
			System.out.println("Heft . Seite kennt das Heft - Objekt: " + Heft.this);
			System.out.println("Heft . Seite kennt den Heft - Preis: " + price);
			System.out.println("Heft . Seite kennt den Heft - Preis: " + Heft.this.price);
		}
		
	} // end of Seite
	
	private int price;

	public Heft(int price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() {
		return "Heft [price=" + price + "]";
	}
	
}

public class B03_InnereKlassen {

	public static void main(String[] args) {
		
		Buch.Seite buchSeite = new Buch.Seite();
		buchSeite.print();
		
		Buch b1 = new Buch("Harry Potter");
//		System.out.println(b1.title);
		
//		Heft.Seite heftSeite = new Heft.Seite(); // Cf: keine Heft. Seite ohne Heft
		Heft heft = new Heft(22);
		
		Heft.Seite heftSeite = heft.new Seite();
		
		heftSeite.print();
		
	}
	
}
