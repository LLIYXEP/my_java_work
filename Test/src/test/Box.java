package test;

class Planet {
	String name;
	int x, y;
	
}

public class Box{
	
	public static void main(String[] args) {
		
		Planet p1 = new Planet();
		p1.name = "Erde";
		p1.x = 20;
		p1.y = 40;
		printPlanet(p1);
		movePlanet(p1, 200 , 2000);
		printPlanet(p1);
		
		Planet p2 = new Planet();
		p2.name = "Mars";
		p2.x = 30;
		p2.y = 50;
		printPlanet(p2);
		
	}
	
	static void printPlanet(Planet planet) {
		System.out.println("*****************");
		System.out.println("Planet " + planet.name + ", Koordinaten: " + planet.x + ", " + planet.y);
	}
	static void movePlanet(Planet planet, int newX, int newY) {
		planet.x = newX;
		planet.y = newY;
	}
}