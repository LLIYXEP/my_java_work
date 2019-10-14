package dozent_teil;

public class Dozent extends Personen {

	public void leiten(JavaKurs jk) {
		jk.dozente += 1;
	}
	
	public Dozent(String id, String name) {
		super(name, id);
	}
	
}
