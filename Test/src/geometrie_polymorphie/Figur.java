package geometrie_polymorphie;

public abstract class Figur {
	private int x, y;

	public Figur() {
		super();
	}

	public Figur(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void bewegen(int newX, int newY) {
		this.x = newX;
		this.y = newY;
	}
	
	//Keinesinvolle Realisierungder Methode in dieser Klasse moglich
	
	public String getDisplayKoordinaten() {
		return "[" + x + ", " + y + "]";
	}
	
//	public double getFlaeche() {
//		return -1;
//	};
	
	public abstract double getFlaeche();
}
