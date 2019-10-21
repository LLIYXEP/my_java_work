package aufgabe.format;

public class Person implements Comparable<Person> {

	private String vorName;
	private String nachname;
	private int geburtsjahr;
	
	public Person(String vorName, String nachname, int geburtsjahr) {
		super();
		this.vorName = vorName;
		this.nachname = nachname;
		this.geburtsjahr = geburtsjahr;
	}

	@Override
	public String toString() {
		return "Person [vorName=" + vorName + ", nachname=" + nachname + ", geburtsjahr=" + geburtsjahr + "]";
	}

	public String getVorName() {
		return vorName;
	}

	public void setVorName(String vorName) {
		this.vorName = vorName;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public int getGeburtsjahr() {
		return geburtsjahr;
	}

	public void setGeburtsjahr(int geburtsjahr) {
		this.geburtsjahr = geburtsjahr;
	}

	@Override
	public int compareTo(Person p) {
		int result = vorName.compareTo(p.vorName);
		if (result == 0) {
			int result2 = nachname.compareTo(p.nachname);
			if (result == 0 && result2 == 0) {
				result = geburtsjahr - p.geburtsjahr;
			}
		}
		
		return result;
	}
	
	
}
