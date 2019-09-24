package Klassen;

class C1{
	int x;

	public C1() {
		super();
		
	}
	
}

class C2{
	int x;
	
	C2(int x){
		this.x = x;
	}
}

public class Constructor {
	public static void main(String[] args) {
		new C1();
		C2 c2 = new C2(2);
		System.out.println(c2.x);
	}
}
