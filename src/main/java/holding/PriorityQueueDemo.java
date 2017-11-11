package holding;

//: holding/Priorityjava
import java.util.*;
/*
 * 当你在PriorityQueue上调用offer()方法插入一个对象时，这个对象在队列中被排序。默认自然顺序，可以通过comparator来修改
 * 调用peek(),poll(),remove()获取队列中优先级最高的元素。
 * 允许重复，最小的值拥有最高的优先级，（空格比字母优先级高）
 */
public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
		Random rand = new Random(47);
		for (int i = 0; i < 10; i++)
			priorityQueue.offer(rand.nextInt(i + 10));
		printQ(priorityQueue);

		List<Integer> ints = Arrays.asList(25, 22, 20, 18, 14, 9, 3, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25);
		priorityQueue = new PriorityQueue<Integer>(ints);
		printQ(priorityQueue);
		priorityQueue = new PriorityQueue<Integer>(ints.size(), Collections.reverseOrder());
		priorityQueue.addAll(ints);
		printQ(priorityQueue);

		String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
		List<String> strings = Arrays.asList(fact.split(""));
		PriorityQueue<String> stringPQ = new PriorityQueue<String>(strings);
		printQ(stringPQ);
		stringPQ = new PriorityQueue<String>(strings.size(), Collections.reverseOrder());
		stringPQ.addAll(strings);
		printQ(stringPQ);

		Set<Character> charSet = new HashSet<Character>();
		for (char c : fact.toCharArray())
			charSet.add(c); // Autoboxing
		PriorityQueue<Character> characterPQ = new PriorityQueue<Character>(charSet);
		printQ(characterPQ);
	}

	public static void printQ(Queue queue) {
		while (queue.peek() != null)
			System.out.print(queue.remove() + " ");
		System.out.println();
	}
} /*
	 * Output: 0 1 1 1 1 1 3 5 8 14 1 1 2 3 3 9 9 14 14 18 18 20 21 22 23 25 25
	 * 25 25 23 22 21 20 18 18 14 14 9 9 3 3 2 1 1 A A B C C C D D E E E F H H I
	 * I L N N O O O O S S S T T U U U W W U U U T T S S S O O O O N N L I I H H
	 * F E E E D D C C C B A A A B C D E F H I L N O S T U W
	 */// :~
