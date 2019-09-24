package Klassen;

class Hund{
	String name;
	int alter;
	
	
	void setAlter(int alter) {
		this.alter = alter;
	}
	
	public int getAlter() {
		return alter;
	}

	public String toString() {
		return name + " " + alter;
	}
}

public class This {
	public static void main(String[] args) {
		Hund h1 = new Hund();
		h1.name = "rex";
		h1.alter = 22;
		System.out.println(h1.alter);
		h1.setAlter(55);
		System.out.println(h1);
		
		Hund h2 = new Hund();
		System.out.println(h2);
		h2.setAlter(6);
		System.out.println(h2);
	}
}
