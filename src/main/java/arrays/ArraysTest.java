package arrays;

import static net.mindview.util.Print.print;

import java.util.Arrays;

public class ArraysTest {
	public static void main(String[] args) {
		Integer[] u = new Integer[10];
		Integer[] v = new Integer[5];
		Arrays.fill(u, new Integer(47));
		Arrays.fill(v, new Integer(99));
		print("u = " + Arrays.toString(u));
		print("v = " + Arrays.toString(v));
		System.arraycopy(v, 0, u, u.length / 2, v.length);// 原来的数组,不会执行自动包装盒拆包，两个数组必须是相同的确切类型，
		// v = Arrays.copyOfRange(u, 0, 8);创建一个新对象
		// v = Arrays.copyOf(u, 8); 创建一个新对象
		print("u = " + Arrays.toString(u));

		int[] a1 = new int[10];
		int[] a2 = new int[10];
		Arrays.fill(a1, 47);
		Arrays.fill(a2, 47);
		print(Arrays.equals(a1, a2));
		a2[3] = 11;
		print(Arrays.equals(a1, a2));
		String[] s1 = new String[4];
		Arrays.fill(s1, "Hi");
		String[] s2 = { new String("Hi"), new String("Hi"), new String("Hi"), new String("Hi") };
		print(Arrays.equals(s1, s2));

		int[][][] a = new int[2][2][4];
		System.out.println(Arrays.deepToString(a));
	}

}
