package aufgabe.polimorphie_geometrie;

public class Figure {
	int x, y;

	public Figure(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void bewegen(int newX, int newY) {
		this.x = newX;
		this.y = newY;
	}

	@Override
	public String toString() {
		return "Figure [x=" + x + ", y=" + y + "]";
	}
	
	public String getCoordinaten() {
		return " ( x = " + x + " , y = " + y + " )";
	}
	
	public void getFlaeche() {
		
	}
	
}
