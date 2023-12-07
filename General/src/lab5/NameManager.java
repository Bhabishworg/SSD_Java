package lab5;

import java.util.*;

public class NameManager {
	
	List<String> names = new ArrayList<String>();
	
	public void addName(String name) {
		names.add(name);
	}
	
	public void printNames() {
		for (String name : names)
			System.out.println(name);
	}
	
	public void removeLongNames() {
		Iterator<String> iter = names.iterator();
		while(iter.hasNext()) {
			if (iter.next().length() > 15)
				iter.remove();
		}
	}
}
