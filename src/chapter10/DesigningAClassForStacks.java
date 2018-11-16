//10.6 case study designing a class for Stacks
package chapter10;

public class DesigningAClassForStacks {

	public static void main(String[] args) {
		StackOfIntegers stack = new StackOfIntegers();

		for (int i = 0; i < 20; i++) {
			stack.push(i);
		}

		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}

	}
}

class StackOfIntegers {
	// An array to store integers in the stack.
	private int[] elements;
	// The number of integers in the stack.
	private int size;

	// Constructs an empty stack with a default capacity of 16.
	public StackOfIntegers() {
		elements = new int[16];
	}

	// Constructs an empty stack with a specified capacity.
	public StackOfIntegers(int capacity) {
		elements = new int[capacity];
	}

	// Returns true if the stack is empty.
	public boolean empty() {
		if (size == 0) {
			return true;
		} else {
			return false;
		}
	}

	// Returns the integer at the top of the stack without removing it from the
	// stack.
	public int peek() {
		if (size == 0) {
			return 0;
		} else {
			return elements[size - 1];
		}
	}

	// Stores an integer into the top of the stack.
	public void push(int value) {
		if (size >= elements.length) {
			int[] temp = new int[elements.length + 1];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
			elements[size] = value;
			size++;
		} else {
			elements[size] = value;
			size++;
		}
	}

	// Removes the integer at the top of the stack and returns it.
	public int pop() {
		if (size == 0) {
			return 0;
		} else {
			int returnVal;
			returnVal = elements[size - 1];
			elements[size - 1] = 0;
			size--;
			return returnVal;
		}
	}

	// Returns the number of elements in the stack.
	public int getSize() {
		return size;
	}
}
