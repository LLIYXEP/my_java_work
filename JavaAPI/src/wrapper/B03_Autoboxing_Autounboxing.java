package wrapper;

class MyInteger {
	private int value;

	public MyInteger(int value) {
		super();
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}
	
	public int intValue() {
		return value;
	}
}

public class B03_Autoboxing_Autounboxing {
	
	/*
	 * - Dort, wo die Wrapperklasse-Referenz steht, aber ein primitiver Wert notig ist, kommt es zum Autounboxing
	 * - Dort,  wo ein primitiver Werte steht, aber eine Referenz notig ist (meinstens Zuweusung), kommt es zum Autoboxing
	 */

	public static void main(String[] args) {
		
		int x = 2;
		int y = 3;
		int sum = x + y;
		System.out.println(sum);

		MyInteger m1 = new MyInteger(2);
		MyInteger m2 = new MyInteger(3);
		MyInteger sumA = new MyInteger(m1.intValue() + m2.intValue());
		System.out.println(sumA);
		
		Integer i1 = 2; // Autoboxing fur die Zuweisung
		Integer i2 = 3; // Autoboxing
		Integer sumB = i1 + i2; // Autounboxing fur Addition, danach Autoboxing
		System.out.println(sumB);
		
		Integer i3 = Integer.valueOf(2); // manuelles Boxing == Integer i1 = 2;
		Integer i4 = Integer.valueOf(3); // manuelles Boxing == Integer i1 = 3;
		Integer sumC = Integer.valueOf( i3.intValue()  + i4.intValue() );
		System.out.println(sumC);
		
	}

}
