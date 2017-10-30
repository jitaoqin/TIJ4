package reusing;

//: reusing/FinalData.java
// The effect of final on fields.
import java.util.*;
import static net.mindview.util.Print.*;

class Value {
	int i; // Package access
	public Value(int i) {
		this.i = i;
	}
}
/*
 *  final使用場合:一個永不改变的编译时常量，一個在运行时被初始化的值，不希望被改变；
 *  对于基本类型，final使数值恒定不变，对于对象，final使引用恒定不变。
 * 	赋值：必须在域的定义处或者构造器内赋值。
 */
public class FinalData {
	private static Random rand = new Random(47);
	private String id;
	public FinalData(String id) {
		this.id = id;
	}
	// Can be compile-time constants:valueOne,VAL_TWO都是带有编译时数值的final基本类型，可以用做编译期常量，没有重大区别，
	private final int valueOne = 9;
	private static final int VALUE_TWO = 99;
	// Typical public constant:
	public  static final int VALUE_THREE = 39;
	// Cannot be compile-time constants: 运行时赋值，
	private final int i4 = rand.nextInt(20);
	static  final int INT_5 = rand.nextInt(20);
	
	private Value v1 = new Value(11);
	private final Value v2 = new Value(22);
	private static final Value VAL_3 = new Value(33);
	private final int[] a = { 1, 2, 3, 4, 5, 6 };

	public String toString() {
		return id + ": " + "i4 = " + i4 + ", INT_5 = " + INT_5;
	}
	public static void main(String[] args) {
		FinalData fd1 = new FinalData("fd1");
		// ! fd1.valueOne++; // Error: can't change value
		// Object isn't constant!       23
		System.out.println(++fd1.v2.i);
		fd1.v1 = new Value(9); // OK -- not final    
		System.out.println(fd1.v1.i);
		for (int i = 0; i < fd1.a.length; i++)
			fd1.a[i]++; 
		// ! fd1.v2 = new Value(0); // Error: Can't
		// ! fd1.VAL_3 = new Value(1); // change reference
		 //fd1.a = new int[3];
		System.out.println(Arrays.toString(fd1.a));
		print(fd1);
		print("Creating new FinalData");
		FinalData fd2 = new FinalData("fd2");
		print(fd1);
		print(fd2);
	}
} /*
	 * Output: fd1: i4 = 15, INT_5 = 18 Creating new FinalData fd1: i4 = 15,
	 * INT_5 = 18 fd2: i4 = 13, INT_5 = 18
	 */// :~
