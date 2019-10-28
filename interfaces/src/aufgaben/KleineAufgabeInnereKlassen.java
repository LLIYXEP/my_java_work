package aufgaben;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



class Affe {
	
	private String name;
	private int groesse;
	
	public Affe(String name, int groesse) {
		super();
		this.name = name;
		this.groesse = groesse;
	}

	@Override
	public String toString() {
		return "Affe [name = " + name + ", grose = " + groesse + "]";
	}
	
	private class FormatImpl implements AffeFormat{

		@Override
		public String format(Affe a) {
			return "Affe: " + name + ", Groesse: " + groesse + " cm.";
		}
		
	}
	
	public static class CmpGroesse implements Comparator<Affe>{

		@Override
		public int compare(Affe a1, Affe a2) {
			return a1.groesse - a2.groesse;
		}
		
	}
	
	
	public AffeFormat getFormatter() {
		return this.new FormatImpl();
	}
	
	
} // end of Affe

interface AffeFormat{
	String format(Affe a);
}

public class KleineAufgabeInnereKlassen {

	public static void main(String[] args) {
		
		ArrayList<Affe> affeList = new ArrayList<Affe>();
		affeList.add(new Affe("Dota", 130));
		affeList.add(new Affe("Petra", 5000));
		affeList.add(new Affe("Moli", 90));
		affeList.add(new Affe("Pona", 110));
		
//		print(affeList);
//		
//		Affe.CmpGroesse cmp = new Affe.CmpGroesse();
////		
//		Collections.sort(affeList, cmp);
//		System.out.println();

//		print(affeList);
		
//		Affe affe = new Affe("Mark", 123);
//		Affe.CmpGroesse cmp2 = affe.new CmpGroesse();
//		Collections.sort(affeList, cmp2);
		
//		System.out.println();
//		print(affeList);
		
		System.out.println("********************************");
		
		
		for (int i = 0; i < affeList.size(); i++) {
			Affe a = affeList.get(i);
			AffeFormat fmt = a.getFormatter();
			System.out.println(fmt.format(a));
		}

		
		
		
	}
	
	static void print (ArrayList<Affe> affeList) {
		for (int i = 0; i < affeList.size(); i++) {
			System.out.println(i + 1 + ". " + affeList.get(i));
		}
	}
	
}
