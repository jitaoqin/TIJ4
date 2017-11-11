package holding;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import net.mindview.util.TextFile;

class WordCounter {
	private String word;
	private int frequency;
	public static final Comparator<WordCounter> CASE_INSENSITIVE_ORDER = new Comparator<WordCounter>() {
		@Override
		public int compare(WordCounter o1, WordCounter o2) {
			return o1.word.compareToIgnoreCase(o2.word);
		}
	};

	public WordCounter(String word) {
		this.word = word;
		frequency = 1;
	}
	void incFrequency() {++frequency;}
	String getWord() {return word;}
	int getFrequency() {return frequency;}
	public boolean equals(Object o) {
		return o instanceof WordCounter && word.equals(((WordCounter) o).word);
	}
	public int hashCode() {return word.hashCode();}
	@Override
	public String toString() {		
		return getClass().getName()+"{ word\t"+word + "\tfrequency "+ frequency +"}";
	}

}
/*
 * 单词出现个数计数
 */
public class Exercise22 {
	static void updateStat(Iterator<WordCounter> it, WordCounter wc) {
		while (it.hasNext()) {
			WordCounter currentWC = it.next();
			if (currentWC.equals(wc)) {
				currentWC.incFrequency();
			}
		}
	}

	public static void main(String[] args) {
		Set<WordCounter> stat = new HashSet<>();
		for (String word : new TextFile("src/main/java/holding/Exercise22.java", "\\W+")) {
			WordCounter wc = new WordCounter(word);
			if (stat.contains(wc)) {
				updateStat(stat.iterator(), wc);
			} else {
				stat.add(wc);
			}
		}
		List<WordCounter> list = new ArrayList<>(stat);
		Collections.sort(list, WordCounter.CASE_INSENSITIVE_ORDER);
		for (WordCounter wordCounter : list) {
			System.out.println(wordCounter);
		}
		
	}

}
