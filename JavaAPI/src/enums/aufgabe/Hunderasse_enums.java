package enums.aufgabe;

enum Hunderassen {
	DACKEL(0.5), COLLIE, DOGGE(1.5);
	
	private Hunderassen() {}
	
	private double maxGroesse = 1;

	private Hunderassen(double maxGroesse) {
		this.maxGroesse = maxGroesse;
	}

	public double getMaxGroesse() {
		return maxGroesse;
	}

	@Override
	public String toString() {
		String name = name().charAt(0) + name().substring(1).toLowerCase();
		return name + ", max. Groesse: "+ maxGroesse;
	}
}

public class Hunderasse_enums {

	public static void main(String[] args) {
		
		Hunderassen r1 = Hunderassen.DACKEL;
		System.out.println(r1);
		
		System.out.println("*** Alle Hunderassen ***");
		for (Hunderassen val : Hunderassen.values()) {
			System.out.println(val);
		}

		
	}
	
}
