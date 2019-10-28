package aufgaben.filtern;

import java.util.ArrayList;

interface Filter{
	public abstract boolean istOk(int value);
}

class FilterGerade implements Filter{

	@Override
	public boolean istOk(int value) {
		return value % 2 == 0;
	}
	
}

class FilterPositive implements Filter{

	@Override
	public boolean istOk(int value) {
		return value > 0;
	}
	
}

class FilterMit1 implements Filter{

	@Override
	public boolean istOk(int value) {
		String valueofstr = String.valueOf(Math.abs(value));
		return valueofstr.startsWith("1");
	}
	 
}

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
//		int param = 1;
//		ArrayList<Integer> listGerade = filtern2(list, param);
//		System.out.println("list gerade: " + listGerade);
		
		/*
		 * A4
		 */
		ArrayList<Integer> listGerade = filtern3(list, new FilterGerade());
		System.out.println("list gerade: " + listGerade);
		
		ArrayList<Integer> listGerade2 = filtern3(list, new FilterPositive());
		System.out.println("list positive: " + listGerade2);
		
		ArrayList<Integer> listGerade3 = filtern3(list, new FilterMit1());
		System.out.println("list mit Zahlen die mit 1 starten: " + listGerade3);
		
		
	} // end of main
	
	
	static ArrayList<Integer> filtern3(ArrayList<Integer> list,Filter logik){
		ArrayList<Integer> back = new ArrayList<Integer>();
		for (Integer value : list) {
			if (logik.istOk(value)) {
				back.add(value);
			}
		}
		return back;
	}
	
	
	
	
	
	
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
