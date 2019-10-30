package aufgabe.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

interface ListPair {
	List<Integer> accept(List<Integer> list1, List<Integer> list2);   
}

class listAdd implements ListPair{

	@Override
	public List<Integer> accept(List<Integer> list1, List<Integer> list2) {
		List<Integer> list = new ArrayList<Integer>();
		list.addAll(list1);
		list.addAll(list2);
		return list;
	}
	
}

interface IntOperation{
	int execute(int x, int y);
}

class Sum implements IntOperation{

	@Override
	public int execute(int x, int y) {
		return x + y;
	}
	
} // end of sum

class Max implements IntOperation{

	@Override
	public int execute(int x, int y) {
		if (x > y) {
			return x;
		} else {
			return y;
		}
	}
	
} // end of max

public class LambdaAufgabe {

	public static void main(String[] args) {
		System.out.println("**************** Aufgabe 1 **************");
		
		IntOperation op1 = new Sum();	// Kann Summe bilden
		System.out.println( op1.execute(2, 3) ); // 5
		
		IntOperation op2 = (x,y) -> x + y;	// hier eine Lambda zum Bilden der Summe
		System.out.println( op2.execute(2, 3) ); // 5
		
		IntOperation op3 = new Max(); // Kann den größeren Wert ermitteln
		System.out.println( op3.execute(-6, 17) ); // 17
		
		IntOperation op4 = (x,y) -> (x > y ? x : y) ; // hier eine Lambda um den größeren Wert zu ermitteln
		System.out.println( op4.execute(-6, 17) ); // 17
		
		System.out.println("**************** Aufgabe 2 **************");
		
		List<String> vorlage = Arrays.asList("as", "adsfg sdfg", "frtdfg", "fr tdfssdffg dfg");
		ArrayList<String> list = new ArrayList<>(vorlage);
		
		
		Comparator<String> cmp = (x,y) -> x.length() - y.length();
		Collections.sort(list, cmp);
		System.out.println(list);
		
		System.out.println("**************** Aufgabe 3 **************");
		
		List<Integer> list1 = new ArrayList<>();
		// 2-3 Integer zur list1 hinzufügen...
		list1.add(2);
		list1.add(3);
		
		List<Integer> list2 = new ArrayList<>();
		// 2-3 Integer zur lisr2 hinzufügen...
		list2.add(4);
		list2.add(5);
		
		
//		ListPair combiner = (x,y) -> Arrays.asList(Integer.valueOf(x.subList(0,3).toString() + y.subList(0,3).toString())); // hier die Lambda-Funktion
//		ListPair combiner = (x, y) -> ; // hier die Lambda-Funktion
//		List<Integer> list3 = combiner.accept(list1, list2);
		
		ListPair combiner2 = new listAdd();
		List<Integer> list3 = combiner2.accept(list1, list2);
		System.out.println(list3);
		
		list3 = combiner2.accept(list1, list1);
		System.out.println(list3);
	}
	
}
