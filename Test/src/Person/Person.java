package Person;

import java.util.Objects;

public class Person {
	
	
	public static Person getMustermann(String n, String nn, int j, String p) {
		return new Person(n, nn, j, p);
	}
	
	private String name;
	private String nachname;
	private int jahr;
	private String post;

	public Person(String name, String nachname, int jahr) {
		this.jahr = jahr;
		this.nachname = nachname;
		this.name = name;

	}

	public Person(String name, String nachname, int jahr, String post) {
		this(name, nachname, jahr);
		this.post = post;
	}
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public int getJahr() {
		return jahr;
	}

	public void setJahr(int jahr) {
		this.jahr = jahr;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}
	
	
	

	@Override
	public String toString() {
		return this.name + " " + this.nachname + " " + this.post + " " + this.jahr;
	}

	public boolean equals(Object person) {
		Person pers = (Person) person;
		return this.name.equals(pers.name) 
//				&& this.post.equals(pers.post);
				&&Objects.equals(post, pers.post);
	}
	
	public static void main(String[] args) {
		Person person1 = new Person("Andrei", "Scurtu", 1988, "245364");
		Person person2 = new Person("Dmitrii", "petrov", 1988, "123312");
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person1.equals(person2));
		
		Person p4 = Person.getMustermann("Gena", "Petrov", 2018, "55555");
		System.out.println(p4);
	}


}

 
	

