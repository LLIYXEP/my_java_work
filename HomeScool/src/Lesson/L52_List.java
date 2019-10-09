package Lesson;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class L52_List {
	public static void main(String[] args) {
		List list = new ArrayList();
		List list2 = new Vector();
		List list3 = new LinkedList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
