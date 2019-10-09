package Lesson;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class L54_Maps__________ {
	public static void main(String[] args) {
		Map map = new HashMap();
		Map map2 = new Hashtable();
		Map map3 = new LinkedHashMap();
		Map map4 = new TreeMap();
		map.put("1", "one");
		map.put("3", "three");
		map.put("2", "two");
		System.out.println(map.get("2"));
		Set set =  map.entrySet();
		for (Object o : set) {
			System.out.println(o);
		}
	}
}
