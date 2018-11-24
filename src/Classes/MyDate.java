package Classes;

import java.util.GregorianCalendar;

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
		setDate(System.currentTimeMillis());
	}
	
	/**
	 * A constructor that constructs a MyDate object with a specified elapsed time since midnight, January 1, 1970, in milliseconds
	 * @param elapsedTime
	 */
	public MyDate(long elapsedTime){
		setDate(elapsedTime);
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
	 * A method named setDate(long elapsedTime) that sets a new date for the object using the elapsed time.
	 * @param elapsedTime
	 */
	public void setDate(long elapsedTime){
		GregorianCalendar cl = new GregorianCalendar();
		cl.setTimeInMillis(elapsedTime);
		day = cl.get(GregorianCalendar.DAY_OF_MONTH);
		month = cl.get(GregorianCalendar.MONTH);
		year = cl.get(GregorianCalendar.YEAR);
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
