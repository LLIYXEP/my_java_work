package aufgabeGeometriceInterfaces;

public class Kreis implements Figur {
	private int radius;
	

	public Kreis(int radius) {
		super();
		this.radius = radius;
	}


	
	
	@Override
	public String toString() {
		return "Kreis [radius=" + radius + "]";
	}




	@Override
	public double getFlaeche() {
		System.out.println("Kreis radius = " + Math.PI * radius*radius);
		return Math.PI * radius*radius;
	}
}
