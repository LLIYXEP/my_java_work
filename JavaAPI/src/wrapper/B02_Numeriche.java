package wrapper;

public class B02_Numeriche {

	public static void main(String[] args) {
		
		/*
		 * Byte, Short, Integer, Long, Float, Double erben von Number
		 * 
		 * Number ist eine abstracte Classe
		 */
		
		Integer i1 = Integer.valueOf(1200);
		
		Number n1 = i1;
		System.out.println("n1 = " + n1);
		
		n1 = Double.valueOf(22334455.3);
		System.out.println("n1 = " + n1);
		
//		n1 = new Number();	// CF - Number ist abstract
		
		byte v1 =  n1.byteValue();
		short v2 =  n1.shortValue();
		short v3 = n1.shortValue();
		long v4 = n1.longValue();
		float v5 = n1.floatValue();
		double v6 = n1.doubleValue();
		
		System.out.println("n1.byteValue(): " + v1); // falscher Wert (nicht in der Prufung)
		
	}
	
}
