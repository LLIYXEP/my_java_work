package aufgabePolymorphieTiere;

abstract class Tier{
	private String name;
	private int alter;
	private boolean gesunf;
	
	abstract void laufen();
	
	public Tier(String name, int alter, boolean gesunf) {
		super();
		this.name = name;
		this.alter = alter;
		this.gesunf = gesunf;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
	}
	public boolean isGesunf() {
		return gesunf;
	}
	public void setGesunf(boolean gesunf) {
		this.gesunf = gesunf;
	}	
	
} //end of Tier

public class AufgabePolymorphieTiere {
	
	static class Hund extends Tier{
		
		public Hund(String name, int alter, boolean gesunf) {
			super(name, alter, gesunf);
			// TODO Auto-generated constructor stub
		}

		@Override
		void laufen() {
			System.out.println("Hund " + getName() + " lauft");
		}
} //end of Hund
	
	static class Katze extends Tier{

		public Katze(String name, int alter, boolean gesunf) {
			super(name, alter, gesunf);
		}

		@Override
		void laufen() {
			System.out.println("Katze " + getName() + " lauft");
		}
} //end of Katze
	
//	static class Test extends Tier{
//
//		public Test(String name, int alter, boolean gesunf) {
//			super(name, alter, gesunf);
//			// TODO Auto-generated constructor stub
//		}
//
//		@Override
//		void laufen() {
//		}
//		
//	}
	
	

	public static void main(String[] args) {
		
		Hund hund = new Hund("Rex", 3 , true);
		Katze katze = new Katze("Rex", 3 , true);
		
		print(hund);
		print(katze);
	}
	
	static void print(Tier tier) {
		String tierArt = tier.getClass().getSimpleName();
		String tierName = tier.getName();
		
		System.out.println(tier.getClass().getSimpleName() + " " + tier.getName() + " lauft");
	}
	
}
