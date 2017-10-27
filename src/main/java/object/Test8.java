package object;

class StaticTest {
	static int i = 47;
}

class Incrementable {
	static void increment() { StaticTest.i++; }
}
//编写一个特定的程序，无论创建多少对象，这个类中的某个特定的static域只有一个实例
public class Test8 {
	public static void main(String[] args) {
		System.out.println("StaticTest.i= " + StaticTest.i);
		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();
		System.out.println("st1.i= " + st1.i);
		System.out.println("st2.i= " + st2.i);
		Incrementable.increment();
		System.out.println("After Incrementable.increment() called: ");
		System.out.println("st1.i = " + st1.i);
		System.out.println("st2.i = " + st2.i);
		Incrementable.increment();
		System.out.println("After Incrementable.increment called: ");
		System.out.println("st1.i = " + st1.i);
		System.out.println("st2.i = " + st2.i);
		st1.i = 3;
		System.out.println("After st1.i = 3, ");
		System.out.println("st1.i = " + st1.i);
		System.out.println("st2.i = " + st2.i);
		System.out.println("Create another StaticTest, st3.");
		StaticTest st3 = new StaticTest();
		System.out.println("st3.i = " + st3.i);
	}
}