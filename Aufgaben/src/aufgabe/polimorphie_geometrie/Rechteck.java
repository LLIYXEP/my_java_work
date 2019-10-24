package aufgabe.polimorphie_geometrie;

public class Rechteck extends Figure {
	int breite, hoehe;

	public Rechteck(int x, int y, int breite, int hoehe) {
		super(x, y);
		this.breite = breite;
		this.hoehe = hoehe;
	}

	@Override
	public String toString() {
		return "Rechteck breite = " + breite + ", hoehe = " + hoehe + " Coordinaten" + getCoordinaten();
	}
	
	public void getFlaeche() {
		System.out.println(breite * hoehe);
	}
	
}
