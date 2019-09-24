package tes2;

class Auto{
	String name;
	int power;
	int wheels;
	int year;
	int doors;
}

public class Work {
	public static void main(String[] args) {
		Auto auto = new Auto();
		showAuto(auto, "Audi", 185, 4, 2019, 2);
	}
	
	static void showAuto(Auto auto, String n, int p, int w, int y, int d) {
		auto.name = n;
		auto.power = p;
		auto.wheels = w;
		auto.year = y;
		auto.doors = d;
		System.out.println("Auto details " + auto.name+ ", " + auto.power+ ", " + auto.wheels+ ", " + auto.year+ ", " + auto.doors);
	}
}
