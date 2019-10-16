package sort_search;

//Recommended plugin market place

import java.util.Arrays;

public class B02_AutosSortieren {
	
	static class Auto implements Comparable<Auto>{
		private int baujahr;
		private String hersteller;
		
		@Override
		public int compareTo(Auto a) {
			int erg = hersteller.compareTo(a.hersteller);
			
			if ( erg == 0) {
				erg = baujahr - a.baujahr;
			}
			
			return erg;
		}

		public Auto(int baujahr, String hersteller) {
			super();
			this.baujahr = baujahr;
			this.hersteller = hersteller;
		}

		@Override
		public String toString() {
			return "Auto Baujahr = " + baujahr + ", Hersteller = " + hersteller;
		}
		
		
		
	}

	public static void main(String[] args) {
		
		Auto[] autos = {new Auto(1999, "Audi"), new Auto(1990, "Bmw"), new Auto(2018, "Opel"), new Auto(2019, "Trabant")};
		
		Arrays.sort(autos);
		
		System.out.println(Arrays.toString(autos));
		
	}
	
}
