package lab3;

import java.util.Random;

/**
 * The Driver class serves as the entry point to display the 
 * functionality of Stats class. 
 * 
 * @author anon
 */
public class Driver {
	/**
	 * The main method is the entry point of the program.
	 * It creates an instance of Stats class and uses its methods.
	 * 
	 * @param args The command-line arguments.
	 */
	public static void main(String[] args) {
		final int VALUES = 10;
		
		Stats stats = new Stats(VALUES);
		Random random = new Random();
		
		for (int i = 0; i < VALUES; i++) {
			stats.addValue(random.nextInt(100));
		}

		System.out.print("Numbers stored : ");
		System.out.println(stats);
		System.out.println("Average = " + stats.getAverage());
		System.out.println("Count = " + stats.getCount());
		System.out.println("Total = " + stats.getTotal());
		System.out.println("Minimum value = " + stats.getMin());
		System.out.println("Maximum value = " + stats.getMax());
	}
}