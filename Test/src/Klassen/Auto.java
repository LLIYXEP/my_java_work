package Klassen;

public class Auto {
	String model;
	int speed;
	
	static void printAutoInfo(Auto auto) {
		System.out.println("Model "+ auto.model + "--- Speed " + auto.speed);
	}
	
	void printAutoInfo(int s , String m) {
		this.model = m;
		this.speed = s;
		System.out.println("Model " + this.model + "--- Speed " + this.speed);
	}
}
