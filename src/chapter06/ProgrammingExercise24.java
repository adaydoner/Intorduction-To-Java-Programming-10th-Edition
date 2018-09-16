/*
 * (Display current date and time) Listing 2.7, ShowCurrentTime.java, displays the
 * current time. Improve this example to display the current date and time. The calendar
 * example in Listing 6.12, PrintCalendar.java, should give you some ideas on
 * how to find the year, month, and day.
 */
package chapter06;

public class ProgrammingExercise24 {

	private static String giveCurrentDateAndTime() {
		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds / 1000;
		long currentSecond = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		long totalHours = (totalMinutes / 60) + 3;// GMT (+3)
		long currentHour = totalHours % 24;
		long totalDaysSince1970 = totalHours / 24;
		int currentYear = (int) (totalDaysSince1970 / 365) + 1970; // **DD/MM//(YYYY)**

		/* if all years have 365 days we can easily do (totalDays % 365) and find daysInCurrentYear. 
		 * Since leap years have 366 days we will subtract the NUMBER of leap years from total days so its like all years have 365 days.
		*/
		long daysInCurrentYear = (totalDaysSince1970 - numberOfLeapYearsSince1970(currentYear)) % 365; 
		if (currentHour > 0) {
			daysInCurrentYear++; // add today
		}
		
		/* Now we will find what month we'r in. When we compute this we have to consider every month has different total day.
		 * we have how many days pass for this year , we know what month has how many days. -->> getMonthFromDays
		 */
		int currentMonthNum = getMonthFromDays(currentYear, (int) daysInCurrentYear); 
		String month = getMonthName(currentMonthNum); // **DD/(MM)//YYYY**
		/*
		 * Now we will find what days in current month we are at. we have how many day passed untill current month in current year. we have total days in current year.
		 * when we subtract them we have today.
		 */
		int daysTillCurrentMonth = getNumOfDaysToReachThatMonth(currentYear, currentMonthNum);
		int today = (int) daysInCurrentYear - daysTillCurrentMonth; // **(DD)/MM//YYYY**

		return (today + "/" + month + "/"+ currentYear + "\n" + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT (+3)");
	}

	public static int numberOfLeapYearsSince1970(long year) {

		int count = 0;
		for (int i = 1970; i <= year; i++) {
			if (isLeapYear(i))
				count++;
		}
		return count;
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

	public static int getStartDay(int year, int month) {
		final int START_DAY_FOR_JAN_1_1800 = 3;
		// Get total number of days from 1/1/1800 to month/1/year
		int totalNumberOfDays = getTotalNumberOfDays(year, month);

		// Return the start day for month/1/year
		return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
	}

	public static int getTotalNumberOfDays(int year, int month) {
		int total = 0;

		// Get the total days from 1800 to 1/1/year
		for (int i = 1800; i < year; i++)
			if (isLeapYear(i))
				total = total + 366;
			else
				total = total + 365;

		// Add days from Jan to the month prior to the calendar month
		for (int i = 1; i < month; i++)
			total = total + getNumberOfDaysInMonth(year, i);

		return total;
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

	public static int getNumOfDaysToReachThatMonth(int year, int month) {
		int dayTracker = 0;
		for (int i = 1; i < month; i++) {

			dayTracker += getNumberOfDaysInMonth(year, i);

		}
		return dayTracker;
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
		String currentDate;
		currentDate = giveCurrentDateAndTime();// day/month/year hour:minute:second
		System.out.println(currentDate);
	}
}
