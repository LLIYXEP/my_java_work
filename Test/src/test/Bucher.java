package test;


class Buch{
	String name;
	int pages;
	
	
}

public class Bucher {
	public static void main(String[] args) {
		Buch buch = new Buch();
		countPages(buch, "Test", 1290);
	}
	
	static void countPages(Buch buch, String n, int p) {
		buch.name = n;
		buch.pages = p;
		System.out.println("Buch " + buch.name + " have - " + buch.pages);
	}
}


