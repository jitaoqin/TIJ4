package initialization;

//: initialization/ExplicitStatic.java
// Explicit static initialization with the "static" clause.
import static net.mindview.util.Print.*;

class Cup {
	Cup(String marker) {
		print(marker);
	}

	void f(int marker) {
		print("f(" + marker + ")");
	}
}

class Cups {
	Cup cup3;
	static Cup cup1;
	static Cup cup2;
	Cup cup4;
	{
		cup3 = new Cup("代码块 cup3");
		cup3 = new Cup("代码块 cup4");
		print("cup3 & cup4 initialized");
		
	}
	static {
		cup1 = new Cup("static 代码块 cup1");
		cup2 = new Cup("static 代码块 cup2");
		print("cup1 & cup2 initialized");
	}
	Cup cup = new Cup("cup5");
	Cups() {
		print("Cups()");
	}
	Cups(int i) {
		print("Cups("+i+")");
	}
}

public class ExplicitStatic {
	public static void main(String[] args) {
		print("Inside main()");
		Cups.cup1.f(99); // (1)
		new Cups();
		print("new Cups() completed");
		new Cups(1);
		print("new Cups(1) completed");
	}
	// static Cups cups1 = new Cups(); // (2)
	// static Cups cups2 = new Cups(); // (2)
} /*
	 * Output: Inside main() Cup(1) Cup(2) f(99)
	 */// :~
