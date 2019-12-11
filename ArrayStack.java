package DataStructure;

import java.util.EmptyStackException;

/**
 * For this problem, you will implement a stack of String, using an array in the
 * background.
 *
 */
public class ArrayStack {

	private final int INITIAL_LENGTH = 10;
	private int top;
	private String[] stackArray;

	public ArrayStack() {
		top = 0;
		stackArray = new String[INITIAL_LENGTH];
	}

	/** Pushes input onto the stack */
	public void push(String s) {
		stackArray[top] = s;
		top++;

	}

	/** Pops the input from the stack */
	public String pop() { // throws EmptyStackException {

		if (isEmpty())
			throw new EmptyStackException();

		String res = stackArray[top - 1];
		top--;
		return res;

	}

	/** Returns (but does not remove) the value at the top of the stack */
	public String peek() { // throws EmptyStackException {
		if (isEmpty())
			throw new EmptyStackException();

		String res = stackArray[top - 1];
		return res;
	}

	/**
	 * Returns a string representation of this stack. The string consists of all
	 * data values of the nodes in the stack, separated by spaces.
	 */
	@Override
	public String toString() {
		String ret = "[ ";
		for (int i = 0; i < top; i++) {
			if (i == top - 1)
				ret += stackArray[i] + " ]";
			else
				ret += stackArray[i] + ",";
		}
		return ret;
	}

	/** Returns the number of elements in the stack */
	public int size() {
		return top;
	}

	/** Returns true if there are no elements in the stack, false otherwise */
	public boolean isEmpty() {
		if (top == 0)
			return true;

		else
			return false;
	}

	/**
	 * It determines whether an String exists in the stack. If the element is found,
	 * it returns the 1-based position of the element from the top of the stack.
	 * Else, it returns -1.
	 * 
	 */
	// first Index of
	public int search(String o) {
		for (int i = 0; i < top; i++) {
			if (stackArray[i].equals(o))
				return i;
		}

		return -1;
	}

	// Last Index of
	private int lastIndexOf(String o) {
		int pos = -1;
		for (int i = 0; i < top; i++) {
			if (stackArray[i].equals(o)) {
				pos = i;
				break;
			}
		}
		return pos;
	}

	/* You may use this method to test your stack */
	public static void main(String[] args) {
		try {
			ArrayStack ns = new ArrayStack();
			ns.push("Bob");
			System.out.println(ns.size() + " " + ns.toString());
			ns.push("Harry");
			System.out.println(ns.size() + " " + ns);
			ns.push("Steve");
			System.out.println(ns.size() + " " + ns);
			System.out.println("Pop Operation : " + ns.pop());
			System.out.println("Pop Operation : " + ns.pop());
			System.out.println(ns.size() + " " + ns);
			ns.push("Bill");
			System.out.println(ns.size() + " " + ns);
			System.out.println("Search() Operation : " + ns.search("Bob"));

			System.out.println("Peek Operation : " + ns.peek());
			System.out.println(ns.size());
			System.out.println("Pop Operation : " + ns.pop());
			System.out.println("Pop Operation : " + ns.pop());
			System.out.println("Empty stack : " + ns.isEmpty());

			System.out.println("Pop Operation : " + ns.pop());
			System.out.println("Empty stack : " + ns.isEmpty());

		} catch (Exception e) {
			System.out.println("Exception thrown of type " + e.getClass().getSimpleName());
		}

	}
}