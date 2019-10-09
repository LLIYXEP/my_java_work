package Lesson;

import java.util.ArrayList;
import java.util.List;

public class L25_List{
	
	public static void main(String[] args) {
		

		Integer i = 5;
		int k = Integer.parseInt("2");
		int g = i.valueOf("3");
		double s = i.doubleValue();
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}
}
