/*
 * (Execution time) Write a program that randomly generates an array of 100,000
 * integers and a key. Estimate the execution time of invoking the linearSearch
 * method in Listing 7.6. Sort the array and estimate the execution time of invoking
 * the binarySearch method in Listing 7.7. You can use the following code
 * template to obtain the execution time:
 * 			long startTime = System.currentTimeMillis();
 * 			perform the task;
 * 			long endTime = System.currentTimeMillis();
 * 			long executionTime = endTime - startTime;
 * 
 */

package chapter07;

public class ProgrammingExercise16 {

	public static void main(String[] args) {
		final int ARRAY_SIZE = 100_000;
		int[] randomNumbers = new int[ARRAY_SIZE];
		int key = 0;
		int result;
		long startTime;
		long endTime;
		long executionTime;
		generateRandomNumbers(randomNumbers);
		key = randomNumbers[(int) (Math.random() * ARRAY_SIZE)];
		System.out.println("key is " + key);
		
		startTime = System.currentTimeMillis();
		result = linearSearch(randomNumbers, key);
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.println("Linear Search is finished , " + key + " is at the " + result + ". index , execution time is " + executionTime + " milliseconds");
		
		startTime = System.currentTimeMillis();
		sortArray(randomNumbers);
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.println("Sorting is finished , execution time is " + (executionTime/1000) + " seconds");
		
		
		startTime = System.currentTimeMillis();
		result = binarySearch(randomNumbers, key);
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.println("\nBinary Search is finished , " + key + " is at the " + result + ". index , execution time is " + executionTime + " milliseconds");

	}

	public static void sortArray(int[] randomNumbers) {
		int temp;
		System.out.println("\nSorting..");
		for (int i = 0; i < randomNumbers.length; i++) {
			for (int j = i + 1; j < randomNumbers.length; j++) {
				if (randomNumbers[i] > randomNumbers[j]) {
					temp = randomNumbers[i];
					randomNumbers[i] = randomNumbers[j];
					randomNumbers[j] = temp;
				}
			}
		}
	}

	public static void generateRandomNumbers(int[] randomNumbers) {
		for (int i = 0; i < randomNumbers.length; i++) {
			randomNumbers[i] = (int) (Math.random() * Integer.MAX_VALUE);
		}
	}

	public static int linearSearch(int[] list, int key) {
		for (int i = 0; i < list.length; i++) {
			if (key == list[i]) {
				return i;
			}
		}
		return -1;
	}

	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;

		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < list[mid])
				high = mid - 1;
			else if (key == list[mid]) {
				return mid;
			} else
				low = mid + 1;
		}
		return -1;
	}
}
