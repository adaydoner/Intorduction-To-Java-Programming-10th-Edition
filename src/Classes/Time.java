package Classes;

public class Time {
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