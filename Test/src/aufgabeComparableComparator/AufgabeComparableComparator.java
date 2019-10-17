package aufgabeComparableComparator;

import java.util.Arrays;
import java.util.Comparator;

public class AufgabeComparableComparator {
	
	static class MyComp implements Comparator<Person>{

		@Override
		public int compare(Person p1, Person p2) {
			int result = p2.vorname.compareTo(p1.vorname);
			if (result == 0) {
				int result2 = p2.nachname.compareTo(p1.nachname);
				if (result == 0 && result2 == 0) {
					result = p2.geburtsjahr - p1.geburtsjahr;
				}
			}
			return result;
		}
		
	}
	
	static class Person implements Comparable<Person>{
		private String vorname;
		private String nachname;
		private int geburtsjahr;
		
		public Person(String vorname, String nachname, int geburtsjahr) {
			super();
			this.vorname = vorname;
			this.nachname = nachname;
			this.geburtsjahr = geburtsjahr;
		}


		@Override
		public String toString() {
			return "Person vorname = " + vorname + ", nachname = " + nachname + ", geburtsjahr = " + geburtsjahr;
		}


		@Override
		public int compareTo(Person p) {
			int result = vorname.compareTo(p.vorname);
			if (result == 0) {
				int result2 = nachname.compareTo(p.nachname);
				if (result == 0 && result2 == 0) {
					result = geburtsjahr - p.geburtsjahr;
				}
			}
			return result;
		}
		
		
	}

	public static void main(String[] args) {
		
		Person p1 = new Person("Paul", "Smith", 22);
		Person p2 = new Person("Paul", "Smith", 5);
		Person p3 = new Person("John", "Smith", 99);
		Person p4 = new Person("John", "Smith", 19);
		
		Person[] array = { p1, p2, p3, p4};
		print(array);
		
		System.out.println("****************************");
		Arrays.sort(array);
		print(array);
		
		Person key = new Person("John", "Smith", 19);
		int pos = Arrays.binarySearch(array, key);
		System.out.println("Position : " + pos);
		
		Comparator<Person> cmp = Comparator.reverseOrder();
		System.out.println("****************************");
		Arrays.sort(array, cmp);
		print(array);
		
		System.out.println("Suche nach John Smith");
		
		key = new Person("John", "Smith", 19);
		pos = Arrays.binarySearch(array, key, cmp);
		System.out.println("Position : " + pos);
		
	}
	
	static void print(Person[] array) {
		for (Person person : array) {
			System.out.println(person);
		}
	}
	
}
