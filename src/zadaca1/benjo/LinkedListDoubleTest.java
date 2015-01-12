package zadaca1.benjo;

import zadaca1.benjo.LinkedListDouble.Node;

public class LinkedListDoubleTest {

	public static void main(String[] args) {
		
		LinkedListDouble lld = new LinkedListDouble();
	    lld.add(3.4);
		lld.add(6.8);
		lld.add(2.7);
		lld.add(2.5);
		lld.add(1.6);
		lld.add(3.8);
				
		System.out.println(lld.toString());
		int position = lld.getPositon(2);
		lld.add(position, 2.6);
		System.out.println(lld.toString());
	}
}
