/*
 * (Current time) Revise Programming Exercise 2.8 to display the hour using a 12-hour clock.
 */
package chapter03;

import java.util.Scanner;

public class ProgrammingExercise30 {
	public static void showCurrentTime(int gmt) {
		long totalMilliseconds = System.currentTimeMillis();

		long totalSeconds = totalMilliseconds / 1000;
		long currentSeconds = totalMilliseconds % 60;

		long totalMinutes = totalSeconds / 60;
		long currentMinutes = totalMinutes % 60;

		long totalHours = totalMinutes / 60;
		long currentHours = totalHours % 24;
		long hoursWithGMT = currentHours + gmt;
		
		if(hoursWithGMT == 12) {
			hoursWithGMT = 12;
		}
		else {
			hoursWithGMT %= 12;
		}
		System.out.printf("The current time is %d:%d:%d", hoursWithGMT, currentMinutes, currentSeconds);
	}

	public static void main(String[] args) {
		int gmt;
		Scanner readGmt = new Scanner(System.in);
		System.out.print("Enter the time zone offset to GMT : ");
		gmt = readGmt.nextInt();
		showCurrentTime(gmt);

		if (readGmt != null) {
			readGmt.close();
		}

	}

}
