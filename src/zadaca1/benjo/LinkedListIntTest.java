package zadaca1.benjo;

/**
 * Main class for testing LinkedListInt
 * @author Amra
 *
 */
public class LinkedListIntTest {

	public static void main(String[] args) {

		LinkedListInt lli = new LinkedListInt();
		lli.add(2);
		lli.add(3);
		lli.add(24);
		lli.add(27);
		lli.add(38);
		lli.add(56);

		System.out.println("Added several of elements \n" + lli.toString());

		lli.add(3, 6);
		System.out.printf("Added element %d on position %d \n", 6, 3);
		System.out.println(lli.toString());
		
		System.out.printf("\nSize of Linked list is %d", lli.getSize());
		
		lli.remove(2);
		System.out.printf("\nRemove of number on positon %d of Linked list\n",2);
		System.out.println(lli.toString());
		
		System.out.printf("\nDoes it contain number: %d - %b ",5, lli.contains(5));
		System.out.printf("\nDoes it contain number: %d - %b ",27, lli.contains(27));
	}
}
