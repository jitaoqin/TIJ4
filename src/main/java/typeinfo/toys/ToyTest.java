//: typeinfo/toys/ToyTest.java
// Testing class Class.
package typeinfo.toys;

import static net.mindview.util.Print.*;

import typeinfo.toys.FancyToy.FancyToyInner;

interface HasBatteries {
}

interface Waterproof {
}

interface Shoots {
}

class Toy {
	// Comment out the following default constructor
	// to see NoSuchMethodError from (*1*)
	Toy() {
	}

	Toy(int i) {
	}
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {
	FancyToy() {
		super(1);
	}
	class FancyToyInner{
	FancyToyInner() {
			// TODO Auto-generated constructor stub
		}
	}
}

/*
 * getName()方法，以String的形式，返回Class对象的‘实体’名称； getSimpleName()方法，是获取源代码中给出的‘底层类’简称
 * 比如byte[]类型,前者就是[B,后者就是byte[] ,比如byte[][]类型,前者就是[[B,后者就是byte[][]
 */
public class ToyTest {
	static void printInfo(Class cc) {
		print("Class name: " + cc.getName() + " is interface ? [" + cc.isInterface() + "]");
		print("Simple name: " + cc.getSimpleName());
		print("Canonical name : " + cc.getCanonicalName());
	}

	public static void main(String[] args) {
		Class c = null;
		try {
			c = Class.forName("typeinfo.toys.FancyToy");
			System.out.println(c.getSimpleName());
			System.out.println(c.getName());
		} catch (ClassNotFoundException e) {
			print("Can't find FancyToy");
			System.exit(1);
		}
		printInfo(c);
		for (Class face : c.getInterfaces())
			printInfo(face);
		Class up = c.getSuperclass();
		Object obj = null;
		try {
			// Requires default constructor:
			obj = up.newInstance();
		} catch (InstantiationException e) {
			print("Cannot instantiate");
			System.exit(1);
		} catch (IllegalAccessException e) {
			print("Cannot access");
			System.exit(1);
		}
		printInfo(obj.getClass());
		FancyToy fancyToy = new FancyToy();
		FancyToy.FancyToyInner fTInner = fancyToy.new FancyToyInner();
		printInfo(fTInner.getClass());
		int[][] a = new int[10][10];
		printInfo(a.getClass());
	}
} /*
	 * Output: Class name: typeinfo.toys.FancyToy is interface? [false] Simple
	 * name: FancyToy Canonical name : typeinfo.toys.FancyToy Class name:
	 * typeinfo.toys.HasBatteries is interface? [true] Simple name: HasBatteries
	 * Canonical name : typeinfo.toys.HasBatteries Class name:
	 * typeinfo.toys.Waterproof is interface? [true] Simple name: Waterproof
	 * Canonical name : typeinfo.toys.Waterproof Class name:
	 * typeinfo.toys.Shoots is interface? [true] Simple name: Shoots Canonical
	 * name : typeinfo.toys.Shoots Class name: typeinfo.toys.Toy is interface?
	 * [false] Simple name: Toy Canonical name : typeinfo.toys.Toy
	 */// :~
