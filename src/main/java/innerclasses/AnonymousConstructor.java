package innerclasses;

//: innerclasses/AnonymousConstructor.java
// Creating a constructor for an anonymous inner class.
import static net.mindview.util.Print.*;

abstract class Base {
	public Base(int i) {
		print("Base constructor, i = " + i);
	}

	public abstract void f();
}
//通过实例初始化，就能达到为匿名内部类创建一个构造器的效果，i不要求是final，因为被传递给匿名类的基类的构造器，并不会在匿名类部直接使用
public class AnonymousConstructor {
	public static Base getBase(int i) {
		return new Base(i) {
			{
				print("Inside instance initializer");
			}

			public void f() {
				print("In anonymous f()");
			}
		};
	}

	public static void main(String[] args) {
		Base base = getBase(47);
		base.f();
	}
} /*
	 * Output: Base constructor, i = 47 Inside instance initializer In anonymous
	 * f()
	 */// :~
