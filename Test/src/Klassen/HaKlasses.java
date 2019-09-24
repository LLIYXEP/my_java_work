package Klassen;


public class HaKlasses {
	public static void main(String[] args) {
		
		Rechteck test = new Rechteck();
		test.width = 100;
		test.height = 50;
		System.out.println(test.height + " -- " + test.width);
		test.setHeight(500);
		test.setWidth(200);
		System.out.println(test.height + " -- " + test.width);
		Rechteck.changeParameters(test, 10, 20);
		System.out.println(test.height + " -- " + test.width);
		test.changeParameters(100, 1000);
		System.out.println(test.height + " -- " + test.width);
		
		
//		for (int i = 0; i <= 100; i++) {
//			Rechteck recht = new Rechteck();
//			recht.id = i;
//			System.out.println(recht);
//		}
	}
}
