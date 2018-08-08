/*
 * (Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40 minutes ,and 35 seconds.
 * Write a program that displays the average speed in kilometers per hour. 
 * (Note that 1 mile is 1.6 kilometers.)
 */
package chapter01;

public class ProgrammingExercise12 {

	public static void main(String[] args) {
		// 									-speed in km- * 60min / time_in_minutes
		double runnersAverageSpeedinKm = (((24 * 1.60934) * 60) / (100 + (35 / 60.0)));
		System.out.println("Runner's Average Speed : " + runnersAverageSpeedinKm);
	}

}
