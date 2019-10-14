package geometrie_polymorphie;

public class Rechteck extends Figur {
	
	private int breite;
	private int hoehe;
	
	public Rechteck(int breite, int hoehe) {
		super();
		this.breite = breite;
		this.hoehe = hoehe;
	}
	
	
	@Override
	public String toString() {
		return "Rechteck: " + breite + " X " + hoehe +  ". Koord.: " + getDisplayKoordinaten();
	}
	
	public double getFlaeche() {
		return breite * hoehe;
	}
	
}
