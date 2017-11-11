package holding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import net.mindview.util.Print;
import net.mindview.util.TextFile;
/*
 *统计一个文件中每个单词出现元音字母总数
 */
public class Exercise16 {
	private final static Set<Character> vowels = new HashSet<Character>(
			Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

	public static void main(String[] args) {
		HashSet<String> processedWords = new HashSet<>();
		int fileVowels = 0;
		int wordVowels;
		for (String word : new TextFile("src/main/java/holding/Exercise16.java", "\\W+")) {
			wordVowels = 0;
			for (char letter : word.toCharArray()) {
				if (vowels.contains(letter)) {
					wordVowels++;
				}				
			}
			if (!processedWords.contains(word)) {
				processedWords.add(word);
				System.out.println(word + " has " + wordVowels + " vowel(s)");
			}
			fileVowels += wordVowels;
		}
		System.out.println("Total number of vowels in file : " + fileVowels);
	}
}
