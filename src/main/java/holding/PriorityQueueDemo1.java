package holding;

//: holding/PriorityQueueDemo.java
import java.util.*;

public class PriorityQueueDemo1 {
	public static void main(String[] args) {
		// 优先队列初始化1
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		Random rand = new Random(47);
		for (int i = 0; i < 10; i++)
			// priorityQueue.offer(rand.nextInt(i + 10));
			priorityQueue.offer(i);
		System.out.println(priorityQueue);
		// 优先队列初始化2
		List<Integer> ints = Arrays.asList(25, 22, 20, 18, 14, 9, 3, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25);
		priorityQueue = new PriorityQueue<Integer>(ints);
		System.out.println(priorityQueue);
		// 优先队列初始化3
		priorityQueue = new PriorityQueue<Integer>(ints.size(), Collections.reverseOrder());
		priorityQueue.addAll(ints);
		System.out.println(priorityQueue);

	}
	
} /*
	 * Output: 0 1 1 1 1 1 3 5 8 14 
	 * 1 1 2 3 3 9 9 14 14 18 18 20 21 22 23 25 25
	 * 25 25 23 22 21 20 18 18 14 14 9 9 3 3 2 1 1 
	 * 
	 */// :~
