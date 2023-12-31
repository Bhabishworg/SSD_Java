package lab2;

/**
 * Defines methods for counting words, letters and the length
 * of the sentence.
 */
public interface Counter {
	/**
	 * Counts words in the given sentence.
	 * 
	 * @param sentence The given sentence.
	 * @return The number of words in the sentence.
	 */
	int countWords(String sentence);
	
	/**
	 * Counts letters in the given sentence.
	 * 
	 * @param sentence The given sentence.
	 * @return The number of letters in the sentence.
	 */
	int countLetters(String sentence);
	
	/**
	 * Gets length of the given sentence.
	 * 
	 * @param sentence The given sentence.
	 * @return The length of the sentence.
	 */
	int getLength(String sentence);
}
