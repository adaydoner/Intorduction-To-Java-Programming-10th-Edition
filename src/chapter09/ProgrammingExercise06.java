/*
 * (Stopwatch) Design a class named StopWatch. The class contains:
 * 			Private data fields startTime and endTime with getter methods.
 * 			A no-arg constructor that initializes startTime with the current time.
 * 			A method named start() that resets the startTime to the current time.
 * 			A method named stop() that sets the endTime to the current time.
 * 			A method named getElapsedTime() that returns the elapsed time for the stopwatch in milliseconds.
 * Draw the UML diagram for the class and then implement the class. 
 * Write a test program that measures the execution time of sorting 100,000 numbers using selection sort.
 */
package chapter09;

import java.util.Date;
import java.util.Random;

public class ProgrammingExercise06 {

	public static void main(String[] args) {
		StopWatch sw = new StopWatch();
		int[] array = new int[100_000];
		fillArrayWithRandomNumbers(array);
		sw.start();
		selectionSort(array);
		sw.stop();
		System.out.println("Execution time of selection sorting 100.000 number is " + sw.getElapsedTime() / 1000.0 + " seconds. ");
		//printArray(array);

	}

	public static void fillArrayWithRandomNumbers(int[] array) {
		Random randomGenerator = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = randomGenerator.nextInt(1_000_000);
		}
	}

	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int smallestNumber = Integer.MAX_VALUE;
			for (int j = i; j < array.length; j++) {
				if (array[j] < smallestNumber) {
					int temp = smallestNumber;
					smallestNumber = array[j];
					array[j] = temp;
				}
			}
			array[i] = smallestNumber;
		}
	}

	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%7d",array[i]);
			if((i + 1) % 40 == 0){
				System.out.println();
			}
		}
	}

}

class StopWatch {
	private long startTime;
	private long endTime;

	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long newStartTimeValue) {
		startTime = newStartTimeValue;
	}

	public long getEndTime() {
		return endTime;
	}

	public void setEndTime(long newEndTimeValue) {
		endTime = newEndTimeValue;
	}

	public StopWatch() {
		setStartTime(new Date().getTime());
	}

	public void start() {
		setStartTime(new Date().getTime());
	}

	public void stop() {
		setEndTime(new Date().getTime());
	}

	public long getElapsedTime() {
		return endTime - startTime;
	}

}