package lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class WordCounter {
	/**
	 * Maps words to their occurrence count.
	 */
	private final Map<String, Integer> wordMap = new HashMap<String, Integer>();
	
	private void addWord(String word) {
		if (wordMap.containsKey(word))
			wordMap.put(word, wordMap.get(word) + 1);
		else
			wordMap.put(word, 1);
	}
	
	void addSentence(String sentence) {
		String[] words = sentence.split(" ");
		for (String word : words)
			addWord(word);
	}
	
	void outputResults() {
		for (Entry<String, Integer> entry : wordMap.entrySet()) {
			String word = entry.getKey();
			int count = entry.getValue();
			
			System.out.println(word + " : " + count);
		}
	}
}
