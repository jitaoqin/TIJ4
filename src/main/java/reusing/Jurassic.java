package reusing;
//: reusing/Jurassic.java
// Making an entire class final.
class SmallBrain {
}

final class Dinosaur {
	int i = 7;
	int j = 1;
	SmallBrain x = new SmallBrain();
	void f() {
	}
}
// ! class Further extends Dinosaur {}
// error: Cannot extend final class 'Dinosaur'
/*
 * final 类不能被继承，final类中所有方法都隐含final，无法覆盖，
 */
public class Jurassic {
	public static void main(String[] args) {
		Dinosaur n = new Dinosaur();
		n.f();
		n.i = 40;
		n.j++;
	}
} /// :~
