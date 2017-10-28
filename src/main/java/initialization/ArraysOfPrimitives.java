package initialization;

//: initialization/ArraysOfPrimitives.java
import static net.mindview.util.Print.*;

import java.util.Arrays;
import java.util.Random;

public class ArraysOfPrimitives {
	public static void main(String[] args) {
		// int[] a1,int a1[]都可以，后一种符合c，c++习惯，建议第一种
		int[] a1 = { 1, 2, 3, 4, 5 };
		int[] a2;
		a2 = a1;
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));

		Random rand = new Random(47);
		int[] a3 = new int[rand.nextInt(20)];
		print("length of a = " + a3.length);
		print(Arrays.toString(a3));

		Integer a4[]= { new Integer(1), new Integer(2), 3};
		Integer[] a5 = new Integer[] { new Integer(1), new Integer(2), 3};
		System.out.println(Arrays.toString(a4));
		System.out.println(Arrays.toString(a5));

	}
}
