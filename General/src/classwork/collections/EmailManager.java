package classwork.collections;

import java.util.LinkedList;

public class EmailManager {
	private LinkedList<String> emails = new LinkedList<String>();
	
	public void addEmail(String email) {
		emails.add(email);
	}
	
	public void addEmail(int index, String email) {
		emails.add(index, email);
	}
	
	public void displayEmails() {
		System.out.println("\nEmails stored:-");
		for (String email : emails) {
			System.out.println(email);
		}
	}
	
	public LinkedList<String> getEmails() {
		return emails;
	}
}
