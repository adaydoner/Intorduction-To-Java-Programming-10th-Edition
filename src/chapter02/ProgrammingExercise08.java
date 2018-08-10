/*
 *      (Current time) Listing 2.7, ShowCurrentTime.java, gives a program that
 *      displays the current time in GMT. Revise the program so that it prompts
 *      the user to enter the time zone offset to GMT and displays the time in
 *      the specified time zone.
 */


package chapter02;

import java.util.Scanner;

public class ProgrammingExercise08 {

	public static void showCurrentTime(int gmt) {
		long totalMilliseconds = System.currentTimeMillis();
		
		long totalSeconds = totalMilliseconds / 1000;
		long currentSeconds = totalMilliseconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		long currentMinutes = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		long currentHours = totalHours % 24;
		
		System.out.printf("The current time is %d:%d:%d",(currentHours+gmt),currentMinutes,currentSeconds);
	}
	public static void main(String[] args) {
		int gmt;
		Scanner readGmt = new Scanner(System.in);
		System.out.println("Enter the time zone offset to GMT : ");
		gmt = readGmt.nextInt();
		showCurrentTime(gmt);
		
		if(readGmt != null) {
			readGmt.close();
		}

	}

}
