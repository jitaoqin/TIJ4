package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	public static void main(String[] args) {
		String input = "abcdef\nghigklmn";
		String regexp ="(?i)\\w(\\w)";
		Matcher matcher = Pattern.compile(regexp,Pattern.MULTILINE).matcher(input);
		StringBuffer sBuffer = new StringBuffer();
		
		while(matcher.find()){
			System.out.println(matcher.group(0));
			matcher.appendReplacement(sBuffer,matcher.group()+"@");
		}
		System.out.println(sBuffer);
	}
}
