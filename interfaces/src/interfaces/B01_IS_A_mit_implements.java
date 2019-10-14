package interfaces;

class GetMaxClass{
		
}

class Kreis extends GetMaxClass{

	private int radius;
	

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


	
} // end Kreis

class Size extends GetMaxClass{
	
	

	public int getValue() {
		return value;
	}



	public Size(int value) {
		super();
		this.value = value;
	}


	private int value;

	

	public String toString() {
		return "Size = " + value;
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
		
	} //end of main
	
	static Object getMax(Object a, Object b) {
		boolean result = true;
		if (a instanceof Size) {
			Size sA = (Size)a;
			Size sB = (Size)b;
			
			if (sA.getValue() < sB.getValue()) {
				
			}
		} else {
			
		}
		return result;
	}
}
