package lab6;

import java.util.*;

public class EmailStore {
	Set<String> emailAddresses = new HashSet<String>();

	boolean addEmail(String email) {
		return emailAddresses.add(email);
	}
	
	boolean hasEmail(String email) {
		return emailAddresses.contains(email);
	}
	
	void displayEmails() {
		for (String email : emailAddresses) {
			System.out.println(email);
		}
	}
}
