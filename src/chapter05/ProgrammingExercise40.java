/*
 * (Simulation: heads or tails) Write a program that simulates flipping a coin one million times and displays the number of heads and tails.
 */
package chapter05;

public class ProgrammingExercise40 {

	public static void main(String[] args) {
		int number;
		int tailscounter = 0;
		int headscounter = 0;
		for (int i = 0; i < 1_000_000; i++) {
			number = (int) (Math.random() * 2); // 0 tails , 1 heads
			if(number == 0) {
				tailscounter++;
			} else if(number == 1) {
				headscounter++;
			}
		}
		System.out.println("\t\t\t 1.000.000 flipping a coin simulation\nNumber of tails : " + tailscounter + "\nNumber of heads : " + headscounter);
	}
}
