package zadaca.benjo;
/**
 * Test class far Dynamic array
 * @author Amra
 *
 */
public class DynamicArrayIntTest {
	
    public static void main(String[] args) {
		DynamicArrayInt dai = new DynamicArrayInt();
		dai.add(3);
		dai.add(5);
		dai.add(7);
		dai.add(4);
		dai.add(9);
		dai.add(12);
		dai.add(23);
		dai.add(45);
		dai.add(56);
		dai.add(78);
		dai.add(89);
		dai.add(120);
		System.out.println("First add \n" + dai.toString());
		dai.add(0, 34);
		System.out.println("Replaced \n" + dai.toString());
		
		dai.remove(6);
		System.out.println("Removed \n" + dai.toString());
		System.out.println("Size \n" + dai.getSize());
		
		
     	System.out.printf("Does it contain number: %d - %b ", 89, dai.contains(89));
		System.out.printf("\nDoes it contain number: %d - %b", 35, dai.contains(35));
	}
}
