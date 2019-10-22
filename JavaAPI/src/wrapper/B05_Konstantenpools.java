package wrapper;

public class B05_Konstantenpools {

	public static void main(String[] args) {
		
		Integer i1 = 12; // Integer.valueOf(12)
		Integer i2 = 12; // Integer.valueOf(12)
		
		System.out.println("i1 == i2: " + (i1 == i2));
		
		Integer i3 = 1200;
		Integer i4 = 1200;
		
		System.out.println("i3 == i4: " + (i3 == i4));
		
		Integer i5 = i4;
		System.out.println("i5 == i4: " + (i5 == i4));
		
		Integer i6 = new Integer(12);
		System.out.println("i1 == i6: " + (i1 == i6));
		
	}
	
}
