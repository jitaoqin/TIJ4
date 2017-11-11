package strings;
//: strings/Rudolph.java

public class Rudolph {
	public static void main(String[] args) {
		System.out.println("-1234".matches("-?\\d+"));
		System.out.println("5678".matches("-?\\d+"));
		System.out.println("+911".matches("-?\\d+"));
		System.out.println("+911".matches("(-|\\+)?\\d+"));
		for (String pattern : new String[] { "Rudolph", "[rR]udolph", "[rR][aeiou][a-z]ol.*", "R.*" })
			System.out.println("Rudolph".matches(pattern));
		}
} /*
	 * Output: true true true true
	 */// :~
