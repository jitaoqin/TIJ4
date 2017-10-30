package reusing;

//: reusing/Beetle.java
// The full process of initialization.
import static net.mindview.util.Print.*;

class Insect {
	private int i = 9;
	protected int j;

	Insect() {
		print("i = " + i + ", j = " + j);
		j = 39;
	}

	private static int x1 = printInit("static Insect.x1 initialized");

	static int printInit(String s) {
		print(s);
		return 47;
	}
}

/*
 * 每个类的编译代码都存在于它自己的独立的文件中。该文件只在需要使用程序代码时才会被加载。一般来说，类的代码在初次使用时加载，】
 * 它通常是指加载发生于创建类的第一个对象的时候，但是当访问static域或static方法时，也会被加载。
 */
public class Beetle extends Insect {
<<<<<<< HEAD
	private int k = printInit("Beetle.k initialized");
=======
	
	private int k = printInit("Beetle.k initialized");
	private static int x2 = printInit("static Beetle.x2 initialized");
>>>>>>> a2695fb3f506f85eef23d67eeb4e0e10684c57b1

	public Beetle() {
		print("k = " + k);
		print("j = " + j);
	}

<<<<<<< HEAD
	private static int x2 = printInit("static Beetle.x2 initialized");

=======
>>>>>>> a2695fb3f506f85eef23d67eeb4e0e10684c57b1
	public static void main(String[] args) {
		print("Beetle constructor");
		Beetle b = new Beetle();
	}
} /*
	 * Output: static Insect.x1 initialized static Beetle.x2 initialized Beetle
	 * constructor i = 9, j = 0 Beetle.k initialized k = 47 j = 39
	 */// :~
