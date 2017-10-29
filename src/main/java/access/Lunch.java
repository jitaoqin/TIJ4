package access;
class Soup1 {
	private Soup1() {
	}
	// (1) Allow creation via static method:
	public static Soup1 makeSoup() {
		//可以在返回引用之前做一些事情，比如计对象个数
		return new Soup1();
	}
}
class Soup2 {
	private Soup2() {
	}
	// (2) Create a static object and return a reference
	// upon request.(The "Singleton" pattern):始终只能创建一个对象
	private static Soup2 ps1 = new Soup2();
	public static Soup2 access() {
		return ps1;
	}
	public void f() {
	}
}
public class Lunch {
	void testPrivate() {		
		// ! Soup1 soup = new Soup1();
	}
	void testStatic() {
		Soup1 soup = Soup1.makeSoup();
	}
	void testSingleton() {
		Soup2.access().f();
	}
} /// :~
