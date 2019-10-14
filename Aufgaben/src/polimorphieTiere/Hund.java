package polimorphieTiere;

public class Hund extends Tier {
	
	

	public Hund(String name, int alter, boolean gesund) {
		super(name, alter, gesund);
	}

	@Override
	void laufen() {
		System.out.println(this);
		
	}
	
	@Override
	public String toString() {
		return "Hund mit dem Name " + this.getName() + " lauft!";
	}
}
