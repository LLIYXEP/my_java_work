package polimorphieTiere;

public class PolimorphieTiere {
	
	static void print(Tier tier) {
		System.out.println(tier.getClass().getSimpleName() + ". Name: " + tier.getName());
	}

	public static void main(String[] args) {
		
		Tier t1 = new Hund("Rex", 12, true);
		t1.laufen();
		
		Tier t2 = new Katze("Kisia", 22, false);
		t2.laufen();
		
		System.out.println();
		
		print(t1);
		print(t2);
	}
	
}
