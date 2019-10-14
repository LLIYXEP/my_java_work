package aufgabe_polimorphie_geometrie;

public class Kreis extends Figure{
	int radius;


	public Kreis(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}


	@Override
	public String toString() {
		return "Kreis radius = " + radius + " Coordinaten" + getCoordinaten();
	}
	
	public void getFlaeche() {
		System.out.println(Math.PI * (radius * radius));
	}
	
}
