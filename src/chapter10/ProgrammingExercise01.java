package chapter10;


/**
 * (The Time class) Design a class named Time. The class contains:
 * 		The data fields hour, minute, and second that represent a time.
 * 		A no-arg constructor that creates a Time object for the current time. (The values of the data fields will represent the current time.)
 * 		A constructor that constructs a Time object with a specified elapsed time since midnight, January 1, 1970, in milliseconds. (The values of the data fields will represent this time.)
 * 		A constructor that constructs a Time object with the specified hour, minute, and second.
 *		Three getter methods for the data fields hour, minute, and second, respectively. 
 * 		A method named setTime(long elapseTime) that sets a new time for the object using the elapsed time. For example, if the elapsed time is 555550000 milliseconds, the hour is 10, 
 * 					the minute is 19, and the second is 10.
 * 
 *	Write a test program that creates two Time objects (using new Time() and new Time(555550000)) and displays their hour, minute, and second in the format hour:minute:second. 
 * (Hint: The first two constructors will extract the hour, minute, and second  from the elapsed time. 
 * For the no-arg constructor, the current time can be  obtained using System.currentTimeMillis(), as shown in Listing 2.7, ShowCurrentTime.java.) 
 * 
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise01 {
	public static void main(String[] args) {
		Time time1 = new Time();
		Time time2 = new Time(555550000);
		
		System.out.println("First object's      Hour:" + time1.getHour() + " Minute:" + time1.getMinute() + " Second:" + time1.getSecond());
		System.out.println("Second object's     Hour:" + time2.getHour() + " Minute:" + time2.getMinute() + " Second:" + time2.getSecond());
		
	}

}

class Time {
	private int hour;
	private int minute;
	private int second;

	/**
	 * This constructor create an object of current time. (GMT : 0)
	 */
	public Time() {
		this(System.currentTimeMillis());
	}

	/**
	 * This constructor create an object from specified elapsed time in milliseconds from midning Jan 1 1970.
	 * @param elapsedTime
	 */
	public Time(long elapsedTime) {
		this(((int) (elapsedTime / (1000 * 60 * 60)) % 24), ((int) (elapsedTime / (1000 * 60)) % 60),((int) (elapsedTime & 1000) % 60));
	}

	/**
	 * This constructor create an object from specified hour minute and second.
	 * @param hour
	 * @param minute
	 * @param second
	 */
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

}