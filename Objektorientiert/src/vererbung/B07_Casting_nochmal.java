package vererbung;

public class B07_Casting_nochmal {
	
	static class Tier{
		
	}
	static class Hund extends Tier{
		
	}
	static class Katze extends Tier{
		
	}

	public static void main(String[] args) {
		
		Tier tier = new Tier();
//		Tier tier2 = new Hund();
		Hund hund = new Hund();
//		Tier tier3 = new Katze();
		Katze katze = new Katze();
		
		Tier t2 = tier;
		Tier t3 = (Tier)tier; // Sinloss aber kompiliert
		
		Tier t4 = hund;
		Tier t5 = (Tier)hund; // Upcasting. Sinloss aber kompiliert
		
		tier = new Katze();
//		Katze k3 = tier; //keine IS-A von r nach l
		
		if (tier instanceof Katze) {
//			Katze k3 = tier;
			Katze k3 = (Katze)tier;  // Downcasting
		}
		
		Katze k4 = (Katze)tier;
		
//		if (hund instanceof Katze) { //CF - Geschwisterklassen
//		}
		
//		katze = (Katze)hund;   //CF - Geschwisterklassen
		
//		hund = (Hund)katze;    //CF - Geschwisterklassen
		
		hund = (Hund)(Tier)katze;
		
	}
	
}
