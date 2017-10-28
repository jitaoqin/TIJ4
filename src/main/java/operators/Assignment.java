package operators;//: operators/Assignment.java

// Assignment with objects is a bit tricky.

import static net.mindview.util.Print.*;

class Tank {
	int level;
}

public class Assignment {
	public static void main(String[] args) {
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		t1.level = 9;
		t2.level = 47;
		print("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
		t1 = t2;
		print("2: t1.level: " + t1.level + ", t2.level: " + t2.level);
		t1.level = 27;
		print("3: t1.level: " + t1.level + ", t2.level: " + t2.level);
	}
} /*
	 * Output: 1: t1.level: 9, t2.level: 47 2: t1.level: 47, t2.level: 47 3:
	 * t1.level: 27, t2.level: 27
	 * 原本t1包含的对对象的引用，是指向一个值为9的对象。在对t1赋值的时候，这个引用被覆盖，也就是丢失了，
	 * 那个不在被引用的对象由垃圾回收器自动清理，称为别名现象 。
	 */// :~
