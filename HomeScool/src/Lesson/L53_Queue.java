package Lesson;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class L53_Queue {
	public static void main(String[] args) {
		Queue queue = new LinkedList();      // Упорядочнная очередь
		Queue queue2 = new PriorityQueue();  // Отсортированная очередь
		queue.add("1");
		queue.add("3");
		queue.add("2");
		while (queue.size() > 0) {
			System.out.println(queue.poll());
		}
		System.out.println(queue.size());
		
		queue2.add("1");
		queue2.add("3");
		queue2.add("2");
		while (queue2.size() > 0) {
			System.out.println(queue2.poll());
		}
		System.out.println(queue2.size());
		
		
	}
}
