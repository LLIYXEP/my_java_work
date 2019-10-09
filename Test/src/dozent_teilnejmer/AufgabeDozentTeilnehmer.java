package dozent_teilnejmer;

public class AufgabeDozentTeilnehmer {
	public static void main(String[] args) {
		
		JavaKurs javaKurs = new JavaKurs(12312);
		
		Teilnehmer teilnehmer = new Teilnehmer("12", "Andrei");
		teilnehmer.setKurs(javaKurs);
		System.out.println(teilnehmer);
		
		Dozent dozent = new Dozent("25", "Petro");
		dozent.setKurs(javaKurs);
		System.out.println(dozent);
		
		Person p = new Person("??ID", "??Name");
		System.out.println(p);
		
//		teilnehmer = dozent;
//		javaKurs = p;
//		teilnehmer = p;
		p = teilnehmer;
		p = dozent;
	}
}
