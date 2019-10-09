package vererbung;

import java.util.Random;

public class B06_Casting {
	
	static class Person{
		String name;
	}
	
	static class Dozent extends Person{
		int gehalt;
		
		@Override
		public String toString() {
			return "Dozent " + name + ", Gehalt: " + gehalt;
		}
		
	}

	public static void main(String[] args) {
		
		Person p1 = new Dozent();
		p1.name = "Tom";
		
//		p1.gehalt = 1200;
//		System.out.println(p1.gehalt);
		System.out.println(p1);
		
		
		Dozent d1 = (Dozent)p1;
		d1.gehalt = 1200;
		
		System.out.println(d1);
		System.out.println(p1);
		
//		p1 = new Person();
//		Dozent d2 = (Dozent)p1; //Exception
		
	} //end of main
	
}
