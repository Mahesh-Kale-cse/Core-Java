package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class set {

	public static void main(String args[]) {

//		HashSet -> maintains random order
		HashSet<Object> sc = new HashSet<Object>();
		
		sc.add(21);
		sc.add(true);
		sc.add("D");
		sc.add("Success");
		sc.add(3.1416F);
		
		System.out.println(sc.size());
		System.out.println(sc);
        sc.remove("D");
		System.out.println(sc.size());
		System.out.println(sc);

		
//		LinkedHashSet -> maintains insertion order
		LinkedHashSet<String> a = new LinkedHashSet<String>();
		
		a.add("C++");
		a.add("Python");
		a.add("Java");
	    a.add("Success");
		a.add("Mahesh");
		a.add("Patil");
		
		System.out.println(a);
		
		
//		TreeSet -> maintains sorted order
		TreeSet<String>  s= new TreeSet<String>();
		
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
