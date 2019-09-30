package Sablon;


//class A{
//	void f() {
//		System.out.println("f");
//	}	
//}
//
//class B{
//	A a = new A();
//	
//	void f() {
//		a.f();
//	}
//}

interface Grafics{
	void draw();
}

class Triangle implements Grafics{
	@Override
	public void draw() {
		System.out.println("Print Triangle");
	}
}

class Square implements Grafics{
	@Override
	public void draw() {
		System.out.println("Print Square");
	}
}

class Circle implements Grafics{
	@Override
	public void draw() {
		System.out.println("Print Circle");
	}
}

class Painter{
	Grafics grafics;
	public void setGrafics(Grafics grafics) {
		this.grafics = grafics;
	}
	
	void draw() {
		grafics.draw();
	}
}

public class Scool {
	public static void main(String[] args) {
		
//		B b = new B();
//		b.f();
		
		Painter painter = new Painter();
		painter.setGrafics(new Circle());
		painter.draw();
		painter.setGrafics(new Square());
		painter.draw();
		painter.setGrafics(new Triangle());
		painter.draw();
		
	}
}

