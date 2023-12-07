package lab2;

public class WordProcessor implements Counter{
	private String text;
	
	/**
	 * Gets the text informing of lack of sentence.
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

	@Override
	public int countWords(String sentence) {
		if (sentence == null) {
			// Prints text to inform lack of sentence.
			System.out.println(text);
			return 0;
		} else {
			String words[] = sentence.split(" ");	// Array of words in the sentence.
			int wordCount = words.length;
			System.out.println("Words: " + wordCount);
			return wordCount;
		}
	}

	@Override
	public int countLetters(String sentence) {
		if (sentence == null) {
			// Prints text to inform lack of sentence.
			System.out.println(text);
			return 0;
		} else {
			int letterCount = 0;
			// Goes through every character in the sentence.
			for (int i = 0; i < sentence.length(); i++) {
				// Checks if the character is a letter
				if (Character.isLetter(sentence.charAt(i))) {
					letterCount++;
				}
			}
			System.out.println("Letters: " + letterCount);
			return letterCount;
		}
	}

	@Override
	public int getLength(String sentence) {
		if (sentence == null) {
			// Prints text to inform lack of sentence.
			System.out.println(text);
			return 0;
		} else {
			int length = sentence.length();
			System.out.println("Length: " + length);
			return length;			
		}
	}
}
