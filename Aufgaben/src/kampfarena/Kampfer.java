package kampfarena;

import java.util.Random;

public class Kampfer {
	public String name = "Petro";
	
	Kampfer(String name){
		this.name = name;
	}
	
	static int schlagen() {
		
		Random random = new Random();
		int chance = random.nextInt(100);

		return chance;
	}
	
	@Override
	public String toString() {
		
		return this.name;
	}
	
}
