package innerclasses;
//: innerclasses/Parcel8.java

import javax.swing.plaf.synth.SynthSpinnerUI;

//匿名类带参数
/*
 * 如果定义一个匿名内部类，并且希望它使用一个在其外部定义的对象，那么编译器会要求其参数引用是final，否则编译时错误。
 * 对于匿名类而言，实例初始化的实际效果就是构造器。匿名类可以扩展类，也可以实现接口，但是两者不能兼备，如果实现接口，也只能实现一个接口。
 */

public class Parcel8 {
	public Wrapping wrapping(int x) {
		// Base constructor call:
		return new Wrapping(x) { // Pass constructor argument.
			public int value() {
				return super.value() * 47;
			}
		}; // Semicolon required
	}

	public Destination destination(final String dest) {
		return new Destination() {
			private String label = dest;

			public String readLabel() {
				return label;
			}
		};
	}

	public static void main(String[] args) {
		Parcel8 p = new Parcel8();
		Wrapping w = p.wrapping(10);
		Destination d = p.destination("Tasmania");
		System.out.println(w.value());
	}
} /// :~470
