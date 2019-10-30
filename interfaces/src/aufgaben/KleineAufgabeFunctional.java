package aufgaben;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Astronaut{
	private String name;

	public Astronaut(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Astronaut [name = " + name + "]";
	}
	
} // end of Astronaut


public class KleineAufgabeFunctional {
	
	

	public static void main(String[] args) {
		
		String[] namen = {"Tom", "Jerry", "Peter", "Paul", "Mary", "Ute"};
		
		List<Astronaut> listA = buildMannschaft(namen);
		System.out.println(listA);
		
		
		
	} // end of Main
	
	static List<Astronaut> buildMannschaft(String[] namen){
		List<Astronaut> newList = new ArrayList<Astronaut>();
		Function<String, Astronaut> build = x -> new Astronaut(x);
		for (String name : namen) {
			newList.add(build.apply(name)) ;
		}
		return newList;
	}
	
}
