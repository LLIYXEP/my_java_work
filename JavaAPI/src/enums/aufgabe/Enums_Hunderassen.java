package enums.aufgabe;

public enum Enums_Hunderassen {
	DACKEL(0.5), COLLIE(1.0) , DOGGE(1.5);
	
	private double maxGroesse;

	private Enums_Hunderassen(double maxGroesse) {
		this.maxGroesse = maxGroesse;
	}

	public double getMaxGroesse() {
		return maxGroesse;
	}

	public void setMaxGroesse(double maxGroesse) {
		this.maxGroesse = maxGroesse;
	}
	
	
}
