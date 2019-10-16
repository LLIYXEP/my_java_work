package aufgabe.comparable_comparator;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

	public int compare(Person p1, Person p2) {
		return p2.getGebjahr() - p1.getGebjahr();
	}
	
}
