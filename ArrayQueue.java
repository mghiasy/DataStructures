package DataStructure;

import java.util.Arrays;

/**
 * For this problem, you will implement a queue of String, using an array in the background.
 *
 */
public class ArrayQueue {
	
	private final int INITIAL_LENGTH = 2;
	private String[] arr = new String[INITIAL_LENGTH];
	private int size = 0;
	private int front = -1;
	private int rear = 0;
	
	
	/** Retrieves, but does not remove, the element at the front/head of the queue. */
	public String peek() { // throws IllegalStateException
		if(isEmpty()) throw new IllegalStateException("Queue is emplty");
		else 
		return arr[front];
	}
	
	/** Retrieves and Remove: removes the element at the front/head of the queue. */
	public String dequeue()  { // throws IllegalStateException {
		if(isEmpty()) throw new IllegalStateException("Queue is emplty");
		String ret = arr[front];
		front ++;
		return ret;
	}
	
	/** Insert: adds an element to the rear/end of the queue. */
	public void enqueue(String s) { 
		if(isFull()) resize();
		arr[rear]=s;
		if(front ==-1) front ++;
		rear++;
		
	}
	private void resize() {
		String[] arr2 = new String[size *2];
		System.arraycopy(arr, 0, arr2, 0, size);
		arr=arr2;
	}

	private boolean isFull() {
		if(size == INITIAL_LENGTH) return true;
		return false;
	}
	/** Returns a string representation of this stack. The string
	 *  consists of all data values of the nodes in the stack, separated by spaces.
	 */
	@Override
	public String toString() {		
		if (isEmpty()) return null;
		String ret="[ ";
		for (int i=front;i<rear;i++) {
			if(i==rear-1) {
				ret+=arr[i]+" ]";
			}
			else ret+= arr[i] +",";
		}
		return ret;
	}
	
	/** Returns the number of items in the queue */
	public int size() {
		if (isEmpty()) return -1;
		size =rear-front;
		return size;
	}
	
	/** Returns true if there are no elements in the queue, false otherwise */
	public boolean isEmpty() {
		if((front == -1 && rear == 0)||(rear==front)) {
			return true;
		}		
		return false;
	}

	/**
     * Removes all of the elements from this deque.
     * The deque will be empty after this call returns.
     */
	public void clear() {
		if(isEmpty()) return;
		for(int i=front;i<rear;i++) {
			dequeue();
		}
	}

	/* You may use this method to test your stack */
	public static void main(String[] args) {
		try {
			ArrayQueue ns = new ArrayQueue();
			ns.enqueue("Bob");
			System.out.println(ns.size()+" " + ns.toString());
			ns.enqueue("Harry");
			System.out.println(ns.size()+" " + ns);
			ns.enqueue("Steve");
			System.out.println(ns.size() +" "  + ns);
			System.out.println("Dequeue Operation : " + ns.dequeue());
			System.out.println("Dequeue Operation : " + ns.dequeue());
			System.out.println(ns.size()+" " + ns);
			ns.enqueue("Bill");
			System.out.println(ns.size()+" " + ns);
			
			//ns.clear();
			System.out.println("After clear() Operation :" );
			System.out.println("Empty ArrayDeque : " + ns.isEmpty());


			System.out.println("Peek Operation : " + ns.peek());
			System.out.println(ns.size()+" " + ns);
			System.out.println("Dequeue Operation : " + ns.dequeue());
			System.out.println("Dequeue Operation : " + ns.dequeue());
			System.out.println("Empty ArrayDeque : " + ns.isEmpty());

			System.out.println("Dequeue Operation : " + ns.dequeue());

			
		} catch(Exception e) {
			System.out.println("Exception thrown of type " + e.getClass().getSimpleName());
		}
		
	}
}