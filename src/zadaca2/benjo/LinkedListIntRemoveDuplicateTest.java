package zadaca2.benjo;

/**
 * Main class for testing LinkedListInt
 * @author Amra
 *
 */
public class LinkedListIntRemoveDuplicateTest {

	public static void main(String[] args) {

		LinkedListIntRemoveDuplicate lli = new LinkedListIntRemoveDuplicate();
		lli.add(2);
		lli.add(5);
		lli.add(3);
		lli.add(2);
		lli.add(5);
		lli.add(13);
		lli.add(27);
		lli.add(5);
		
		

		System.out.println("Added several of elements \n" + lli.toString());
//		lli.removeDuplicates(lli.getHead());
		System.out.println("Removed duplicates \n" + lli.toString());
		
		System.out.println("Middle value: " + lli.getMiddleValue());
		
		System.out.printf("Value od n = %d node is %d",3, lli.getNtoLastValue(3));
		
	}
}
