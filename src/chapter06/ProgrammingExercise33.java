/*
 * (Current date and time) Invoking System.currentTimeMillis() returns the
 * elapsed time in milliseconds since midnight of January 1, 1970. Write a program
 * that displays the date and time.
 */
package chapter06;

import java.util.Scanner;

public class ProgrammingExercise33 {
	public static String convertMillis() {
		long totalSeconds = System.currentTimeMillis() / 1000;
		long currentSecond = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		long totalHour = totalMinutes / 60;
		long currentHour = totalHour % 24;
		long totalDaysSince1970 = totalHour / 24;
		int currentYear = (int)(totalDaysSince1970 / 365); // **DD/MM//(YYYY)**
		long currentDays = (totalDaysSince1970 - numberOfLeapYearsSince1970(currentYear)) % 365; 
		if (currentHour > 0) {
			currentDays++; // add today
		}
		int currentMonthNum = getMonthFromDays(currentYear, (int) currentDays); 
		String month = getMonthName(currentMonthNum);
		
		int daysTillCurrentMonth = getNumOfDaysToReachThatMonth(currentYear, currentMonthNum);
		int today = (int) currentDays - daysTillCurrentMonth; // **(DD)/MM//YYYY**
		
		return ("Current date and time is by currentTimeMillis method \n" + month + " " + today + " ," + currentYear + " __ " + currentHour + ":" + currentMinute + ":" + currentSecond);
	}
	public static int getNumOfDaysToReachThatMonth(int year, int month) {
		int dayTracker = 0;
		for (int i = 1; i < month; i++) {

			dayTracker += getNumberOfDaysInMonth(year, i);

		}
		return dayTracker;
	}
	public static int getMonthFromDays(int year, int days) {
		int dayCounter = 0; // we count days untill daysInCurrentYear value.
		int monthNumber = 0;
		while(dayCounter < days) {
			monthNumber++;
			dayCounter += getNumberOfDaysInMonth(year, monthNumber); // we consider that every month has different total days. 
			}
		return monthNumber;
		}
	public static int getNumberOfDaysInMonth(int year, int month) {

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			return 31;
		}
		if (month == 2) {
			return isLeapYear(year) ? 29 : 28;
		} else {
			return 30;
		}
	}
	public static int numberOfLeapYearsSince1970(long year) {

		int count = 0;
		for (int i = 1970; i <= year; i++) {
			if (isLeapYear(i))
				count++;
		}
		return count;
	}
	public static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
	public static String getMonthName(int month) {

		String monthName = "";
		switch (month) {
		case 1:
			monthName = "January";
			break;
		case 2:
			monthName = "February";
			break;
		case 3:
			monthName = "March";
			break;
		case 4:
			monthName = "April";
			break;
		case 5:
			monthName = "May";
			break;
		case 6:
			monthName = "June";
			break;
		case 7:
			monthName = "July";
			break;
		case 8:
			monthName = "August";
			break;
		case 9:
			monthName = "September";
			break;
		case 10:
			monthName = "October";
			break;
		case 11:
			monthName = "November";
			break;
		case 12:
			monthName = "December";
		}

		return monthName;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String time;
		time = convertMillis();
		System.out.println(time);
		
		input.close();
	}

}
