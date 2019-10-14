package dozent_teil;

public class Teilnehmer extends Personen {

	public void teilnehmen(JavaKurs jk) {
		jk.teilehmere += 1;
	}
	
	public Teilnehmer(String id, String name) {
		super(name, id);
	}
}
