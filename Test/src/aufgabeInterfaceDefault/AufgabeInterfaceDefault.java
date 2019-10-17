package aufgabeInterfaceDefault;

interface Sum {
	   default int add(int a, int b) {
		   return a + b;
	   };
	}
	
interface Container {
	   /* 
	    * Speichert x im Container.
	    * Liefert die neue Containergröße zurück.
	    */
	   int add(int x);
	   
	   
	   /*
	    * Überladen. 
	    * Speichert im Container x, danach y.
	    * Liefert die neue Containergröße zurück.
	    */
	   default int add(int x, int y) {
		   add(x);
		   return add(y);
	   }
	   
}

class MySumContainer implements Sum, Container{

	@Override
	public int add(int x) {
		return 0;
	}

	@Override
	public int add(int x, int y) {
		return Container.super.add(x, y);
	}
	
}

public class AufgabeInterfaceDefault {

	public static void main(String[] args) {
		
		System.out.println(new MySumContainer().add(2, 3));
		
	}
	
}
