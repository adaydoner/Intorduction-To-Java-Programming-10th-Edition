package chapter11;

import Classes.MyStack;

/**
 * (Implement MyStack using inheritance) In Listing 11.10, MyStack is implemented using composition. 
 * Define a new stack class that extends ArrayList. Draw the UML diagram for the classes and then implement MyStack. 
 * Write a test program that prompts the user to enter five strings and displays them in reverse order.
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise10 {

	public static void main(String[] args) {
		MyStack ms = new MyStack();
		
		for (int i = 0; i < 5; i++) {
			ms.push(String.valueOf(i) + ". string");
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println(ms.toString());
			System.out.println("getting last index element : " + ms.pop());
		}
	}
}
