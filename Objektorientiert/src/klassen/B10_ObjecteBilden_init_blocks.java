package klassen;
/*
 * - init Blocke - werden von Compiler in jeden Konstruktor automatisch ( inteligent ) integriert.
 * - Der Compiler sorgt (intelligent) dafur, dass in jedem Konstruktor als erstes ein anderer Konstruktor mit this oder super initialisiert wird 
 * - Der Compiler sorgt (intelligent) dafur, dass in jedem Konstruktor alle Attribute initialisiert werden 
 */

class K1{
	int x, y;
	
	/*
	 *  So sieht der default Construcor aus;
	 *  
	 *  K1(){
	 *  	super();
	 *  	this.x = 0;
	 *  	// Hier alle init - Blocke integriert
	 *  	this.y = 0;
	 *  } 
	 */
	
	
	// init - Blocke (nicht static)
	{
		System.out.println("K1 / init 1 . x = " + x);
	}
	
	{
		System.out.println("K1 / init 2");
	}
}

class K2{
	int x, y;
	
	K2(){
		// super();     <- generiert vom Compiler
		// this.x = 0;  <- generiert vom Compiler
		// this.y = 0;  <- generiert vom Compiler
	}
}

class K3{
	int x, y;
	
	K3(){
		// super();     <- generiert vom Compiler
		// Hier alle init - Block integriert
		 this.x = -2;  
		
	}
	
	K3(int x){
		// super();     <- generiert vom Compiler
		// Hier alle init - Block integriert
		// this.y = 0;  <- generiert vom Compiler
		System.out.println("y = " +y);
		this.x = x;
	}
	
	K3(int x, int y){
		this(x); // Nichts mehr vom Compiler generiert: alle notigeswird in this (int) schon gemacht
	}
	
	{
		System.out.println("K3 / init ");
	}
}

public class B10_ObjecteBilden_init_blocks {
	public static void main(String[] args) {
		System.out.println("--------------------K1");
		new K1();
		
		System.out.println("--------------------K3");
		new K3();
		
		System.out.println("--------------------K3");
		new K3(2);
		
		System.out.println("--------------------K3");
		new K3(2, 3);
	}
}
