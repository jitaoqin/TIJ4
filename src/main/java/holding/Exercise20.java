package holding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import net.mindview.util.Print;
import net.mindview.util.TextFile;
import typeinfo.pets.Pet;
/*
 * 跟踪每一个元音字母的个数
 */
public class Exercise20 {
	private final static Set<Character> vowels = new HashSet<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

	public static void main(String[] args) {
		Map<Character, Integer> count = new HashMap<>();			
		Map<String,Map<Character, Integer>> wordCount = new HashMap<>();
		int fileVowels = 0;
		int wordVowels;
		Map<Character, Integer> tempCount = new HashMap<>();
		for (String word : new TextFile("src/main/java/holding/Exercise16.java", "\\W+")) {
			wordVowels = 0;
			tempCount.clear();
			for (char letter : word.toCharArray()) {
				if (vowels.contains(letter)) {
					wordVowels++;
					count.put(letter, count.get(letter)==null?1:count.get(letter)+1);
					tempCount.put(letter, tempCount.get(letter)==null?1:tempCount.get(letter)+1);
				}
				
			}
			if (!wordCount.containsKey(word)) {
				wordCount.put(word,tempCount);
				System.out.print(word + " has " + wordVowels + " vowel(s)");
				System.out.println(tempCount);
			}
			fileVowels += tempCount.size();
		}
		System.out.println("Total number of vowels in file : " + fileVowels);
		System.out.println(count);
		//System.out.println(wordCount);
	}
}
