package innerclasses;
//: innerclasses/Parcel7.java
// Returning an instance of an anonymous inner class.


public class Parcel7 {
	public Contents contents() {
		return new Contents() { // Insert a class definition
			private int i = 11;

			public int value() {
				return i;
			}
		}; // Semicolon required in this case
	}

	/*
	 * 创建一个继承自Contents的匿名类的对象，通过new表达式返回的引用被自动向上转型为对Contents的引用，简化形式如下
	 * class MyContents implements Contents {
		private int i = 11;
		public int value() {
			return i;
		}
	}

	public Contents contents2() {
		return new MyContents();
	}*/

	public static void main(String[] args) {
		Parcel7 p = new Parcel7();
		Contents c = p.contents();
	}
} /// :~
