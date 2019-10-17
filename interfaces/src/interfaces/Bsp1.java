package interfaces;

/*
 * Interface kann als Basistyp eingesetz werden und trennt/verbindet Komponenten (Bsp 02)
 * 
 * Eine Klasse kann mehrere Interfaces realisieren (mehrfache Vererbung)
 */

public class Bsp1 {
	
	static class Elefant implements Runnable, Comparable<Elefant>{

		@Override
		public int compareTo(Elefant o) {
			return 0;
		}

		@Override
		public void run() {
		}
		
	}

	public static void main(String[] args) {
		
		//Elefant IS-A Runnable
		Runnable r1 = new Elefant();
		
		//Elefant IS-A Comparable
		Comparable<Elefant> c1 = new Elefant();
	}
	
}
