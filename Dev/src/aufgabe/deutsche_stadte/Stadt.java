package aufgabe.deutsche_stadte;

public class Stadt {

	private String name;
	private int  einwohner;
	private String land;
	
	public Stadt(String name, int inwohnerzahl, String bundesland) {
		super();
		this.name = name;
		this.einwohner = inwohnerzahl;
		this.land = bundesland;
	}

	@Override
	public String toString() {
		return name + " (" + land + "). Einwohner: " + einwohner;
	}
	
	
	
}
