package aufgabe.comparable_comparator;

import java.util.Comparator;

public class Person implements Comparable<Person>{

	private String vorname;
	private String nachname;
	private int gebjahr;
	
	
	public int getGebjahr() {
		return gebjahr;
	}


	public Person(String vorname, String nachname, int gebjahr) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.gebjahr = gebjahr;
	}


	@Override
	public String toString() {
		return "Person vorname=" + vorname + ", nachname=" + nachname + ", gebjahr=" + gebjahr;
	}

	public int compareTo(Person p) {
		int result = vorname.compareTo(p.vorname);
		
		if (result == 0) {
			int result2 = nachname.compareTo(p.nachname);
			if (result == 0 && result2 ==0) {
				result = gebjahr - p.gebjahr;
			}
		}
		return result;
	}

	
}
