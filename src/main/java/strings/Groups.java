package strings;

//: strings/Groups.java
import java.util.regex.*;
import static net.mindview.util.Print.*;

public class Groups {
	static public final String input = "Twas brillig, and the slithy toves\n" + "Did gyre and gimble in the wabe.\n"
			+ "All mimsy were the borogoves,\n" + "And the mome raths outgrabe.\n\n"
			+ "Beware the Jabberwock, my son,\n" + "The jaws that bite, the claws that catch.\n"
			+ "Beware the Jubjub bird, and shun\n" + "The frumious Bandersnatch.";

	public static void main(String[] args) {
		Matcher m = Pattern.compile("(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$").matcher(input);
		while (m.find()) {
			for (int j = 0; j <= m.groupCount(); j++)
				printnb("[" + m.group(j) + "]");
			print();
		}
		System.out.println("*********************************************");
		Matcher matcher = Pattern.compile("\\b[A-Z][_A-Za-z]*\\b").matcher(input);
		while(matcher.find()){
			for (int j = 0; j <= matcher.groupCount(); j++)
				printnb("[" + matcher.group(j) + "]");
			print();
		}
	}
} 	
	/*
	 * [the slithy toves][the][slithy toves][slithy][toves] [in the
	 * wabe.][in][the wabe.][the][wabe.] [were the borogoves,][were][the
	 * borogoves,][the][borogoves,] [mome raths outgrabe.][mome][raths
	 * outgrabe.][raths][outgrabe.] [Jabberwock, my son,][Jabberwock,][my
	 * son,][my][son,] [claws that catch.][claws][that catch.][that][catch.]
	 * [bird, and shun][bird,][and shun][and][shun] [The frumious
	 * Bandersnatch.][The][frumious Bandersnatch.][frumious][Bandersnatch.]]
	 */// :~
