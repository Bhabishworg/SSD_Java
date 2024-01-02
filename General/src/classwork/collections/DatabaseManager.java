package classwork.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DatabaseManager {
	private Map<Integer, String> database = new HashMap<Integer, String>();
	
	public void addData(int id, String email) {
		database.put(id, email);
	}
	
	public void displaySize() {
		System.out.println("\nSize of database: " + database.size());
	}
	
	public void removeAll() {
		database.clear();
		System.out.println("\nAll data removed...");
	}
	
	public void displayData() {
		System.out.println("\nData in the Database:-");
		for (Entry<Integer, String> entry : database.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}
