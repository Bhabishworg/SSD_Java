package lab6;

public class Driver {
	public static void main(String[] args) {
		EmailStore store = new EmailStore();
		System.out.println(store.addEmail("bleh@mmail.com"));
		System.out.println(store.hasEmail("bleh@mmail.com"));
		System.out.println(store.addEmail("bleh@mmail.com"));
		store.displayEmails();
		
		WordCounter wc = new WordCounter();
		wc.addSentence("this sentence has the word has in it twice");
		wc.outputResults();
	}
}
