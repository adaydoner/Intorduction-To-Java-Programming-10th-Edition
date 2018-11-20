package chapter10;
/**
 * (The MyInteger class) Design a class named MyInteger. The class contains:
 * 		An int data field named value that stores the int value represented by this object.
 * 		A constructor that creates a MyInteger object for the specified int value.
 * 		A getter method that returns the int value.
 * 		The methods isEven(), isOdd(), and isPrime() that return true if the value in this object is even, odd, or prime, respectively.
 * 		The static methods isEven(int), isOdd(int), and isPrime(int) that return true if the specified value is even, odd, or prime, respectively.
 * 		The static methods isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger) that return true if the specified value is even, odd, or prime, respectively.
 * 		The methods equals(int) and equals(MyInteger) that return true if the value in this object is equal to the specified value.
 * 		A static method parseInt(char[]) that converts an array of numeric characters to an int value.
 * 		A static method parseInt(String) that converts a string into an int value.
 * 
 * Draw the UML diagram for the class and then implement the class. Write a client program that tests all methods in the class.
 * 
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise03 {

	public static void main(String[] args) {
		int primitiveIntEven = 10;
		int primitiveIntOdd = 21;
		int primitiveIntPrime = 23;
		int primitiveIntNotPrime = 24;
		MyInteger intEven = new MyInteger(10);
		MyInteger intOdd = new MyInteger(21);
		MyInteger intPrime = new MyInteger(2);
		MyInteger intNotPrime = new MyInteger(4);
		char[] charArrayFor12345 = {'1','2','3','4','5'};
		String stringFor12345 = "12345";
		
		System.out.println("Is first object(10) even ?    : " + intEven.isEven());
		System.out.println("Is second object(21) odd ?    : " + intOdd.isOdd());
		System.out.println("Is third object(2) prime ?    : " + intPrime.isPrime());
		System.out.println("Is first object(10) odd ?     : " + intOdd.isEven());
		System.out.println("Is second object(21) even ?   : " + intEven.isOdd());
		System.out.println("Is fourth object(4) prime ?   : " + intNotPrime.isPrime());
		System.out.println("Is primitive(10) int even ?   : " + MyInteger.isEven(primitiveIntEven));
		System.out.println("Is primitive(21) int odd ?    : " + MyInteger.isOdd(primitiveIntOdd));
		System.out.println("Is primitive(23) int prime ?  : " + MyInteger.isPrime(primitiveIntPrime));
		System.out.println("Is primitive(10) int odd ?    : " + MyInteger.isEven(primitiveIntOdd));
		System.out.println("Is primitive(21) int even ?   : " + MyInteger.isOdd(primitiveIntEven));
		System.out.println("Is primitive(24) int prime ?  : " + MyInteger.isPrime(primitiveIntNotPrime));
		
		System.out.println("Is object(10) equal to primitive 10 ? : " + intEven.equals(primitiveIntEven));
		System.out.println("Is object(10) equal to primitive 21 ? : " + intEven.equals(primitiveIntOdd));
		System.out.println("Is object(10) equal to object 21 ? : " + intEven.equals(intOdd));
		System.out.println("Is object(10) equal to object 10 ? : " + intEven.equals(intEven));
		
		System.out.println("convert charArray(12345) into int : " + MyInteger.parseInt(charArrayFor12345));
		System.out.println("convert string(12345) into int    : " + MyInteger.parseInt(stringFor12345));
		
		
	}
}
class MyInteger{
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