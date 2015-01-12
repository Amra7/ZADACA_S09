package zadaca1.benjo;



/**
 * Class Linked list with inner class Node.
 * 
 * @author Amra
 *
 */
public class LinkedListDouble {

	private int size;
	private Node head;

	/**
	 * Constructor for LinkedListInt
	 */
	public LinkedListDouble() {
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
	public LinkedListDouble(int size, Node head) {
		super();
		this.size = size;
		this.head = head;
	}

	/**
	 * Adds new Node(value) in Linked list
	 * @param value - value that we want to add.
	 */
	public void add(double value) {
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

	}

	/**
	 * Adds new Node(value) on index we forwarded.
	 * @param index - index(offset) on which we put new value.
	 * @param value - new value we forward.
	 */
	public void add(int index, double value){
		Node newNode = new Node(value);
		
		if( index == 0 ){
			head.next = head;
			head = newNode;
			size++;
			return;
		}
		
		Node current = head.next;
		Node prev = head;
		int counter = 1;
		
		while(counter < index){
			prev = prev.next;
			current = current.next;
			counter++;
		}
		
		prev.next = newNode;
		newNode.next = current;
		size++;
				
	}
	
	public int getPositon(int count){
		int counter = 0;
		Node current = head;
		while (counter < count){
			current = current.next;
			counter++;
		}
		
		return counter;
		
	}
	
	/**
	 * Removes Node form index we sent.
	 * @param index - from which we want to remove Node.
	 */
	public void remove(int index){
		Node current = head;
		if( index == 0){
			head = current.next;
			current = null;
			size--;
			return;
		}
		
		current = head.next;
		Node prev = head;
		int counter = 1;
		while( counter < index){
			prev = prev.next;
			current = current.next;
			counter++;
		}		
		prev.next=current.next;
		current = null;
		size--;
			
	}
	
	/**
	 * Getter for size of linked list.
	 * @return size of linked list.
	 */
	public int getSize(){
		return  size;
	}
	
	/**
	 * Checks if LinkedList contains forwarded value.
	 * @param value
	 * @return
	 */
	public boolean contains(int value){
		boolean contains = false;
		
		Node current = head;
		while (current != null){
			if( current.value == value){
				return true;
			}
			current = current.next;
			
		}
		return contains;
	}
	
	/**
	 * Converts all elements to String.
	 */
	public String toString(){
		String str = "";
		str ="[ ";
		Node current = head;
		while(current != null){
			str += current.value;
			current = current.next;
			if( current != null){
				str += ", ";
			}
		}
		str += " ]";
		return  str;
		
	}

	// inner class Node
	public class Node {
		public double value;		
		public Node prev;
		public Node next;
		

		/**
		 * Constructor for Node if the next references to null.
		 * @param prev - previous node.
		 * @param value - value of new Node.
		 */
		public Node( double value) {
			this.prev = null;
			this.value = value;
			this.next = null;
		}
		/**
		 * Constructor for Node if the next references to null.
		 * @param prev - previous node.
		 * @param value - value of new Node.
		 */
		public Node( Node prev, double value) {
			this.prev = prev;
			this.value = value;
			this.next = null;
		}
		
		/**
		 * Constructor for Node in the middle of Linked list.
		 * @param prev- previous node.
		 * @param value - value of new Node.
		 * @param next - next Node.
		 */
		public Node( Node prev, double value , Node next) {
			this.prev = prev;
			this.value = value;
			this.next = next;
		}
		
		/**
		 * Constructor for Node at the beginning  of Linked list.
		 * @param value - value of new Node.
		 * @param next - next Node.
		 */
		public Node(  double value , Node next) {
			this.prev = null;
			this.value = value;
			this.next = next;
		}

		/**
		 * Getter for value.
		 * @return value of node.
		 */
		public double getValue() {
			return value;
		}

		/**
		 * Getter for next Node.
		 * @return next node.
		 */
		public Node getNext() {
			return next;
		}

		/**
		 * Setter for next Node.
		 * @param other - new Node.
		 */
		public void setNext(Node other) {
			this.next = other.next;
		}
		
		/**
		 * Getter for previous.
		 * @return previus Node.
		 */
		public Node getPrev() {
			return prev;
		}
	}

	// end of class LinkedListInt
}
