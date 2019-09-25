package Klassen;

import java.util.Random;

public class Rechteck {
	int id;
	int width;
	int height;
	
	public Rechteck() {
		this.height = new Random().nextInt(20) + 1;
		this.width = new Random().nextInt(20) + 1;
	}
	
	
	
	public int getWidth() {
		return width;
	}



	public void setWidth(int width) {
		this.width = width;
	}



	public int getHeight() {
		return height;
	}



	public void setHeight(int height) {
		this.height = height;
	}
	


	public String toString() {
		return this.id + ". Rechteck with size " + "(" + this.width + " X " + this.height + ")";
	}
	
	static void changeParameters(Rechteck recht, int h, int w) {
		recht.width = w;
		recht.height = h;
	}
	void changeParameters(int h, int w) {
		this.width = w;
		this.height = h;
	}
}
