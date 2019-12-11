package DataStructure;

import java.util.LinkedList;
/**
 * For this problem, you will implement a queue of String,
 *
 * using  a linked list in the background.
 *
 */
public class LinkedListQueue {

	LinkedList<String> ll;
	public LinkedListQueue() {
		ll=new LinkedList<String>();
	}

	public String peek() {
		if (ll.isEmpty()) throw new IllegalAccessError();
		return ll.getFirst();
	}

	public void enqueue(String obj) {
		ll.addLast(obj);
	}

	public void dequeue() {
		if (ll.isEmpty()) throw new IllegalAccessError();
		ll.removeFirst();
	}

	public boolean isEmpty() {
		return ll.isEmpty();
	}

	public int size() {
		return ll.size();
	}

	@Override
	public String toString() {
		return ll.toString();
	}

	public static void main(String[] args) {

		LinkedListQueue names = new LinkedListQueue();

		names.enqueue("Ravi");
		names.enqueue("Vijay");
		names.enqueue("Muu");
		names.enqueue("Ajay");
		System.out.println(names);

		names.dequeue();
		names.dequeue();
		System.out.println(names);

		System.out.println("peeking...." + names.peek());
		names.enqueue("Pont");
		System.out.println(names);

		System.out.println("size: " + names.size());

	}

}
