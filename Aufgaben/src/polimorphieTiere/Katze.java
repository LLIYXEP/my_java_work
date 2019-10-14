package polimorphieTiere;

public class Katze extends Tier{
	
	public Katze(String name, int alter, boolean gesund) {
		super(name, alter, gesund);
	}

	@Override
	void laufen() {
		System.out.println(this);
		
	}
	
	@Override
	public String toString() {
		return "Katze mit dem Name " + this.getName() + " lauft!";
	}
}
