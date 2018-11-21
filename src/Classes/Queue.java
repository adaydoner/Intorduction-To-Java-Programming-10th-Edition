package Classes;
/**
 * Initialized with Chapter10 Exercise 10.
 * @author Ali
 *
 */
public class Queue {
	private int[] elements;
	private int size;
	
	public Queue(){
	}
	
	/**
	 * adds <v> value into the queue
	 * @param v
	 */
	public void enqueue(int v){
		if(size == 0){
			elements = new int[]{v};
			size = 1;
		} else {
			int[] temp = new int[size];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = new int[size + 1];
			System.arraycopy(temp, 0, elements, 0, temp.length);
			elements[size] = v;
			size++;
		}
	}
	
	/**
	 * removes and returns the element from the queue.
	 * @return
	 */
	public int dequeue(){
		int removedElement = elements[0];
		
		for (int i = 0; i < size - 1; i++) {
			elements[i] = elements[i + 1];
		}
		size--;
		return removedElement;
	}
	
	/**
	 * returns true if the queue is empty.
	 * @return
	 */
	public boolean empty(){
		return (size == 0);
	}
	
	/**
	 * returns the number of message in the queue(size).
	 * @return
	 */
	public int getSize(){
		return size;
	}
}
