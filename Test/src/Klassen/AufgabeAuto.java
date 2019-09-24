package Klassen;

public class AufgabeAuto {
	public static void main(String[] args) {
		Auto auto = new Auto();
		auto.model = "Panamera";
		auto.speed = 320;
		Auto.printAutoInfo(auto);
		
		auto.printAutoInfo(410, "Veiron");
		
	}
	
	
}
