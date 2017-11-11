package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E10_TestRegExp {
	public static void main(String[] args) {
		String input = "Java now has regular expressions";
		String[] regExps ={"^Java","\\Breg.*","n.w\\s+h(a|i)s","s?","s*","s{4}","s{1}","s{0,3}"};
		for (String regexp : regExps) {
			Pattern pattern = Pattern.compile(regexp);
			Matcher matcher = pattern.matcher(input);
			System.out.print("regexp: "+regexp);
			while(matcher.find()){
				System.out.print(matcher.start()+" "+matcher.group());
			}
			System.out.println();
		}
		
	}

}
