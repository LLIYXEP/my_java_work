package aufgabe_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


class Sportart implements Comparable<Sportart>{
	
	String name;
	boolean olympisch;
	
	
	@Override
	public String toString() {
		return "Sportart [name=" + name + ", olympisch=" + olympisch + "]";
	}
	public Sportart(String name, boolean olympisch) {
		super();
		this.name = name;
		this.olympisch = olympisch;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Sportart)) {
			return false;
		}
		
		Sportart sportart = (Sportart)obj;
		return name.equals(sportart.getName());
	}
	@Override
	public int compareTo(Sportart sa) {
		int erg = name.compareTo(sa.name);
		
		if (erg == 0) {
//			erg = Boolean.valueOf(olympisch).compareTo(Boolean.valueOf(sa.olympisch));
			erg = Boolean.compare(olympisch, sa.olympisch);
		}
		return erg;
	}
	
	
}

public class AufgabeSportart {

	public static void main(String[] args) {
		
		System.out.println("###### A10");
		Sportart s1 = new Sportart("Turnen", true);
		Sportart s2 = new Sportart("Reiten", true);
		Sportart s3 = new Sportart("Bowlen", false);
		Sportart s4 = new Sportart("Ringen", false);
		Sportart s5 = new Sportart("Fechten", true);
		List<Sportart> sports = new ArrayList<>();
		sports.add(s1);
		sports.add(s2);
		sports.add(s3);
		sports.add(s4);
		sports.add(s5);
		
		for (Sportart sportart : sports) {
			System.out.println(sportart);
		}
		boolean result = sports.contains(findObj(sports, "Ringen"));
		System.out.println("1: " + result);
		
		Sportart ringen = new Sportart("Ringen", false);
		System.out.println("2: " + sports.contains(ringen));
		
		Collections.sort(sports); // Sportart muss Comparable sein
		for (int i = 0; i < sports.size(); i++) {
			System.out.println(i + ". " + sports.get(i));
		}
		
		int index = Collections.binarySearch(sports, ringen); // Sportart muss Comparable sein
		System.out.println("Position : " + index);
		
		List<int[]> list = new ArrayList<int[]>();
		int[] a1 = { 1, 2, 3};
		int[] a2 = { -7, -5 };
		int[] a3 = { 101, 202, 303 };
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
		for (int[] i : list) {
			System.out.println(Arrays.toString(i));
			for (int j : i) {
				System.out.println(j);
			}
		}
	}
	
	static Sportart findObj(List<Sportart> l, String str){
		Sportart result = null;
		for (int i = 0; i < l.size(); i++) {
			if (l.get(i).getName().equals(str)) {
				return result = l.get(i);
			}
		}
		return result;
	}
	
	static boolean remove(List<String> strArr, String str) {
		boolean result = true;
		if (strArr.contains("fr")) {
			int i = strArr.indexOf("fr");
			strArr.remove(i);
			result = true;
			return result;
		} else {
			result = false;
			return false;
		}
	}
	
}
