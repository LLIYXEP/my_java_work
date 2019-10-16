package interfaces;

<<<<<<< HEAD
class GetMaxClass{
	private int value;

	public GetMaxClass(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
	
=======
interface Vergleichbar{

	int vergleichMit(Vergleichbar b);
>>>>>>> branch 'master' of https://github.com/LLIYXEP/my_java_work.git
}

<<<<<<< HEAD
class Kreis extends GetMaxClass{
=======
class Kreis implements Vergleichbar{
>>>>>>> branch 'master' of https://github.com/LLIYXEP/my_java_work.git
	
<<<<<<< HEAD
	public Kreis(int value) {
		super(value);
		// TODO Auto-generated constructor stub
=======
	int radius;

	public Kreis(int radius) {
		super();
		this.radius = radius;
>>>>>>> branch 'master' of https://github.com/LLIYXEP/my_java_work.git
	}

	@Override
	public String toString() {
		return "Kreis. radius = " + getValue() ;
	}

<<<<<<< HEAD
=======
	public int getRadius() {
		return radius;
	}

	@Override
	public int vergleichMit(Vergleichbar b) {
		return radius - ((Kreis)b).radius;
	}


>>>>>>> branch 'master' of https://github.com/LLIYXEP/my_java_work.git
	
} // end Kreis

<<<<<<< HEAD
class Size extends GetMaxClass{

	public Size(int value) {
		super(value);
=======
class Size implements Vergleichbar{

	int value;

	public Size(int size) {
		super();
		this.value = size;
>>>>>>> branch 'master' of https://github.com/LLIYXEP/my_java_work.git
	}

	public String toString() {
		return "Size = " + getValue();
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
		
		Size s1 = new Size(20);
		System.out.println(s1);

		Kreis k1 = new Kreis(3);
		System.out.println(k1);
		
		System.out.println("**********");

		Size sA = new Size(12);
		Size sB = new Size(7);
		System.out.println(getMax(sA, sB)); //Size = 12
		
		Kreis kA = new Kreis(4);
		Kreis kB = new Kreis(77);
		System.out.println(getMax(kA, kB)); //Kreis = 77
		
		Kreis maxKreis = (Kreis)getMax(kA, kB); // Casting is notig
		Size maxSize = (Size)getMax(sA, sB); // Casting is notig
		
	} //end of main
	
<<<<<<< HEAD
	static GetMaxClass getMax(GetMaxClass a, GetMaxClass b) {
		if (a.getValue() > b.getValue()) {
=======
	/*
	 * Losung mit Interface und Polimorphie
	 */
	static Vergleichbar getMax(Vergleichbar a, Vergleichbar b) {
		if (a.vergleichMit(b) > 0) {
>>>>>>> branch 'master' of https://github.com/LLIYXEP/my_java_work.git
			return a;
		} else {
			return b;
		}
<<<<<<< HEAD
=======
	}
	
	static Vergleichbar getMaxv1(Vergleichbar a, Vergleichbar b) {
		if (true) {
			return a;
		} else {
			return b;
		}
>>>>>>> branch 'master' of https://github.com/LLIYXEP/my_java_work.git
	}
	
//static Object getMax(Object a, Object b) {
//		
//		if (a instanceof Size) {
//			Size sA = (Size)a;
//			Size sB = (Size)b;
//			
//			if (sA.getValue() > sB.getValue()) {
//				return a;
//			} else {
//				return a;
//			}
//		} else if( a instanceof Kreis ) {
//			Kreis kA = (Kreis) a;
//			Kreis kB = (Kreis) b;
//			
//			if( kA.getRadius() > kB.getRadius() ) {
//				return a;
//			} else {
//				return b;
//			}
//		}
//		return a;
//	}
}
