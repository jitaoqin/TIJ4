package reusing;
//: reusing/Detergent.java
// Inheritance syntax & properties.
import static net.mindview.util.Print.*;

class Cleanser {
	private String s = "Cleanser";
	public Cleanser(){
		System.out.println("Cleanser Constoructor");
	}
	public void append(String a) {
		s += a;
	}
	public void dilute() {
		append(" dilute()");
	}
	public void apply() {
		append(" apply()");
	}
	public void scrub() {
		append(" scrub()");
	}
	public String toString() {
		return s;
	}	
	public static void main(String[] args) {
		Cleanser x = new Cleanser();
		x.dilute();
		x.apply();
		x.scrub();
		print(x);
	}
}
/*
 * 可以为每个类都创建一个main()方法，方便单元测试，main都可以执行
 */
public class Detergent extends Cleanser {
	 public Detergent() {
		System.out.println("Detergent Constoructor");
	}
	// Change a method:	
	public void scrub() {
		append(" Detergent.scrub()");
		super.scrub(); // Call base-class version
	}

	// Add methods to the interface:
	public void foam() {
		append(" foam()");
	}

	// Test the new class:
	public static void main(String[] args) {
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		print(x);
		print("Testing base class:");
		Cleanser.main(args);
	}
} /*
	 * Output: Cleanser dilute() apply() Detergent.scrub() scrub() foam() Testing
	 * base class: Cleanser dilute() apply() scrub()
	 */// :~
