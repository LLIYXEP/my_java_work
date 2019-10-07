package vererbung;

/*
 *  Basisklasse Fahrzeug
 */
class Fahrzeuge{
	private String hersteller, model;
	
	public String getModel() {
		return model;
	}
	
	@Override
	public String toString() {
		return hersteller + " " + model;
	}

	public Fahrzeuge(String hersteller, String model) {
		super();
		this.hersteller = hersteller;
		this.model = model;
	}
	
	
}

/*
 *  Abgeleitete Klasse PKW
 */
class PKW extends Fahrzeuge{

	void automatischEinparken() {
		System.out.println("Wird automatisch eingeparkt!");
	}
	

	public PKW(String hersteller, String model) {
		super(hersteller, model);
//		this.hersteller = hersteller;
//		this.model = model;
	}
	
	
}

/*
 *  Abgeleitete Klasse LKW
 */
class LKW extends Fahrzeuge{
	private int last;

	public LKW(String hersteller, String model) {
		super(hersteller, model);
//		this.hersteller = hersteller;
//		this.model = model;
	}
	
	void beladen(int last) {
		this.last = last;
		System.out.println(this.last);
	}
}

/*
 *  Aufgabe 1
 */

public class B01_extends_fur_IS_A_Beziehung {
	public static void main(String[] args) {
		
		PKW pkw = new PKW("Opel", "Corsa");
		System.out.println("pkw : " + pkw);
		System.out.println("Model von pkw : " + pkw.getModel());
		
		pkw.automatischEinparken();
		
		System.out.println();
		
		LKW lkw = new LKW("MAN", "M1");
		System.out.println("lkw : " + lkw);
		System.out.println("Model von lkw : " + lkw.getModel());
		
		lkw.beladen(20);
		
//		PKW var = new LKW("MAN", "M2");
//		var.automatischEinparken();
		
//		LKW var2 = new PKW("Opel", "Insignia");
//		var2.beladen(30);
		
	}

}
