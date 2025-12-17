package Collection;

import java.util.TreeSet;

public class Problem {

	public static void main(String args[]) {
		
//		Q. WAP to accept name of your 5 friends.
		
//		A.Print all friends in ascending order.
//		B.Remove Manoj from your friend circle.
//   	C.Remove all friends from your circle.
//		D.Check if Neha is your friend or not. Hint: contains method
	
		
		TreeSet<String> s = new TreeSet<String>();
	
		s.add("Mahesh");
		s.add("Prathamesh");
		s.add("Manoj");
		s.add("Mahadev");
		s.add("Krishna");
		s.add("Neha");
		
		System.out.println(s);
		
		s.remove("Manoj");
		System.out.println(s);
		
		System.out.println(s.contains("Neha"));

		s.removeAll(s);
		System.out.println(s);
		
		
		
		
	}
}
