package reusing;

//: reusing/FinalArguments.java
// Using "final" with method arguments.
class Gizmo {
	int i;
	
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
	@Override
	public String toString() {
		return "Gizmo [i=" + i + "]";
	}

	public void spin() {
	}
}

/*
 * final参数：Java允许在参数列表中以声明的方式将参数指定为final，无法在方法中更改参数引用所指向的对象
 * 主要用来向匿名内部类传递参数
 */
public class FinalArguments {
	void with(final Gizmo g) {
		// ! g = new Gizmo(); // Illegal -- g is final
		g.i = 2;
		System.out.println(g);
	}

	void without(Gizmo g) {
		g = new Gizmo(); // OK -- g not final
		System.out.println(g);
		g.spin();
	}

	// void f(final int i) { i++; } // Can't change
	// You can only read from a final primitive:
	int g(final int i) {
		return i + 1;
	}

	public static void main(String[] args) {
		FinalArguments bf = new FinalArguments();
		Gizmo gizmo  = new Gizmo();	
		gizmo.setI(1);
		bf.with(gizmo);
		bf.without(gizmo);
	}
} /// :~
