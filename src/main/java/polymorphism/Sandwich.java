//: polymorphism/Sandwich.java
// Order of constructor calls.
package polymorphism;

import static net.mindview.util.Print.*;

/*
 * 构造器检查对象是否被正确地构造。导出类只能访问它自己的成员，不能访问基类中的成员。
 * 只有基类的构造器才具有恰当的知识和权限来对自己的元素进行初始化。因此必须令所有构造器都得到调用，否则
 * 不能正确构造完整对象。
 * 
 */
class Meal {
	Meal() {
		print("Meal()");
	}
}

class Bread {
	Bread() {
		print("Bread()");
	}
}

class Cheese {
	Cheese() {
		print("Cheese()");
	}
}

class Lettuce {
	Lettuce() {
		print("Lettuce()");
	}
}

class Lunch extends Meal {
	Lunch() {
		print("Lunch()");
	}
}

class PortableLunch extends Lunch {
	PortableLunch() {
		print("PortableLunch()");
	}
}

public class Sandwich extends PortableLunch {
	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Lettuce l = new Lettuce();

	public Sandwich() {
		print("Sandwich()");
	}

	public static void main(String[] args) {
		new Sandwich();
	}
} /*
	 * Output: Meal() Lunch() PortableLunch() Bread() Cheese() Lettuce() Sandwich()
	 */// :~
