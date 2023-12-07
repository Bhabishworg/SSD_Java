package exc_lab;

public class Driver {
	public static void main(String[] args) {
		ArrayProcessor ap = new ArrayProcessor();
		
		int len = ap.getArrayLength(new String[] {"one", "two", "three"});
		System.out.println("Array length is " + len);
		
		Menu menu = new Menu();
		
		try {
			menu.displayMenuOption(1);
			menu.displayMenuOption(0);
		} catch (InvalidOptionException e) {
			System.err.println(e.getMessage());
		}
	}
}
