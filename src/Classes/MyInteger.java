package Classes;

public class MyInteger{
	private int value;
	
	public MyInteger(int value){
		this.value = value;
	}
	/**
	 * this method converts an array of numeric characters to an int value. If array has different values than numeric character , it returns -1
	 * @param numericChar
	 * @return
	 */
	public static int parseInt(char[] numericChar) {
		int num = 0;
		for (int i = numericChar.length - 1,j = 0; i >= 0; i--,j++) {
			if((numericChar[i] - '0') < 0 || 9 < (numericChar[i] - '0')) return -1;
			num += (Math.pow(10, j) * (numericChar[i] - '0'));
		}
		return num;
	}
	/**
	 * this method converts a string into an int value., if string has different values than numeric data , it returns -1
	 * @param numericString
	 * @return
	 */
	public static int parseInt(String numericString) {
		int num = 0;
		for (int i = numericString.length() - 1, j = 0; i >= 0 ; i--,j++) {
			if((numericString.charAt(i) - '0') < 0 || 9 < (numericString.charAt(i) - '0')) return -1;
			num += (Math.pow(10, j)) * (numericString.charAt(i) - '0');
		}
		return num;
	}
	/**
	 * returns true if object's value is an even number.
	 * @param objectRef
	 * @return
	 */
	public boolean isEven(){
		return (value % 2 == 0);
	}
	/**
	 * return true if object's value is an odd number.
	 * @param objectRef
	 * @return
	 */
	public boolean isOdd(){
		return (value % 2 != 0);
	}
	
	/**
	 * return true if object's value is a prime number
	 * @param objectRef
	 * @return
	 */
	public boolean isPrime(){
		int counter = 0;
		for (int i = 1; i <= value ; i++) {
			if(value % i == 0) counter++;
		}
		
		if (counter <= 2) return true; // this mean number isnt dividible except 1 and itself. So its a prime
		else return false;
	}
	
	/**
	 * return true if specified int data is an even number
	 * @param value
	 * @return
	 */
	public static boolean isEven(int value){
		return (value % 2 == 0);
	}
	
	/**
	 * return true if specified int data is an odd number.
	 * @param value
	 * @return
	 */
	public static boolean isOdd(int value){
		return (value % 2 != 0);
	}
	
	/**
	 * return true if specified int data is a prime number.
	 * @param value
	 * @return
	 */
	public static boolean isPrime(int value){
		int counter = 0;
		for (int i = 1; i <= value; i++) {
			if(value % i == 0) counter++;
		}
		
		if (counter <= 2) return true; // this mean number isnt dividible except 1 and itself. So its a prime
		else return false;
	}
	
	/**
	 * return true if specified MyInteger object's value is equal to instance's value
	 * @param objectRef
	 * @return
	 */
	public boolean equals(MyInteger objectRef){
		return (this.value == objectRef.getValue());
	}
	
	
	/**
	 * return true if specified int data is equal to instance's value
	 * @param value
	 * @return
	 */
	public boolean equals(int value){
		return (this.value == value);
	}
	/*
	 * getters and setters.
	 */
	public int getValue(){
		return value;
	}
}