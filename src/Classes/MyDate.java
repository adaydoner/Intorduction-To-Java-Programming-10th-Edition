package Classes;
/**
 *  This class initialized with conditions that given at chapter 10. exercise 14.
 * @author Ali Dogan Aydoner
 *
 */
public class MyDate {
	private int day;
	private int month;
	private int year;
	
	/**
	 * A no-arg constructor that creates a MyDate object for the current date.
	 */
	public MyDate(){
		this(System.currentTimeMillis());
	}
	
	/**
	 * A constructor that constructs a MyDate object with a specified elapsed time since midnight, January 1, 1970, in milliseconds
	 * @param elapsedTime
	 */
	public MyDate(long elapsedTime){
		setDate(elapsedTime);
		
	}

	/**
	 * A method named setDate(long elapsedTime) that sets a new date for the object using the elapsed time.
	 * @param elapsedTime
	 */
	public void setDate(long elapsedTime){
		long totalDay = 0;
		while (elapsedTime >= 86_400_000) {
			elapsedTime -= 86_400_000;
			totalDay++; // getting number of total days from elapsed time
		}
		year = (int)(totalDay / 365) + 1970;
		// find number of total days in current year ; we subtract leap years from total days so its like all years have 365 total day. then we add 1 for today.
		int daysInCurrentYear = (int)((totalDay - numberOfLeapYearsSince1970(year)) % 365 + 1); 
		month = getMonthNumberFromNumberOfTotalDaysInCurrentYear(year,daysInCurrentYear);
		int daysTillCurrentMonth = getNumOfDaysToReachThatMonth(year, month);
		day = daysInCurrentYear - daysTillCurrentMonth;
	}
	
	/**
	 * A constructor that constructs a MyDate object with the specified year, month, and day.
	 * @param day
	 * @param month
	 * @param year
	 */
	public MyDate(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}

	/**
	 * return how many days in specified month , year
	 * @param year
	 * @param month
	 * @return
	 */
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

	/**
	 * return true if specified year is leap year
	 * @param year
	 * @return
	 */
	public static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
	
	
	
	/*
	 * private methods
	 */
	private int numberOfLeapYearsSince1970(long year) {
		int count = 0;
		for (int i = 1970; i <= year; i++) {
			if (isLeapYear(i))
				count++;
		}
		return count;
	}
	
	private int getMonthNumberFromNumberOfTotalDaysInCurrentYear(int year, int days) {
		int dayCounter = 0; // we count days untill daysInCurrentYear value.
		int monthNumber = 0;
		while(dayCounter < days) {
			monthNumber++;
			dayCounter += getNumberOfDaysInMonth(year, monthNumber); // we consider that every month has different total days. 
		}
		return monthNumber;
	}

	private int getNumOfDaysToReachThatMonth(int year, int month) {
		int dayTracker = 0;
		for (int i = 1; i < month; i++) {

			dayTracker += getNumberOfDaysInMonth(year, i);

		}
		return dayTracker;
	}

	/*
	 * getters and setters
	 */
	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}
	
	
	
	
}
