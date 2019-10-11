package geometrie_polymorphie;

public class Kreis extends Figur {
	
	private int radius;

	public Kreis(int radius) {
		super();
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "Kreis radius: " + radius +  ". Koord.: " + getDisplayKoordinaten();
	}
	
	public double getFlaeche() {
		return (Math.PI * (radius * radius));
	}
	
}
