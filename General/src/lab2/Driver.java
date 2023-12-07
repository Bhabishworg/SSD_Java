package lab2;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		WordProcessor processor = new WordProcessor();
		
		// Asks for the sentence to be processed.
		System.out.println("Enter a sentence.");
		String sentence = scan.nextLine();
		
		// Tests methods for the user input sentence.
		processor.countLetters(sentence);
		processor.countWords(sentence);
		processor.getLength(sentence);
		
		// Sets the text that prints when there is no sentence.
		processor.setText("There is no sentence.");
		
		// Tests methods for the null.
		processor.countLetters(null);
		processor.countWords(null);
		processor.getLength(null);
	}
}
