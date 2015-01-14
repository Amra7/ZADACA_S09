package zadaca2.benjo;

/**
 * Class Linked list with inner class Node.
 * 
 * @author Amra
 *
 */
public class LinkedListIntRemoveDuplicate {

	private int size;
	private Node head;

	/**
	 * Constructor for LinkedListInt
	 */
	public LinkedListIntRemoveDuplicate() {
		super();
		this.size = 0;
		this.head = null;
	}

	/**
	 * Constructor for LinkedListInt
	 * 
	 * @param size
	 *            - size of list.
	 * @param head
	 *            - first Node of list.
	 */
	public LinkedListIntRemoveDuplicate(int size, Node head) {
		super();
		this.size = size;
		this.head = head;
	}

	/**
	 * Adds new Node(value) in Linked list
	 * 
	 * @param value
	 *            - value that we want to add.
	 */
	public void add(int value) {
		Node newNode = new Node(value);

		if (size == 0) {
			head = newNode;
			size++;
			return;
		}

		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
		size++;

	}

	/**
	 * Adds new Node(value) on index we forwarded.
	 * 
	 * @param index
	 *            - index(offset) on which we put new value.
	 * @param value
	 *            - new value we forward.
	 */
	public void add(int index, int value) {
		Node newNode = new Node(value);

		if (index == 0) {
			head.next = head;
			head = newNode;
			size++;
			return;
		}

		Node current = head.next;
		Node prev = head;
		int counter = 1;

		while (counter < index) {
			prev = prev.next;
			current = current.next;
			counter++;
		}

		prev.next = newNode;
		newNode.next = current;
		size++;

	}

	/**
	 * Removes Node form index we sent.
	 * 
	 * @param index
	 *            - from which we want to remove Node.
	 */
	public void remove(int index) {
		Node current = head;
		if (index == 0) {
			head = current.next;
			current = null;
			size--;
			return;
		}

		current = head.next;
		Node prev = head;
		int counter = 1;
		while (counter < index) {
			prev = prev.next;
			current = current.next;
			counter++;
		}
		prev.next = current.next;
		current = null;
		size--;

	}

	/*
	 * Zadatak 1,2. Ne radi!
	 */

	public void removeDuplicates() {
		if (head == null)
			return;

//		int search;
//		for (Node prev = head; prev.next != null; prev = prev.next) {
//			Node current = prev.next;
//			search = prev.value;
//
//			if (search == current.value) {
//				prev.next = current.next;
//				current = null;
//				
//			} else {
//				
//				for (current = prev.next.next && ; current.next != null; current = current.next) {
//	                 
//				}
//			}
//			
//
//		}
		
		/*************************************************/

		 Node iterator = head;
		
		 while(iterator.next != null){
		 Node prev = iterator;
		 Node current = prev.next;
		 int search = iterator.value;
		
		 while (prev != null){
		 if(prev.next.value == search){
		 prev.next = current.next;
		 current.next =null;
		 }
		 prev = prev.next;
		 current = current.next;
		 }
		
		 iterator = iterator.next;
		 }

		// while (prev.next != null) {
		//
		// Node current = prev.next;
		// int search = prev.value;
		//
		// while (current != null) {
		// if (current.value == search) {
		// prev.next = current.next;
		// } else {
		// current = current.next;
		// }
		// }
		// prev = prev.next;
		// }

	}

	/*
	 * Zadatak 3
	 */

	/**
	 * Getter for value of Middle Node
	 * 
	 * @return value of middle node.
	 */
	public int getMiddleValue() {
		if (head == null)
			throw new NullPointerException("List is empty");

		Node slow = head;
		Node fast = head;

		while (fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow.value;
	}

	/*
	 * Zadatak 4
	 */

	/**
	 * Getter for value of n node.
	 * 
	 * @param n
	 *            - number of position of node from back.
	 * @return value of node on n position from back.
	 */
	public int getNtoLastValue(int n) {
		Node current = head;
		Node nNode = head;
		int count = 0;

		while (count < n) {
			nNode = nNode.next;
			count++;
		}

		while (nNode != null) {
			nNode = nNode.next;
			current = current.next;
		}

		return current.value;
	}

	/**
	 * Getter for head Node.
	 * 
	 * @return head Node.
	 */
	public Node getHead() {
		return head;
	}

	/**
	 * Getter for size of linked list.
	 * 
	 * @return size of linked list.
	 */
	public int getSize() {
		return size;
	}

	/**
	 * Checks if LinkedList contains forwarded value.
	 * 
	 * @param value
	 * @return
	 */
	public boolean contains(int value) {
		boolean contains = false;

		Node current = head;
		while (current != null) {
			if (current.value == value) {
				return true;
			}
			current = current.next;

		}
		return contains;
	}

	public String toString() {
		String str = "";
		str = "[ ";
		Node current = head;
		while (current != null) {
			str += current.value;
			current = current.next;
			if (current != null) {
				str += ", ";
			}
		}
		str += " ]";
		return str;

	}

	// inner class Node
	private class Node {
		public int value;
		public Node next;

		public Node(int value) {
			this.value = value;
			this.next = null;
		}

		public int getValue() {
			return value;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node other) {
			this.next = other.next;
		}
	}

	// end of class LinkedListInt
}
