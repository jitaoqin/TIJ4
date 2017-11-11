package strings;

import static net.mindview.util.Print.print;

//: strings/Splitting.java
import java.util.*;
import java.util.regex.Pattern;

public class Splitting {
	public static String knights = "Then, when you have found the shrubbery, you must "
			+ "cut down the mightiest tree in the forest... " + "with... a herring!";

	public static void split(String regex) {
		//knights.split(regex)=Pattern.compile(regex).split(knights)
		System.out.println(Arrays.toString(knights.split(regex)));	
		System.out.println(Arrays.toString(Pattern.compile(regex).split(knights)));
		// Only do the first three:
		System.out.println(Arrays.toString(Pattern.compile(regex).split(knights,3)));
		
		System.out.println(knights.replaceFirst("e\\w+", "@@@@@@"));
		System.out.println(knights.replace("e\\w+", "@@@@@@"));
		System.out.println(knights.replaceAll("e\\w+", "@@@@@@"));
		System.out.println(knights.replaceAll("shrubbery|tree|herring","@@@@@"));
	}
	
	public static void main(String[] args) {		
		split("\\W+"); // Non-word characters		
	}
} /*
	 * Output: [Then,, when, you, have, found, the, shrubbery,, you, must, cut,
	 * down, the, mightiest, tree, in, the, forest..., with..., a, herring!]
	 * [Then, when, you, have, found, the, shrubbery, you, must, cut, down, the,
	 * mightiest, tree, in, the, forest, with, a, herring] [The, whe, you have
	 * found the shrubbery, you must cut dow, the mightiest tree i, the
	 * forest... with... a herring!]
	 */// :~
