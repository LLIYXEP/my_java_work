package interfaces;

interface Fahrbar{
	void motorAn();
	void motorAus();
	
	default void fahren() {
		motorAn();
		System.out.println("Fahren...");
		motorAus();
	}
}

class Oldmobile implements Fahrbar{

	@Override
	public void motorAn() {
		System.out.println("Oldtimer: motor an");
	}

	@Override
	public void motorAus() {
		System.out.println("Oldtimer: motor aus");
	}
	
}

class Rennwagen implements Fahrbar{

	@Override
	public void motorAn() {
		System.out.println("Oldtimer: motor an");
	}

	@Override
	public void motorAus() {
		System.out.println("Oldtimer: motor aus");
	}

	@Override
	public void fahren() {
		System.out.println("Rennwagen Fahren...");
	}
}


public class B05_default_Methoden {

	public static void main(String[] args) {
		
		Fahrbar fahrbar = new Oldmobile();
		fahrbar.fahren();
		
		fahrbar = new Rennwagen();
		fahrbar.fahren();
		
	}
	
}
