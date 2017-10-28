package initialization;
//: initialization/OrderOfInitialization.java
// Demonstrates initialization order.
import static net.mindview.util.Print.*;

//法阻止自动初始化的进行，他将在构造器被调用之前发生，
//在类的内部，变量定义的先后顺序决定了初始化的顺序。即使变量定义散步与方法定义之间，它们仍旧会在任何方法（包括构造器）被
//调用之前得到初始化,w3被调用两次，第二次在构造器内，第一次被回收
class Window {
	Window(int marker) {
		print("Window(" + marker + ")");
	}
}

class House {
	Window w1 = new Window(1); // Before constructor
	House() {
		// Show that we're in the constructor:
		print("House()");
		w3 = new Window(33); // Reinitialize w3
	}
	Window w2 = new Window(2); // After constructor
	void f() {print("f()");}
	Window w3 = new Window(3); // At end
}

public class OrderOfInitialization {
	public static void main(String[] args) {
		House h = new House();
		h.f(); // Shows that construction is done
	}
} /*
	 * Output: Window(1) Window(2) Window(3) House() Window(33) f()
	 */// :~
