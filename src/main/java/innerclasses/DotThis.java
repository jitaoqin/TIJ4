package innerclasses;
//: innerclasses/DotThis.java

// Qualifying access to the outer-class object.

public class DotThis {
	void f() {
		System.out.println("DotThis.f()");
	}

	public class Inner {
		public DotThis outer() {
			return DotThis.this;
			//对外部对象的引用可以使用外部类的名字后面紧跟原点和this
			// A plain "this" would be Inner's "this"
		}
	}
	public Inner inner() {
		return new Inner();
	}
	public static class Inner2{
		public Inner2(){
			System.out.println("Inner2");
		}
	}

	public static void main(String[] args) {
		DotThis dt = new DotThis();
		//创建内部类对象的两种方式，1）调用方法2）在new表达式中提供对其他外部类对象的引用。3)静态类无需引用外部类，
		DotThis.Inner dti = dt.inner();
		DotThis.Inner dti2 = dt.new Inner();
		dti.outer().f();
		dti2.outer().f();
		DotThis.Inner2 dti3 = new Inner2();
	}
} /*
	 * Output: DotThis.f()
	 */// :~
