package lab5;

import java.util.*;

/**
 * Represents a manager that manages adding and printing names and also 
 * removing of long names.
 */
public class NameManager {
	List<String> names = new ArrayList<String>();	// Stores a list of names
	
	/**
	 * Adds the name to the names list.
	 * 
	 * @param name A person's name.
	 */
	public void addName(String name) {
		names.add(name);
	}
	
	/**
	 * Prints the names in the names list.
	 */
	public void printNames() {
		for (String name : names)
			System.out.println(name);
	}
	
	/**
	 * Removes any name from the names list with more than 15 characters.
	 */
	public void removeLongNames() {
		Iterator<String> iter = names.iterator();
		while(iter.hasNext()) {
			if (iter.next().length() > 15)
				iter.remove();
		}
	}
}
