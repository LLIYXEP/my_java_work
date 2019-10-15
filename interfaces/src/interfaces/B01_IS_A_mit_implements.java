package interfaces;

class GetMaxClass{
	private int value;

	public GetMaxClass(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
	
}

class Kreis extends GetMaxClass{
	
	public Kreis(int value) {
		super(value);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Kreis. radius = " + getValue() ;
	}

	
} // end Kreis

class Size extends GetMaxClass{

	public Size(int value) {
		super(value);
	}

	public String toString() {
		return "Size = " + getValue();
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
		
	} //end of main
	
	static GetMaxClass getMax(GetMaxClass a, GetMaxClass b) {
		if (a.getValue() > b.getValue()) {
			return a;
		} else {
			return b;
		}
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
