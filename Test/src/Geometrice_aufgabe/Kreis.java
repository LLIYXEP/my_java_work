package Geometrice_aufgabe;

public class Kreis {
	public int radius;

	public Kreis(int radius) {
		super();
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "Kreis. R = " + this.radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}
