package dozent_teil;

public class JavaKurs {
	int nummer;
	int dozente;
	int teilehmere;
	
	public JavaKurs(int nummer) {
		super();
		this.nummer = nummer;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Java-Kurs number: " + nummer;
	}


	public static void main(String[] args) {
		JavaKurs javaKurs1 = new JavaKurs(5);
		System.out.println(javaKurs1);
		
		Dozent dozent2 = new Dozent("1","Alexander");
		dozent2.leiten(javaKurs1);
		
		Teilnehmer teilnehmer1 = new Teilnehmer("1", "Andrei");
		teilnehmer1.teilnehmen(javaKurs1);
		teilnehmer1.teilnehmen(javaKurs1);
		teilnehmer1.teilnehmen(javaKurs1);
		teilnehmer1.teilnehmen(javaKurs1);
		teilnehmer1.teilnehmen(javaKurs1);

		System.out.println(dozent2.name);
		System.out.println(teilnehmer1.name);
		System.out.println(javaKurs1.dozente);
		System.out.println(javaKurs1.teilehmere);
	}
}
