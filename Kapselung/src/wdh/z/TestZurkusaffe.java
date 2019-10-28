package wdh.z;

import wdh.t.Affe;

class Zurkusaffe extends Affe{
	
	void access() {
		System.out.println(haende);
		System.out.println(this.haende);
		
		Affe nachbar = new Zurkusaffe();
//		System.out.println(nachbar.haende); // nicht mit abgeleiteten typ
		
		Zurkusaffe z1 = new Zurkusaffe();
		System.out.println(z1.haende);
	}
	
	
}

public class TestZurkusaffe {

	
	public static void main(String[] args) {
		
//		System.out.println(new Affe().haende);
		
		Zurkusaffe z1 = null;
		
//		System.out.println(z1.haende); // nicht in einer abgeleiteten Klasse (Zugriff auf protected)
		
	}
}
