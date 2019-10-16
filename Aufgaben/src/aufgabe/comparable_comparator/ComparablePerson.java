package aufgabe.comparable_comparator;

import java.util.Arrays;
import java.util.Comparator;

public class ComparablePerson {

	private static final String String = null;

	public static void main(String[] args) {
		
		Person[] persons = {
				new Person("Paul","Smith", 12),
				new Person("John","Smith", 56),
				new Person("John","Black", 5),
				new Person("Paul","Black", 99),
		};
		
		for (Person person : persons) {
			System.out.println(person);
		}
		
		System.out.println("**********Nach dem Sort***********");
		Arrays.sort(persons);
		
		for (Person person : persons) {
			System.out.println(person);
		}
		
		System.out.println("**********Absteigend sortieren***********");
		
		Comparator cmp = new PersonComparator();
		Arrays.sort(persons, cmp);
		
		for (Person person : persons) {
			System.out.println(person);
		}
		
		Comparator<Person> pcomp = new Comparator<Person>() {
			public int compare(Person p1, Person p2) {
				return p1.compareTo(p2);
			}
		    };
		
		System.out.println("**********Suchen***********");
		int searchResult = Arrays.binarySearch(persons, new Person("Paul", "Black", 0), pcomp);
		System.out.println(searchResult);
	}


	
}
