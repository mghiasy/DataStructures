package DataStructure;


import java.util.EmptyStackException;
import java.util.LinkedList;

/**
 * For this problem, you will implement a stack of String,
 *
 * using  a linked list in the background.
 *
 */
public class LinkedListStack {
	
	LinkedList<String> ll;
	
	
	public LinkedListStack() {
		ll= new LinkedList<String>();
	}

	public String peek() {
		if(ll.isEmpty()) throw new EmptyStackException();
		return ll.getLast();
	}

	public void push(String obj) {
		ll.addLast(obj);
	}

	public String pop() {
		if(ll.isEmpty()) throw new EmptyStackException();
		return ll.removeLast();
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

		LinkedListStack ns = new LinkedListStack();
		ns.push("Bob");
		ns.push("Harry");
		System.out.println(ns.size()+" " + ns);
		ns.push("Steve");
		System.out.println(ns.size() +" "  + ns);
		System.out.println("Pop Operation : " + ns.pop());
		System.out.println("Pop Operation : " + ns.pop());
		System.out.println(ns.size()+" " + ns);
		ns.push("Bill");
		System.out.println(ns.size()+" " + ns);

		System.out.println("Peek Operation : " + ns.peek());
		System.out.println(ns.size());
		System.out.println("Pop Operation : " + ns.pop());
		System.out.println("Pop Operation : " + ns.pop());
		System.out.println("Empty stack : " + ns.isEmpty());

		System.out.println("Pop Operation : " + ns.pop());
		System.out.println("Empty stack : " + ns.isEmpty());

	
	}
	
}