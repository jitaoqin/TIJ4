package initialization;
//: initialization/OptionalTrailingArguments.java

public class OptionalTrailingArguments {
	static void f(int required, String... trailing) {
		System.out.print("required: " + required + " ");
		for (String s : trailing)
			System.out.print(s + " ");
		System.out.println();
	}
	static void f2(Character... args) {
		System.out.print(args.getClass());
		System.out.println(" length " + args.length);
	}

	static void g(int... args) {
		System.out.print(args.getClass());
		System.out.println(" length " + args.length);
	}

	public static void main(String[] args) {
		f(1, "one");
		f(2, "two", "three");
		f(0);
		
		f2('a');
		f2();
		g(new int[]{1,2,3});
		g();
		System.out.println("int[]: " + new int[0].getClass());
	}
} /*
	 * Output: required: 1 one required: 2 two three required: 0
	 */// :~
