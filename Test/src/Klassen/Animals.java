package test;

class Animal{
	String name;
	int teeth;
	int years;
}

public class Animals {
	public static void main(String[] args) {
		
		Animal dog = new Animal();
		dog.name = "Braun";
		dog.teeth = 32;
		dog.years = 15;
		whoAreYou(dog);
		
		Animal cat = new Animal();
		dog.name = "Daiv";
		dog.teeth = 2;
		dog.years = 1;
		whoAreYou(cat);
	}
	
	static void whoAreYou(Animal animal) {
		System.out.println("*****************");
		System.out.println("My name is " + animal.name + ", I have " + animal.teeth + " teeth" + " and i am " + animal.years + " years old");
	}
}
