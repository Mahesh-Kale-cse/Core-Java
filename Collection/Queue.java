package Collection;

import java.util.ArrayDeque;

public class Queue {
	
	public static void main(String args[]) {
		
		ArrayDeque<String> aq = new ArrayDeque<String>();
		
		aq.add("Mango");
		aq.add("Kiwi");
		aq.add("Apple");
		aq.add("Cherry");
		aq.add("Kiwi");
		aq.add("Papaya");
		aq.add("Kiwi");
		
		System.out.println(aq.getFirst());
		System.out.println(aq.getLast());

		
		
	}

}
