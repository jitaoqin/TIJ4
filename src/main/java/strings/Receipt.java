package strings;

//: strings/Receipt.java
import java.util.*;

/* 
 * 默认右对齐，通过"-"改变对齐方向
 * 1.常规类型、字符类型和数值类型的格式说明符的语法如下：
 	%[argument_index$][flags][width][.precision]conversion
      可选的 argument_index 是一个十进制整数，用于表明参数在参数列表中的位置。第一个参数由 "1$" 引用，第二个参数由 "2$" 引用，依此类推。 
      可选的 flags 是修改输出格式的字符集。有效标志的集合取决于转换类型。  
      可选 width 是一个非负十进制整数，表明要向输出中写入的最少字符数。 必要时添加空格。可以用于各种类型的数据
      可选 precision 是一个非负十进制整数，通常用来限制字符数。特定行为取决于转换类型。 precision应用于String输出字符的最大数量，用于浮点数表示小数部分显示出来的位数（默认6位小数）,如果小数过多则输入，太少则补零。用于整数异常
      所需的 conversion 是一个表明应该如何格式化参数的字符。给定参数的有效转换集合取决于参数的数据类型。
	2.用来表示日期和时间类型的格式说明符的语法如下: 
	%[argument_index$][flags][width]conversion
	所需的 conversion 是一个由两字符组成的序列。第一个字符是 't' 或 'T'。第二个字符表明所使用的格式。这些字符类似于但不完全等同于那些由 GNU date 和 POSIX strftime(3c) 定义的字符。
	3.与参数不对应的格式说明符的语法如下： 
	%[flags][width]conversion
	所需的 conversion 是一个表明要在输出中所插内容的字符。
 */
public class Receipt {
	private double total = 0;
	private Formatter f = new Formatter(System.out);

	public void printTitle() {
		f.format("%-15s %5s %10s\n", "Item", "Qty", "Price");
		f.format("%-15s %5s %10s\n", "---------------", "-----", "----------");
	}

	public void print(String name, int qty, double price) {
		f.format("%-15.15s %5d %10.2f\n", name, qty, price);
		total += price;
	}

	public void printTotal() {
		f.format("%-15s %5s %10.2f\n", "Tax", "", total * 0.06);
		f.format("%-15s %5s %10s\n", "", "", "-----");
		f.format("%-15s %5s %10.2f\n", "Total", "", total * 1.06);
	}

	public static void main(String[] args) {
		int x = 5;
		double y = 5.332542;
		System.out.println("Row 1: [" + x + " " + y + "]");	// The old way:
		System.out.format("Row 1: [%d %f]\n", x, y);		// The new way:		
		System.out.printf("Row 1: [%d %f]\n", x, y);		// or
		System.out.println("*******************************************");
		Receipt receipt = new Receipt();
		receipt.printTitle();
		receipt.print("Jack's Magic Beans", 4, 4.25);
		receipt.print("Princess Peas", 3, 5.1);
		receipt.print("Three Bears Porridge", 1, 14.29);
		receipt.printTotal();
	}
} /*
	 * Output: Item Qty Price ---- --- ----- Jack's Magic Be 4 4.25 Princess
	 * Peas 3 5.10 Three Bears Por 1 14.29 Tax 1.42 ----- Total 25.06
	 */// :~
