package aufgaben.kampfarena;

import java.util.Random;

public class Kampfer {
	private String name;
	
	public Kampfer(String name){
		this.name = name;
	}
	
	public boolean schlagen() {
		Random random = new Random();	
		 return random.nextInt(100) < 10; //ca 10% wahrscheinlichkeit, dass es true wird
	}
	
	@Override
	public String toString() {
		return name;
	}
}
