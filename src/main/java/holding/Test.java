package holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.RandomAccess;

public class Test {
	private static final int SHUFFLE_THRESHOLD = 4;
	public static void main(String[] args) {
		List list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		shuffle(list,new Random(47));
		//System.out.println(list);
	}

	public static void shuffle(List<?> list, Random rnd) {
		int size = list.size();
		if (size < SHUFFLE_THRESHOLD || list instanceof RandomAccess) {
			for (int i = size; i > 1; i--){
				swap(list, i - 1, rnd.nextInt(i));
				System.out.println(list);
			}
		} 
	}
	public static void swap(List<?> list, int i, int j) {
		final List l = list;
		l.set(i, l.set(j, l.get(i)));
	}
	
}
