package Arrays;

class Girafe{
	String name = "Andrei";
}


public class ArraysGirafe {
	public static void main(String[] args) {
		Girafe[] arr8 = new Girafe[10];
		
		
		arr8[0] = new Girafe();
		Girafe[][] arr9 = new Girafe[1][2];
		
		arr9[0] = arr8;
		
		System.out.println(arr8[0].name);
		System.out.println(arr9[0][0].name);
	}
}
