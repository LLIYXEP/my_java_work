package interfaces;

interface NameHolder{
	default String getName() {
		return "Unknown";
	}
}

interface Lebewesen {
	default String getName() {
		return toString();
	}
}

class Affe implements Lebewesen{
	
}

//class Zebra implements NameHolder, Lebewesen{} // CF! Zwei defaullt - Definitionen geerbt: Konflikt

class Maus implements NameHolder, Lebewesen{ 

	//Konflikt losen
	public String getName() {
		return "Mickey";
	}	
}

class Katze implements NameHolder, Lebewesen{

	//Konflikt losen
	public String getName() {
		return Lebewesen.super.getName(); //  die Methode aus Lebewesen aufrufen
	}

	@Override
	public String toString() {
		return "Tom";
	} 
		
}

public class B06_default_Konflikt {

	public static void main(String[] args) {
		
		System.out.println(new Katze().getName());
	}
	
}
