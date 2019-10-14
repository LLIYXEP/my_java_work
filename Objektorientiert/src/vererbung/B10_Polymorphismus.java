package vererbung;

/* B10_Polymorphismus = Vielgestaltigkeit
 * 
 * Polymorphismus gibt es nur beim Aufruf einer Instanzmethode
*/
public class B10_Polymorphismus {
	
	static class Auto{
		void fahren() {
			System.out.println("Auto fahrt...");
		}
	}
	
	static class PKW extends Auto{
		void fahren() {
			System.out.println("PKW fahrt...");
		}
	}
	
	static class LKW extends Auto{
//		void fahren() {
//			System.out.println("LKW fahrt...");
//		}
	}

	public static void main(String[] args) {
		
		Auto a1 = new Auto();
		a1.fahren();  //polimorphischer Aufruf
		
		a1 = new PKW();
		a1.fahren();  //polimorphischer Aufruf
		
		System.out.println();  //polimorphischer Aufruf der println
		
		a1 = new LKW();
		a1.fahren();  //polimorphischer Aufruf
		
		
	}
	
}
