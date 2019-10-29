package functional;

interface Tankbar{
	void tanken();
}

/*
 * Toplevel - Klasse
 */

class TopLevelAuto implements Tankbar{

	@Override
	public void tanken() {
		System.out.println("TopLevel");
	}	
}

public class B05_Lambda_Funktion {
	
	/*
	 * Innere (nested) - Klasse
	 */
	static class NestedAuto implements Tankbar{
		public void tanken() {
			System.out.println("Nested");
		}
	} // end of NestedAuto

	public static void main(String[] args) {
		
		Tankbar t1 = new TopLevelAuto();
		t1.tanken();
		
		Tankbar t2 = new NestedAuto();
		t2.tanken();
		
		/*
		 * Lokale Klasse
		 */
		class LocalAuto implements Tankbar{

			@Override
			public void tanken() {
				System.out.println("Lokal");
			}
		} // end of LocalAuto
		
		Tankbar t3 = new LocalAuto();
		t3.tanken();
		
		/*
		 * anonyme Klasse
		 */
		Tankbar t4 = new Tankbar() {
			public void tanken() {
				System.out.println("Anonym");
			}
		};
		t4.tanken();
		
		/*
		 * Lambda - Funktionen
		 */
		Tankbar t5 = () -> {System.out.println("Lambda");};
		t5.tanken();
		
	} // end of main
	
}
