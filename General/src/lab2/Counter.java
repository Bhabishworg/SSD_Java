package lab2;

public interface Counter {
	/**
	 * Counts words in the sentence.
	 * 
	 * @param sentence The given sentence.
	 * @return The number of words in the sentence.
	 */
	int countWords(String sentence);
	
	/**
	 * Counts letters in the sentence.
	 * 
	 * @param sentence The given sentence.
	 * @return The number of letters in the sentence.
	 */
	int countLetters(String sentence);
	
	/**
	 * Gets length of the sentence.
	 * 
	 * @param sentence The given sentence.
	 * @return The length of the sentence.
	 */
	int getLength(String sentence);
}