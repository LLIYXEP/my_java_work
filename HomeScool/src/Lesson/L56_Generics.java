package Lesson;

class Mains <T extends Comparable>{
	T var;
	
	T method(T type) {
		System.out.println(type);
		return type;
	}
}

class Car implements Comparable{

	@Override
	public int compareTo(Object o) {
		return 0;
	}
	
}

public class L56_Generics {
	public static void main(String[] args) {
		Mains<Car> main = new Mains<>();
		main.var = new Car();
		System.out.println(main.var);
	}
	
	
}
