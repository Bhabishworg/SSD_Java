package exc_lab;

public class Menu {
	void displayMenuOption(int opt) throws InvalidOptionException {
		if (opt < 1 || opt > 3)
			throw new InvalidOptionException("Only menu options from 1 to 3 need to be selected.");	
		
		System.out.println("Menu option " + opt + " selected");
	}
}
