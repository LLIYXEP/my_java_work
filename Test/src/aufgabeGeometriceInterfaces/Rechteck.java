package aufgabeGeometriceInterfaces;

public class Rechteck implements Figur {
	private int breite;
	private int hoehe;
	
	
	
	public Rechteck(int breite, int hoehe) {
		super();
		this.breite = breite;
		this.hoehe = hoehe;
	}

	


	@Override
	public String toString() {
		return "Rechteck [breite=" + breite + ", hoehe=" + hoehe + "]";
	}




	@Override
	public double getFlaeche() {
		System.out.println("Rechteck flaeche = " + breite*hoehe);
		return breite*hoehe;
	}
}
