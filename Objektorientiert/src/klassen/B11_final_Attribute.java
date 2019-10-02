package klassen;

/*
 * - statische Konstante nussen manuell (expliziert) spatestens in einem statischen init- Block initialisiert werden
 */

class Fahrzeug{
	
	static int vat;             // - Statiche Variable, bekommt implizirt den Wert 0
	
//	static final int K1; // - Statiche Konctante: CF! Muss manuell initialisiert werden
	
	static final int K2 = 2;
	
	static final int K3;
	
	static {
		K3 = 3;
	}
	
//	static final int K4;            //CF
//	static void init() {K4 = 4;}    //CF
	
	//Object-Attribute
	
	int x;  //Variable mitdem Wert 0
	
//	final int objKonstante; //CF - Mussmanuell initialisiert werden
	
	final int objKonstante2 = 2;
	
	final int objKonstante3;
	
	{
		objKonstante3 = 3;
	}
	
	final int objKonstante4;
	
	public Fahrzeug(){
		//Init- Block auch integriert
		this.objKonstante4 = 2;
	}
	
	Fahrzeug(int x){
		//Init- Block auch integriert
		this.objKonstante4 = 2;
	}
	
//	Fahrzeug(byte b){  //CF objKonstante4 nicht initialisiert
//		
//	}
	
} // End of Fahrzeug



public class B11_final_Attribute {
	public static void main(String[] args) {
		
		final int x = 12; //Locale Konstante
		
	}
}
