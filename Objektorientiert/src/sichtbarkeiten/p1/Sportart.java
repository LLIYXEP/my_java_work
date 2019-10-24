package sichtbarkeiten.p1;

public class Sportart {
	
	static int getMaxAlter() {return MAX_ALTER;} // sichtbar in Package 'sichtbarkeiten.p1'
	
	public static int MAX_ALTER = 22; // sichtbar uberall
	
	private String name; // sichtbar nur in der Klasse Sportart
	
	protected boolean olympish; // sichtbar im ganzen Package und in den abgeleiteten Klassen

	public Sportart() {} // sichtbar uberall

	
}
