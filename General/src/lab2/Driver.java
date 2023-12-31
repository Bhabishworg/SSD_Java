package lab2;

import java.util.Scanner;

/**
 * Serves as the entry point for the program that counts the
 * letters, words and length of a sentence.
 */
public class Driver {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		WordProcessor processor = new WordProcessor();
		
		// Asks for the sentence that is to be processed.
		System.out.println("Enter a sentence.");
		String sentence = scan.nextLine();
		
		// Tests methods for the user input sentence.
		System.out.println("\nData for user's sentence.");
		System.out.println("Letters: " + processor.countLetters(sentence));
		System.out.println("Words: " + processor.countWords(sentence));
		System.out.println("Length: " + processor.getLength(sentence));

		// Tests methods for the null.
		System.out.println("\nData for null sentence.");
		System.out.println("Letters: " + processor.countLetters(null));
		System.out.println("Words: " + processor.countWords(null));
		System.out.println("Length: " + processor.getLength(null));
		
		scan.close();
	}
}
