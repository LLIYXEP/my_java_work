package interfaces;

import java.util.Arrays;

public class B02_ArraysSortieren_WieEinInterfaceKomponentenVerbindet {
	
	static class Auto implements Comparable<Auto>{
		int baujahr;

		public Auto(int baujahr) {
			super();
			this.baujahr = baujahr;
		}

		@Override
		public String toString() {
			return "Auto von = " + baujahr;
		}

		@Override
		public int compareTo(Auto a2) {
			return baujahr - a2.baujahr;
		}

		
		
	}

	public static void main(String[] args) {
		
		Object[] autos = {
				new Auto(2003),
				new Auto(1990),
				new Auto(2012),
		};
		
		System.out.println(Arrays.toString(autos));
		
		/*
		 * - Sortiert aufsteigend in der naturlichen Reihenfolge
		 */
		
		Arrays.sort(autos);
		
		/*
		 *  - Die sort-Methode muss auf kleiner/grosser vergleichen um zu sortieren
		 *  - Dafur verlangt die sort-Methode, dass die Elemente im Array vergleichbar sind (Comparable).
		 *  
		 *  - Die sort-Methode vergleicht Elemente paarweise etwa so (i < j):
		 *  
		 *  Comparable element_i = (Comparable) arra[i]
		 *  Comparable element_j = (Comparable) arra[j]
		 *  
		 *  if(element_i.compareTo(element_j) > 0){
		 *  	hier Elelemente vertauschen
		 *  }
		 *  
		 */
		
		System.out.println(Arrays.toString(autos));
		
	} //end of main
	
}
