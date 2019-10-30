package aufgaben;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Kreis {
	private int radius;

	public Kreis(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Kreis radius = " + radius;
	}

	public int getRadius() {
		return radius;
	}
	
}

public class KleineAufgabePredicate {

	public static void main(String[] args) {
		
		Kreis k1 = new Kreis(3);
		Kreis k2 = new Kreis(17);
		Kreis k3 = new Kreis(2);
		Kreis k4 = new Kreis(22);
		Kreis k5 = new Kreis(8);
		
		
		List<Kreis> kreisList = new ArrayList<Kreis>();
		kreisList.add(k1);
		kreisList.add(k2);
		kreisList.add(k3);
		kreisList.add(k4);
		kreisList.add(k5);
		
		Predicate<Kreis> p1 = kreis -> kreis.getRadius() > 10;
		for (Kreis kreis : kreisList) {
			if (p1.test(kreis)) {
				System.out.println(kreis);
			}
		}
		
		/*
		 * 
		 */
		
	}
	
}
