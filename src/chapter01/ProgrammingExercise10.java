/*
 * (Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and 30 seconds.
 * Write a program that displays the average speed in miles per hour. (Note that 1 mile is 1.6 kilometers.)
 */
package chapter01;

public class ProgrammingExercise10 {

	public static void main(String[] args) {
		// System.out.println("Runner's Speed : " + (60 * 14) / 45.5 ) + " km/h");
		System.out.println("Runner's Speed : " + ( (1 * 14) / (45.5 / 60) ) / 1.6 + " m/h");
	}

}
