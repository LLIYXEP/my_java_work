package Person;

public class AufgabeHafen {
	public static void main(String[] args) {
		Schiff s1 = new Schiff("Tom");
		
		Schiff s2 = new Schiff("Jarry");
		
		Hafen h = new Hafen();
		
		if (h.einlaufen(s1)) {
			System.out.println("Klasse " + s1 + " eingelaufen!");
		} else {
			System.out.println("Kein Platz fur s1 ");
		}
		
		System.out.println(h);
		
		if (h.einlaufen(s2)) {
			System.out.println("Klasse " + s2 + " eingelaufen!");
		} else {
			System.out.println("Kein Platz fur s2");
		}
		
		System.out.println(h);
		
		System.out.println(" +++ Noch 10 Schiffe");
		
		for (int i = 0; i < 10; i++) {
			h.einlaufen(new Schiff("s" +i));
		}
		
		System.out.println(h);
		
	}
}
