package aufgaben.filtern;

import java.util.ArrayList;

public class AufgabeFiltern {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(-4);
		list.add(77);
		
		System.out.println("list: " + list);
		
		/*
		 * A2
		 */
//		ArrayList<Integer> listGerade = filtern(list, 0);
//		System.out.println("list gerade: " + listGerade);
		
		/*
		 * A3
		 */
		int param = 1;
		ArrayList<Integer> listGerade = filtern2(list, param);
		System.out.println("list gerade: " + listGerade);
		
		
	} // end of main
	
	static ArrayList<Integer> filtern2(ArrayList<Integer> list, int param){
		ArrayList<Integer> listGerade = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			if (param < 1) {
				if (list.get(i) < 0) {
					listGerade.add(list.get(i));
				} 
			}
			if (param > 0) {
				if (list.get(i) > 0) {
					listGerade.add(list.get(i));
				} 
			}
		}
		return listGerade;
	}
	
	
	
	static ArrayList<Integer> filtern(ArrayList<Integer> list, int param){
		ArrayList<Integer> listGerade = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			if ((list.get(i) % 2) == param) {
				listGerade.add(list.get(i));
			}
		}
		return listGerade;
	}
	
}
