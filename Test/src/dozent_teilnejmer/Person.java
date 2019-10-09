package dozent_teilnejmer;

public class Person {
	private String id;
	private String name;
	
	private JavaKurs kurs;

	public Person(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

	public void setKurs(JavaKurs kurs) {
		this.kurs = kurs;
	}


	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public JavaKurs getKurs() {
		return kurs;
	}


	@Override
	public String toString() {
		String kursText = kurs !=null ? kurs.toString() : "Kein Kurs zugeordnet";
		
		Class<?> clazz = getClass();
		String className = clazz.getSimpleName();
		
		return className + " [id=" + id + ", name=" + name + ", kurs=" + kursText + "]";
	}
	
	
	
}
