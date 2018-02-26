
public class LinkedList {
	
	Node head;

	private class Node {
		int value;
		Node next;
		
		public Node(int value) {
			this(value, null);
		}
		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
	}	
	
	public LinkedList() {
		head = null;
	}
	
	public void add(int value) {
		if (head == null) {
			head.value = value;
			head.next = null;
		}
		Node cur = head;
		while (cur.next != null) 
			cur = cur.next;
		cur.next = new Node(value);
	}
	
	public void push(int value) {
		add(value);
	}
	
	/**
	 * get the index-th element from linkedlist
	 * @param index, an integer
	 * @return -1 if element not found within the lsit 
	 */
	public int get(int index) {
		Node cur = head;
		for (int i = 0; cur != null; i++) {
			if (i == index)
				return cur.value;
			cur = cur.next;
		}
		return -1;
	}
	
	
		
		


}
