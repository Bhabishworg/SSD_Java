package lab5;

/**
 * Serves as the entry point for the program that checks the 
 * functionality of methods of NameManager and NumberSorter class.
 */
public class Driver {
	public static void main(String[] args) {
		NameManager manager = new NameManager();
		
		manager.addName("M.Mickleson");
		manager.addName("Johnua Taylor Biggs");
		manager.addName("P.Smith");
		manager.addName("Peter Jonathan Smythton");
		manager.addName("P.Thompson");
		
		manager.printNames(); // should print all names
		
		manager.removeLongNames();
		
		manager.printNames(); // should now have longer names removed	
		
		NumberSorter sorter = new NumberSorter();

		sorter.sort(new int [] {1,9,2,3,10,8,12,1, 99, 2, 43, 68, 109, 0}, true);
		sorter.sort(new int [] {1,2,3,4}, false);
		sorter.sort(new int [] {4,3,2,1}, true);
	}
}
