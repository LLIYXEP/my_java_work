package vererbung;

class C1{
	
}

class C2{
	int x;
}

class BaseA{
	int x;

	public BaseA(int x) {
		super();
	}
}

class DerivedA extends BaseA{

}

class DerivedB extends BaseA{
	public DerivedB(int x) {
		super(x);
	}
	
}

class DerivedC extends BaseA{
	public DerivedC() {
		super();
	}
}

class DerivedD extends BaseA{
	public DerivedD() {
		super(12);
	}
}

public class B003_Konstruktoren {
	public static void main(String[] args) {
		C1 c1 = new C1();
		C2 c2 = new C2();
		BaseA c3 = new BaseA(3);
		System.out.println(c3.x);
	}
}
