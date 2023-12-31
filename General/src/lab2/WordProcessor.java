package lab2;

/**
 * Implements the Counter interface with its methods 
 * definitions.
 */
public class WordProcessor implements Counter{
	private String text = "There is no sentence.";	// The text to inform lack of sentence.
	
	/**
	 * Gets the text that informs of lack of sentence.
	 * 
	 * @return The text that informs that there is no sentence.
	 */
	public String getText() {
		return text;
	}

	/**
	 * Sets the text to inform about lack of sentence.
	 * 
	 * @param text The text that informs that there is no sentence.
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * {@inheritDoc}
	 * Overrides the countWords method from Counter interface.
	 * Furthermore, prints the text if there is no sentence.
	 */
	@Override
	public int countWords(String sentence) {
		if (sentence == null) {
			System.out.println(text);
			return 0;
		} else {
			String words[] = sentence.split(" ");
			int wordCount = words.length;
			return wordCount;
		}
	}

	/**
	 * {@inheritDoc}
	 * Overrides the countLetters method from Counter interface.
	 * Furthermore, prints the text if there is no sentence.
	 */
	@Override
	public int countLetters(String sentence) {
		if (sentence == null) {
			System.out.println(text);
			return 0;
		} else {
			int letterCount = 0;
			// Goes through every character in the sentence.
			for (int i = 0; i < sentence.length(); i++) {
				/* Increases the letterCount if the character
				 * is a letter.
				 */
				if (Character.isLetter(sentence.charAt(i)))
					letterCount++;
			}
			return letterCount;
		}
	}

	/**
	 * {@inheritDoc}
	 * Overrides the getLength method from Counter interface.
	 * Furthermore, prints the text if there is no sentence.
	 */
	@Override
	public int getLength(String sentence) {
		if (sentence == null) {
			System.out.println(text);
			return 0;
		} else {
			int length = sentence.length();
			return length;			
		}
	}
}
