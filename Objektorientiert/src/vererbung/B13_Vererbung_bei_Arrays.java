package vererbung;

public class B13_Vererbung_bei_Arrays {

static class Person{};
static class Teil extends Person{};
static class Doz extends Person{};

	public static void main(String[] args) {
		
		int [] a1 = { 1, 2, 3};
		
//		long[] a2 = a1; // CF - keine IS A - Beziehung
//		Object[] a2 = a1; // CF - keine IS A - Beziehung
		
//		float[] a3 = {1, 2, 3};
//		print(a3);
		
//		double[] a4 = {1.1, 2.2, 3.3};
//		print(a4);
		
//		Object[] obj = {a3, a4};
//		print2(obj);
		
		Person[] arrPerson1 = new Person[2];
		Object[] arrObj = {new Person(), new Doz(), new Teil()};
		
		print2(arrObj);
		print2(arrPerson1);
		print2(new String[] {"mo", "di", "fr"});
	}
	
	static void print2(Object[] arr) {
		System.out.println("*****Object");
		
		for (Object object : arr) {
			System.out.println(object);
		}
	}
	
	// Aufgabe 1

	static void print(Object obj) {
		if (obj instanceof float[]) {
			System.out.println("********Float");
			float[] arr = (float[]) obj;
			for (float f : arr) {
				System.out.println(f);
			}
		} else if (obj instanceof double[]) {
			System.out.println("********Double");
			double[] arr = (double[]) obj;
			for (double d : arr) {
				System.out.println(d);
			}
		} else {
			System.out.println("Keine float und double");
		}
	}
	
	
	
	
}
