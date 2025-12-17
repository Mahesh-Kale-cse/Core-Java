package Collection;

import java.util.ArrayList;

public class List {
	
public static void main(String args[]) {
		
	ArrayList<String> list = new ArrayList<String>();
	
	list.add("Mango");
	list.add("Apple");
	list.add("Kiwi");
	list.add("Papaya");
	list.add("Cherry");
	
	list.remove(3);
	System.out.println(list.get(2));
	list.add(2, "Strawberry");
	System.out.println(list);


		
		
	}

}
