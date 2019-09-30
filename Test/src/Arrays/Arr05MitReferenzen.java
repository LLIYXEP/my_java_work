package Arrays;

class Dozent{
	String vorname;
	String nachname;
}

public class Arr05MitReferenzen {
	public static void main(String[] args) {
		Dozent d1 = new Dozent();
		System.out.println(d1.nachname);
		
		String[] a1 = new String[2];
		System.out.println(a1[0]);
		
		d1.nachname = "Petrov";
		a1[1] = d1.nachname;
		
		System.out.println("*******1");
		System.out.println(d1.nachname);
		System.out.println(a1[1]);
		
		d1.nachname = "Scurtu";
		
		System.out.println("*******2");
		System.out.println(d1.nachname);
		System.out.println(a1[1]);
	}
}
