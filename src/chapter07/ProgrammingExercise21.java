/*
 * (Game: bean machine) The bean machine, also known as a quincunx or the Galton
 * box, is a device for statistics experiments named after English scientist Sir
 * Francis Galton. It consists of an upright board with evenly spaced nails (or pegs) in a triangular form as shown in Figure 7.13.
 * 	Each ball takes a random path and falls into a slot.
 * Balls are dropped from the opening of the board. Every time a ball hits a nail, it
 * has a 50% chance of falling to the left or to the right. The piles of balls are accumulated
 * in the slots at the bottom of the board. Write a program that simulates the bean machine. Your program should prompt
 * the user to enter the number of the balls and the number of the slots in the machine.
 * Simulate the falling of each ball by printing its path. For example, the path for
 * the ball in Figure 7.13b is LLRRLLR and the path for the ball in Figure 7.13c is RLRRLRR. Display the final buildup of the balls in the slots in a histogram.
 */
package chapter07;

import java.util.Scanner;

public class ProgrammingExercise21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfBalls;
		int numberOfSlots;
		System.out.print("Enter the number of balls to drop : ");
		numberOfBalls = input.nextInt();
		System.out.print("Enter the number of slots in the bean machine : ");
		numberOfSlots = input.nextInt();
		int[] ballsInSlots = new int[numberOfSlots];

		simulateFalling(ballsInSlots, numberOfBalls, numberOfSlots);
		displayFinalBuildUpOfTheBalls(ballsInSlots, numberOfBalls);

		input.close();
	}

	public static void displayFinalBuildUpOfTheBalls(int[] slots, int numberOfBalls) {
		while (!isEmpty(slots)) {

			if (isRowEmpty(slots, numberOfBalls)) {
				numberOfBalls--;
				continue;
			}
			for (int i = 0; i < slots.length; i++) {

				if (slots[i] >= numberOfBalls) {
					System.out.printf("%c", 'O');
					slots[i]--;
				} else
					System.out.printf("%c", ' ');

			}
			numberOfBalls--;
			System.out.println("");

		}
	}

	public static boolean isEmpty(int[] slots) {

		for (int slot : slots) {
			if (slot != 0) {
				return false;
			}
		}

		return true;
	}

	public static boolean isRowEmpty(int[] slots, int rowNum) {
		for (int slot : slots) {
			if (slot == rowNum) {
				return false;
			}
		}
		return true;
	}

	public static void simulateFalling(int[] slots, int numberOfBalls, int numberOfSlots) {
		int rightCounterForFinalPosition;
		for (int i = 0; i < numberOfBalls; i++) {
			rightCounterForFinalPosition = 0;
			for (int j = 0; j < numberOfSlots; j++) {
				if ((int) (Math.random() * 2) == 0) {
					System.out.print("L");
				} else {
					System.out.print("R");
					rightCounterForFinalPosition++;
				}
			}
			System.out.println();
			slots[rightCounterForFinalPosition]++;
		}
	}
}
