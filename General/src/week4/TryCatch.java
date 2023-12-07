package week4;

import java.util.Scanner;

public class TryCatch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Can also use @SuppressWarnings("resource") instead of closing the scanner.
		
		try {
			String ageStr = scanner.nextLine();
			int value = Integer.parseInt(ageStr);
			System.out.println("In five years you will be " + (value + 5));
		} catch (NumberFormatException e) {
			System.out.println("The age entered is not a number");
		}
		
		scanner.close();
	}
}
