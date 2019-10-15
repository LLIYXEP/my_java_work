package interfaces;

interface Vergleichbar{

	int vergleichMit(Vergleichbar b);
}

class Kreis implements Vergleichbar{
	
	int radius;

	public Kreis(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Kreis. radius =" + radius ;
	}

	public int getRadius() {
		return radius;
	}

	@Override
	public int vergleichMit(Vergleichbar b) {
		return radius - ((Kreis)b).radius;
	}


	
} // end Kreis

class Size implements Vergleichbar{

	int value;

	public Size(int size) {
		super();
		this.value = size;
	}

	public String toString() {
		return "Size = " + value;
	}

	public int getSize() {
		return value;
	}

	@Override
	public int vergleichMit(Vergleichbar b) {
		Size s2 = (Size) b;
		return this.value - s2.value;
	}
	
} // end Size


public class B01_IS_A_mit_implements {
	
	public static void main(String[] args) {
		
		/*
		 * A1
		 */
		
		Size s1 = new Size(20);
		System.out.println(s1);
		
		/*
		 * A2
		 */
		Kreis k1 = new Kreis(3);
		System.out.println(k1);
		
		System.out.println("**********");
		
		/*
		 * A3
		 */
		Size sA = new Size(12);
		Size sB = new Size(7);
		System.out.println(getMax(sA, sB)); //Size = 12
		
		Kreis kA = new Kreis(4);
		Kreis kB = new Kreis(77);
		System.out.println(getMax(kA, kB)); //Kreis = 77
		
		Kreis maxKreis = (Kreis)getMax(kA, kB); // Casting is notig
		Size maxSize = (Size)getMax(sA, sB); // Casting is notig
		
	} //end of main
	
	/*
	 * Losung mit Interface und Polimorphie
	 */
	static Vergleichbar getMax(Vergleichbar a, Vergleichbar b) {
		if (a.vergleichMit(b) > 0) {
			return a;
		} else {
			return b;
		}
	}
	
	static Vergleichbar getMaxv1(Vergleichbar a, Vergleichbar b) {
		if (true) {
			return a;
		} else {
			return b;
		}
	}
}
