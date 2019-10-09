package Lesson;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


class Bucher{
	String nameAuthor;

	public Bucher(String nameAuthor) {
		this.nameAuthor = nameAuthor;
	}

	@Override
	public String toString() {
		return "Bucher [nameAuthor=" + nameAuthor + "]";
	}
	
	
}

public class L49_Collections {
	public static void main(String[] args) {
		
//		List collection = new ArrayList(); // Может выводить по индексу как обычный массив
//		collection.add("1");
//		collection.add("2");
//		collection.add("3");
//		collection.set(2, "5");
//		collection.add(1, "6");
//		for (int i = 0; i < collection.size(); i++) {
//			System.out.println(collection.get(i));
//		}
		
		
//		*******************
//		Queue collection = new PriorityQueue(); // Выводит все объекты и потом удаляет их , size = 0;
//		collection.offer("1");
//		collection.offer("2");
//		collection.offer("3");
//		Iterator iterator = collection.iterator(); //Пробег по всей коллекции, массиву
//		while (iterator.hasNext()) {
//			System.out.println(collection.poll());
//		}
//		System.out.println(collection.size());
		
//		*****************
//		Set collection = new HashSet();  //Коллекция уникальных обьектов, выводит неповторяющиеся объекты
//		collection.add("1");
//		collection.add("2");
//		collection.add("2");
//		collection.add("2");           
//		collection.add("2");
//		collection.add("2");
//		collection.add("3");
//		for (Object object : collection) {
//			System.out.println(object);
//		}
//		System.out.println(collection.size());
		
		
//		*****************
		Map collection = new HashMap();  //Коллекция ключ - значение
		collection.put("1", "Dan Brown");
		collection.put("2", new Bucher("Karnegy"));
		collection.put("3", "Jack London");
		System.out.println(collection.get("2"));
//		Set set = collection.keySet();  //Вывести ключи
		Set set = collection.entrySet();  //Вывести Значения
		for (Object object : set) {
			System.out.println(object);
		}
//		System.out.println(collection.size());
		
		
//		Collection collection4 = new ArrayList();
//		
//		collection4.add("1");
//		collection4.add("2");
//		collection4.add("3");
//		collection4.remove("2");
//		
//		Iterator iterator = collection4.iterator(); //Пробег по всей коллекции, массиву
//		
//		for (Object object : collection4) {
//			System.out.println(object);
//		}
	}
}
