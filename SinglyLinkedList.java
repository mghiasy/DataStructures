package DataStructure;

public class MySinglyLinkedList {
	Node header = null; // contains no data, cannot be removed

	public MySinglyLinkedList() {
		// header should never be null
		header = new Node(null, null);
	}

	public boolean search(String s) {
		Node t = header.next;
		while (t.next != null) {
			if (t.data == s) {
				return true;
			}
			t = t.next;
		}

		return false;
	}

	public void addFirst(String s) {
		Node n = new Node(s, null);
		if (header.next == null) {
			header.next = n;
		} else {
			n.next = header.next;
			header.next = n;
		}
	}

	public void addLast(String s) {
		Node n = new Node(s, null);
		if (header.next == null) {
			header.next = n;
		} else {
			Node t = header.next;
			while (t.next != null) {
				t = t.next;
			}
			t.next = n;
		}
	}

	public void insert(String s, int pos) {
		Node t = header.next;
//		while(pos != 0) {
//			t=t.next;
//			pos--;
//		}
		if(pos <0 || pos>size()) System.out.println("Out of band");
		if (pos == 0) addFirst(s);
		else if (pos == size()) addLast(s);
		for (int i=1 ; i <pos; i++) {
			t=t.next ;
		}
		Node n = new Node(s, t.next);
		t.next=n;
	}

	/** size = the number of non-null nodes */
	public int size() {
		int count = 0;
		for (Node n = header.next; n != null; n = n.next) {
			count++;
		}
		return count;
	}

	public void remove(String s) {
		if(search(s)) {
			for(Node n=header.next; n!=null;n=n.next) {
				if(n.data == s) {
					//n.next 
				}
			}
		}
	}

	public boolean isEmpty() {
		if (header.next == null)
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		String ret = "";
		for (Node n = header.next; n != null; n = n.next) {
			if (n.next == null)
				ret += n.data;
			else
				ret += n.data + " ,";
		}
		return ret;
	}

	/** Implement as inner class */
	private static class Node {
		String data;
		Node next;

		private Node(String value, Node n) {
			data = value;
			next = n;
		}

	}

	public static void main(String[] args) {

		MySinglyLinkedList listLast = new MySinglyLinkedList();
		listLast.addLast("Bob");
		listLast.addLast("Harry");
		listLast.addLast("Steve");
		listLast.addLast("Duke");
		System.out.println(listLast.size() + ": " + listLast.toString());

		MySinglyLinkedList listFirst = new MySinglyLinkedList();
		listFirst.addFirst("Bob");
		listFirst.addFirst("Harry");
		listFirst.addFirst("Steve");
		listFirst.addFirst("Duke");
		System.out.println(listFirst.size() + ": " + listFirst.toString());

		listFirst.insert("John", 1);
		System.out.println(listFirst.size() + ": " + listFirst.toString());

	}
}
