package chapter10;
import Classes.MyDate;
/**
 * (The MyDate class) Design a class named MyDate. The class contains:
 * 		The data fields year, month, and day that represent a date. month is 0-based, i.e., 0 is for January
 * 		A no-arg constructor that creates a MyDate object for the current date.
 * 		A constructor that constructs a MyDate object with a specified elapsed time since midnight, January 1, 1970, in milliseconds.
 * 		A constructor that constructs a MyDate object with the specified year, month, and day.
 * 		Three getter methods for the data fields year, month, and day, respectively.
 * 		A method named setDate(long elapsedTime) that sets a new date for the object using the elapsed time.
 * 
 * Write a test program that creates two MyDate objects (using new MyDate() and new MyDate(34355555133101L)) and displays their year, month, and day.
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise14 {
	public static void main(String[] args) {
		MyDate date1 = new MyDate();
		MyDate date2 = new MyDate(561555550000L);
		
		System.out.println("First date objects ; \nDay : " + date1.getDay() + "\nMonth : " + date1.getMonth() + "\nYear : " + date1.getYear());
		System.out.println("Second date objects ; \nDay : " + date2.getDay() + "\nMonth : " + date2.getMonth() + "\nYear : " + date2.getYear());
		
		date1.setDate(561555550000L);
		System.out.println("First date objects ; \nDay : " + date1.getDay() + "\nMonth : " + date1.getMonth() + "\nYear : " + date1.getYear());
	}
}
