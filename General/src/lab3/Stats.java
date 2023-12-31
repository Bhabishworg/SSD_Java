package lab3;

import java.util.Arrays;

/**
 * The Stats class provides count, maximum value, minimum 
 * value, total and average of an array of numbers.
 * 
 * @author anon
 */
public class Stats {
	/**
	 * The array of numbers to get statistics of.
	 */
	private int[] numbers;

	/**
	 * The no. of numbers that are analysed.
	 */
	private int count;

	/**
	 * Adds the number to the numbers array.
	 * Also, increases the value of count by 1.
	 * 
	 * @param value A number that goes through the analysis.
	 */
	public void addValue(int value) {
		numbers[count] = value;
		count++;
	}

	/**
	 * Gets the count of the numbers array.
	 * 
	 * @return The no. of numbers that are analysed.
	 */
	public int getCount() {
		int count = numbers.length;
		return count;
	}
	
	/**
	 * Gets the maximum value among the numbers.
	 * 
	 * @return max the maximum value among the numbers.
	 */
	public int getMax() {
		int max = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max)
				max = numbers[i];
		}

		return max;
	}

	/**
	 * Gets the minimum value among the numbers.
	 * 
	 * @return min the minimum value among the numbers.
	 */
	public int getMin() {
		int min = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < min)
				min = numbers[i];
		}

		return min;
	}

	/**
	 * Gets the summation of the numbers.
	 * 
	 * @return total the sum of all the numbers.
	 */	
	public int getTotal() {
		int total = 0;

		// total all values within the array
		for (int i = 0; i < numbers.length; i++) {
			total += numbers[i];
		}

		return total;
	}

	/**
	 * Gets the mean of the numbers.
	 * 
	 * @return average the mean of the numbers.
	 */
	public double getAverage() {
		double average = getTotal() / (double) numbers.length;
		return average;
	}

	
	/**
	 * Sets the string representation of the Stats object.
	 * 
	 * @return The string of numbers that are analysed.
	 */
	@Override
	public String toString() {
		String numbers = Arrays.toString(this.numbers);
		return numbers;
	}

	/**
	 * Constructs an instance of Stats class.
	 * 
	 * @param capacity the no. of numbers that are to be analysed.
	 */
	public Stats(int capacity) {
		numbers = new int[capacity];
	}
}
