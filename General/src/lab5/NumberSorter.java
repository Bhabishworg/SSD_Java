package lab5;

import java.util.Stack;

/**
 * Represents a sorting system that sorts out the array of numbers in
 * ascending or descending order.
 */
public class NumberSorter {
	/**
	 * Sorts the numbers in numbers array in ascending or descending 
	 * order
	 * 
	 * @param numbers An array of numbers to sort
	 * @param ascending A boolean flag indicating whether the order 
	 * should be ascending or descending.
	 * 			- If {@code true}, ascending sorting is done.
	 * 			- If {@code false}, descending sorting is done.
	 */
	void sort(int[] numbers, boolean ascending) {
		// The source stack, from which the numbers are popped
		Stack<Integer> srcStack = new Stack<Integer>();
		
		// The dest stack, to which the numbers are pushed
		Stack<Integer> destStack = new Stack<Integer>();
		
		// Add the initial array of numbers to the source stack.
		for (int number : numbers)
			srcStack.push(number);
		
		if (ascending == true) {
			// Adds the array of numbers in destination stack in ascending order.
			while (srcStack.size() > 0) {
				Integer next = srcStack.pop();
				
				while (destStack.size() > 0 && destStack.peek() > next)
					srcStack.push(destStack.pop());		
				destStack.push(next);
			}
		} else {
			// Adds the array of numbers in destination stack in descending order.
			while (srcStack.size() > 0) {
				Integer next = srcStack.pop();
				
				while (destStack.size() > 0 && destStack.peek() < next)
					srcStack.push(destStack.pop());		
				destStack.push(next);
			}
		}
		
		// Prints the sorted numbers out.
		for (int number : destStack)
			System.out.println(number);
	}
}