package arrayList;

import java.util.ArrayList;
import java.util.List;

import arrayList.B04_API_contains_und_Co.Kreis;

public class B04_API_contains_und_Co {
	
	static class Kreis{
		int radius;

		public Kreis(int radius) {
			super();
			this.radius = radius;
		}

		@Override
		public String toString() {
			return "Kreis [radius=" + radius + "]";
		}
		
		@Override
		public boolean equals(Object obj) {
			if (!(obj instanceof Kreis)) {
				return false;
			}
			
			Kreis k2 = (Kreis) obj;
			return radius == k2.radius;
		}
		
	}

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("mo");
		list.add("mi");
		list.add("fr");
		
		System.out.println("1: " + list);
		
		/*
		 * boolean contains(Object element)
		 */
		boolean gefunden = list.contains("di");
		System.out.println("di gefunden: " + gefunden); // false
		
		gefunden = list.contains("mi");
		System.out.println("mi gefunden: " + gefunden); // true
		
		System.out.println("indexOf di: " + list.indexOf("di")); // -1
		System.out.println("indexOf mi: " + list.indexOf("mi")); // -1
		
		/*
		 * 
		 */
		System.out.println(list.remove("di")); // false
		
		ArrayList<Kreis> kreise = new ArrayList<>();
		kreise.add(new Kreis(2));
		kreise.add(new Kreis(5));
		
		Kreis k = new Kreis(12);
		kreise.add(k);
		
		System.out.println(kreise);
		System.out.println("contains(k)" + kreise.contains(k)); // true
		
		Kreis key = new Kreis(3000);
		
		System.out.println(key);
		System.out.println("contains(k)" + kreise.contains(key)); // false
		
		key = new Kreis(5);
//		System.out.println(new Kreis(5) != ( key = new Kreis(5))); // true
		System.out.println(key);
		System.out.println("contains(k)" + kreise.contains(key)); // false
		
	}

}
