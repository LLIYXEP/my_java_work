package vererbung;

/*
 * this und super gibte NUR in Instanz-Methoden (unde Konstruktoren)
 */

public class B16_this_und_super {
	
	static class Auto{
		String hersteller = "VW";
		int baujahr = 1970;

		@Override
		public String toString() {
			return "Baujahr = " + baujahr;
		}

	} //end of A

	static class PKW extends Auto{
		int baujahr = 2019; // nicht empfohlen (es gibt bereits ein Attribute namen baujahr

		@Override
		public String toString() {
//			return "PKW. " + toString();   //Falsch hier: this.toString -> rekursive Anruf
			return "PKW. " + super.toString();
		}

		void test() {
			System.out.println(baujahr);			//2019
			
			System.out.println(this.baujahr);		//2019
			System.out.println(PKW.this.baujahr);	//2019
			
			System.out.println(super.baujahr);			//1970
			System.out.println(PKW.super.baujahr);		//1970

			System.out.println(hersteller);	
			System.out.println(this.hersteller);	
			System.out.println(super.hersteller);	
			

		}

	}
	
	public static void main(String[] args) {
		
		new PKW().test();
		
	}
	
}
