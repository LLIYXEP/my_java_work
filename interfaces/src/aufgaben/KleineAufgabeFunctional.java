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
		
		Function<String, Astronaut> build = x -> new Astronaut(x);
		
		
		
		List<Astronaut> listA = buildMannschaft(namen, build);
		System.out.println(listA);
		
		
		
	} // end of Main
	
	static List<Astronaut> buildMannschaft(String[] namen, Function<String, Astronaut> build){
		List<Astronaut> newList = new ArrayList<Astronaut>();
		
		for (String name : namen) {
			newList.add(build.apply(name)) ;
		}
		return newList;
	}
	
}
