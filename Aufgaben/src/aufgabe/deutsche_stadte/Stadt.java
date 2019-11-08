package aufgabe.deutsche_stadte;

public class Stadt {

	private String name;
	private int  inwohnerzahl;
	private String bundesland;
	
	public Stadt(String name, int inwohnerzahl, String bundesland) {
		super();
		this.name = name;
		this.inwohnerzahl = inwohnerzahl;
		this.bundesland = bundesland;
	}

	@Override
	public String toString() {
		return "Stadt [name=" + name + ", inwohnerzahl=" + inwohnerzahl + ", bundesland=" + bundesland + "]";
	}
	
	
	
}
