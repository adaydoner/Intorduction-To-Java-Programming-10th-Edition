package chapter10;
import Classes.Queue;
/**
 * (The Queue class) Section 10.6 gives a class for Stack. Design a class named Queue for storing integers. 
 * Like a stack, a queue holds elements. In a stack, the elements are retrieved in a last-in first-out fashion. In a queue, the elements are retrieved in a first-in first-out fashion. 
 * The class contains:
 * 		An int[] data field named elements that stores the int values in the queue.
 * 		A data field named size that stores the number of elements in the queue.
 * 		A constructor that creates a Queue object with default capacity 8.
 * 		The method enqueue(int v) that adds v into the queue.
 * 		The method dequeue() that removes and returns the element from the queue.
 * 		The method empty() that returns true if the queue is empty.
 * 		The method getSize() that returns the size of the queue.
 * Draw an UML diagram for the class. Implement the class with the initial array size set to 8. 
 * The array size will be doubled once the number of the elements exceeds the size. 
 * After an element is removed from the beginning of the array, you need to shift all elements in the array one position the left. 
 * Write a test program that adds 20 numbers from 1 to 20 into the queue and removes these numbers and displays them.
 * 
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise10 {

	public static void main(String[] args) {
		Queue queue1 = new Queue();
		System.out.println(queue1.getSize());
		/**
		 * add 20 numbers from 1 to 20 into the queue
		 */
		for (int i = 1; i < 21; i++) {
			queue1.enqueue(i);
			if(i == 6){
			}
		}
		
		/**
		 * removes queue messages with the concept first in first out
		 */
		for (int i = 0; i < 20; i++) {
			System.out.println(queue1.dequeue());
		}
		System.out.println(queue1.getSize());
	}
}