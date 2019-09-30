package Person;

public class PersonBuilder {
	
//	private String name, nachname;
//	private int jahr;
//	private String post;
	
	private Person person = new Person(null, null, -1);
	
	public PersonBuilder name(String name) {
		person.setName(name);
		return this;
	}
	
	public PersonBuilder nachname(String nachname) {
		person.setName(nachname);
		return this;
	}
	
	public PersonBuilder jahr(String jahr) {
		person.setName(jahr);
		return this;
	}
	
	public PersonBuilder post(String post) {
		person.setName(post);
		return this;
	}

	
	public Person build() {
		//Alle Person - Attribute uberprufen
		
		Person tmp = person;
		
		person = new Person(null, null ,-1);
		
		return tmp;
	}
	
	public static void main(String[] args) {
		PersonBuilder builder = new PersonBuilder();
		
		builder.name("Max");
		builder.post("124345");
		
		Person p = builder.build();
		
		System.out.println(p);
		
		Person p2 = new PersonBuilder()
			.name("Petro")
			.post("12312")
			.build();
		
		System.out.println(p2);
	}
}
