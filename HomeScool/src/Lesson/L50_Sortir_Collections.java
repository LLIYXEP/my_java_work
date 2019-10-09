package Lesson;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Person{ //implements Comparable<Person>
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(int age) {
		this.age = age;
	}
	
//	@Override
//	public int compareTo(Person p) { // Сортировка по возрасту
//		return this.age - p.age;
//	}

	@Override
	public String toString() {
		return "Person [age=" + age + "]";
	}
	
}

class ComparePerson implements Comparator<Concurs> {
	@Override
	public int compare(Concurs o1, Concurs o2) {
		
		return o1.getAge() - o2.getAge();
	}
}

public class L50_Sortir_Collections {
	public static void main(String[] args) {
		
		Set set = new TreeSet(new ComparePerson());
		set.add(new Concurs(4));
		set.add(new Concurs(3));
		set.add(new Concurs(5));
		set.add(new Concurs(1));
		for (Object object : set) {
			System.out.println(object);
		}
	}
}
