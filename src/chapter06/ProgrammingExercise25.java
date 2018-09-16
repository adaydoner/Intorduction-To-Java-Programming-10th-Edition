/*
 * (Convert milliseconds to hours, minutes, and seconds) Write a method that converts
 * milliseconds to hours, minutes, and seconds using the following header:
 * 		
 * 		public static String convertMillis(long millis)
 * 
 * The method returns a string as hours:minutes:seconds. For example,
 * convertMillis(5500) returns a string 0:0:5, convertMillis(100000) returns
 * a string 0:1:40, and convertMillis(555550000) returns a string 154:19:10.
 */
package chapter06;

import java.util.Scanner;

public class ProgrammingExercise25 {
	
	public static String convertMillis(long millis) {
		long totalSeconds = millis / 1000;
		long currentSecond = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		long currentHour = totalMinutes / 60;
		
		return (currentHour + ":" + currentMinute + ":" + currentSecond);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long milliSeconds;
		String time;
		System.out.print("Enter a milliseconds : ");
		milliSeconds = input.nextLong();
		time = convertMillis(milliSeconds);
		System.out.println(time);
		
		input.close();
	}
}
