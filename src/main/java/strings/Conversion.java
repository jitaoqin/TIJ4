package strings;

//: strings/Conversion.java
import java.math.*;
import java.util.*;
/*
 * 转换可分为以下几类： 
1. 常规 - 可应用于任何参数类型 
2. 字符 - 可应用于表示 Unicode 字符的基本类型：char、Character、byte、Byte、short 和 Short。
	当 Character.isValidCodePoint(int) 返回 true 时，可将此转换应用于 int 和 Integer 类型 
3. 数值 
      1. 整数 - 可用于 Java 的整数类型：byte、Byte、short、Short、int、Integer、long、Long 和 BigInteger 
      2. 浮点 - 可用于 Java 的浮点类型：float、Float、double、Double 和 BigDecimal 
4. 日期/时间 - 可应用于 Java 的、能够对日期或时间进行编码的类型：long、Long、Calendar 和 Date。 
5. 百分比 - 产生字面值 '%' ('\u0025') 
6. 行分隔符 - 产生特定于平台的行分隔符 


对于其他类型的参数，只要部位null，转换的结果为true，0也是true
 */
public class Conversion {
	public static void main(String[] args) {
		Formatter f = new Formatter(System.out);
		
		char u = 'a';
		System.out.println("u = 'a'字符型可以输出为字符，字符串，boolean，散列码");
		f.format("s: %s\n", u);
		//f.format("d: %d\n", u);
		f.format("c: %c\n", u);
		f.format("b: %b\n", u);
		// f.format("f: %f\n", u);
		// f.format("e: %e\n", u);
		// f.format("x: %x\n", u);
		f.format("h: %h\n", u);

		int v = 97;
		System.out.println("v = 121 int型可输出为整型，字符型，boolean，字符串，16进制，散列码");
		f.format("d: %d\n", v);
		f.format("c: %c\n", v);
		f.format("b: %b\n", v);
		f.format("s: %s\n", v);
		// f.format("f: %f\n", v);
		// f.format("e: %e\n", v);
		f.format("x: %x\n", v);
		f.format("h: %h\n", v);

		BigInteger w = new BigInteger("50000000000000");
		System.out.println("w = new BigInteger(\"50000000000000\")");
		f.format("d: %d\n", w);
		// f.format("c: %c\n", w);
		f.format("b: %b\n", w);
		f.format("s: %s\n", w);
		// f.format("f: %f\n", w);
		// f.format("e: %e\n", w);
		f.format("x: %x\n", w);
		f.format("h: %h\n", w);

		double x = 179.543;
		System.out.println("x = 179.543***************");
		// f.format("d: %d\n", x);
		// f.format("c: %c\n", x);
		f.format("b: %b\n", x);
		f.format("s: %s\n", x);
		f.format("f: %f\n", x);
		f.format("e: %e\n", x);
		// f.format("x: %x\n", x);
		f.format("h: %h\n", x);

		Conversion y = new Conversion();
		System.out.println("y = new Conversion()**************************");
		// f.format("d: %d\n", y);
		// f.format("c: %c\n", y);
		f.format("b: %b\n", y);
		f.format("s: %s\n", y);
		// f.format("f: %f\n", y);
		// f.format("e: %e\n", y);
		// f.format("x: %x\n", y);
		f.format("h: %h\n", y);

		boolean z = false;
		System.out.println("z = false******************");
		// f.format("d: %d\n", z);
		// f.format("c: %c\n", z);
		f.format("b: %b\n", z);
		f.format("s: %s\n", z);
		// f.format("f: %f\n", z);
		// f.format("e: %e\n", z);
		// f.format("x: %x\n", z);
		f.format("h: %h\n", z);
	}
} /*
	 * Output: (Sample) u = 'a' s: a c: a b: true h: 61 v = 121 d: 121 c: y b:
	 * true s: 121 x: 79 h: 79 w = new BigInteger("50000000000000") d:
	 * 50000000000000 b: true s: 50000000000000 x: 2d79883d2000 h: 8842a1a7 x =
	 * 179.543 b: true s: 179.543 f: 179.543000 e: 1.795430e+02 h: 1ef462c y =
	 * new Conversion() b: true s: Conversion@9cab16 h: 9cab16 z = false b:
	 * false s: false h: 4d5
	 */// :~
