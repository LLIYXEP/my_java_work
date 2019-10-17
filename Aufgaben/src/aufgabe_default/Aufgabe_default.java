package aufgabe_default;

public class Aufgabe_default {
	
	public interface Sum {
		default int add(int a, int b) {
			 return a + b;
		}

	}
		
	public interface Container {
		   /* 
		    * Speichert x im Container.
		    * Liefert die neue Containergröße zurück.asasasas
		    */
		int add(int x);
		   
		   /*
		    * Überladen. 
		    * Speichert im Container x, danach y.
		    * Liefert die neue Containergröße zurück.
		    */
		default int add(int x, int y) {
			return 5 + 9;
		}
	}
	
	static class Default implements Sum, Container{

		@Override
		public int add(int x) {
			return 0;
		}

		@Override
		public int add(int x, int y) {
			return Sum.super.add(x, y);
		}
		
		
	}

	public static void main(String[] args) {
		
		Sum sum = new Default();
		System.out.println(sum.add(7, 18));
		
	}
	
}
