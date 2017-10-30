package reusing;
//: reusing/FinalOverridingIllusion.java
// It only looks like you can override
// a private or private final method.
import static net.mindview.util.Print.*;

class WithFinals {
	// Identical to "private" alone:
	private final void f() {
		print("WithFinals.f()");
	}

	// Also automatically "final":
	private void g() {
		print("WithFinals.g()");
	}
}

class OverridingPrivate extends WithFinals {
	private final void f() {
		print("OverridingPrivate.f()");
	}

	private void g() {
		print("OverridingPrivate.g()");
	}
}

class OverridingPrivate2 extends OverridingPrivate {
	public final void f() {
		print("OverridingPrivate2.f()");
	}

	public void g() {
		print("OverridingPrivate2.g()");
	}
}
/*
 * 使用原因：把方法锁定，以妨任何继承类修改它的含义，出于设计考虑，想要确保继承中使方法行为保持不变，并且不会被覆盖
 * private方法 （隐含final）
 * 如果某个方法为private，它就不是基类的接口的一部分。
 */
public class FinalOverridingIllusion {
	public static void main(String[] args) {
		OverridingPrivate2 op2 = new OverridingPrivate2();
		op2.f();
		op2.g();
		// You can upcast:
		OverridingPrivate op = op2;
		// But you can't call the methods:
		// ! op.f();
		// ! op.g();
		// Same here:
		WithFinals wf = op2;
		// ! wf.f();
		// ! wf.g();
	}
} /*
	 * Output: OverridingPrivate2.f() OverridingPrivate2.g()
	 */// :~
