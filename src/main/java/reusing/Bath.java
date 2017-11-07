package reusing;

//: reusing/Bath.java
// Constructor initialization with composition.
import static net.mindview.util.Print.*;

/* 组合语法
 * 初始化值的四中方式
 */
class Soap {
	private String s;
	Soap() {
		print("Soap()");
		s = "Constructed";
	}
	public String toString() {
		return s;
	}
}

public class Bath {
	private String 
	//1.Initializing at point of definition: 
	s1 = "Happy", s2 = "Happy", s3, s4;
	private Soap castille;
	private int i;
	private float toy;
	//2.在类的构造器中
	public Bath() {
		print("Inside Bath()");
		s3 = "Joy";
		toy = 3.14f;
		castille = new Soap();
	}

	// 4.使用实例初始化 Instance initialization:
	{
		i = 47;
	}

	public String toString() {
		//3.Delayed initialization:在生成对象不值得及不必每次都生成对象的情况下，减少额外负担。 
		if (s4 == null) 
			s4 = "Joy";
		return "s1 = " + s1 + "\n" + "s2 = " + s2 + "\n" + "s3 = " + s3 + "\n" + "s4 = " + s4 + "\n" + "i = " + i + "\n"
				+ "toy = " + toy + "\n" + "castille = " + castille;
	}

	public static void main(String[] args) {
		Bath b = new Bath();
		print(b);
	}
} /*
	 * Output: Inside Bath() Soap() s1 = Happy s2 = Happy s3 = Joy s4 = Joy i = 47
	 * toy = 3.14 castille = Constructed
	 */// :~
