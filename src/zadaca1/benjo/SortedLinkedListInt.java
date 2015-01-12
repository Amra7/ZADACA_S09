package zadaca1.benjo;

/**
 * Class Linked list with inner class Node.
 * 
 * @author Amra
 *
 */
public class SortedLinkedListInt {

	private int size;
	private Node head;
	private int[] array;

	/**
	 * Constructor for LinkedListInt
	 */
	public SortedLinkedListInt() {
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
	public SortedLinkedListInt(int size, Node head) {
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
		
		if (head == null){
			head = newNode;
			size++;
			return;
		}
		
		
		if( head.value > newNode.value){
			newNode.next = head;
			head = newNode;
			size++;
		} else if (head.value < newNode.value){
			Node current = head.next;
			Node prev = head;
			while ( current != null){
				if (current.value > newNode.value){
					break;
				}				
				prev = current;
				current = current.next;			
			}
			newNode.next = current;
			prev.next = newNode;
			size++;
		}

//		if (size == 0) {
//			head = newNode;
//			size++;
//			return;
//		}
//
//		if (size >= 1) {
//			Node current = head.next;
//			Node prev = head;
//			while (current != null) {
//				if (newNode.value <= current.value) {					
//					break;
//				} 
//					prev = prev.next;
//					current = current.next;				
//			}
//			prev.next = newNode;
//			newNode.next = current;
//			size++;		
//		}

	}

	public int[] toArray() {

		int[] arr = new int[size];

		int counter = 0;
		Node current = head;
		while (current != null) {
			arr[counter] = current.value;
			current = current.next;
			counter++;
		}

		return arr;

	}

	private void selectionSort(int[] array) {
		int j;
		for (int i = 0; i < array.length - 1; i++) {
			int min = 1;
			for (j = i + 1; j < array.length; j++) {
				if (array[j] < array[min]) {
					min = j;
				}
			}
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}

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
