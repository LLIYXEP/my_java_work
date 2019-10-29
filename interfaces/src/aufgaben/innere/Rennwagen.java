package aufgaben.innere;

public class Rennwagen {

	public class Motor{
		private String type;

		public Motor(String type) {
			this.type = type;
		}

		@Override
		public String toString() {
			
			return "Motor " + type  + " aus dem Rennwagen " + hersteller;
		}
		
	} // End of Motor
	
	public static class Fahrer{
		
		private String vorname;
		private String nachname;
		
		public Fahrer(String vorname, String nachname) {
			super();
			this.vorname = vorname;
			this.nachname = nachname;
		}

		@Override
		public String toString() {
			return vorname + " " + nachname;
		}
		
	} // End of Fahrer
	
	private String hersteller;
	private Fahrer fahrer;
	private Motor motor;
	
	public Rennwagen(String hersteller) {
		this.hersteller = hersteller;
		this.motor = new Motor("Type1");
	}
	
	public void setFahrer(Fahrer fahrer) {
		this.fahrer = fahrer;
	}
	
	public Motor getMotor(){
		return motor;
	}

	@Override
	public String toString() {
		return "Rennwagen Hersteller = " + hersteller + ", Fahrer = " + fahrer;
	}
	
	
}
