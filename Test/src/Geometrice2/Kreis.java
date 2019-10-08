package Geometrice2;

public class Kreis extends Figur {
	private int radius;

	public Kreis(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Radius= " + radius + " . Koordinaten: [" + x + ", " + y + "]";
	}
	
	
}
