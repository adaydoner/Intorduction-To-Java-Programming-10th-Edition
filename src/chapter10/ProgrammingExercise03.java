package chapter10;
import Classes.MyInteger;
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