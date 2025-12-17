package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Map {
	
	public static void main(String args[]) {
		
		HashMap<String, String> m = new HashMap<String, String>();
		
		m.put("One", "Mahesh");
		m.put("Two", "Dipti");
		m.put("Three", "Prathamesh");
		m.put("Four", "Mouli");
		m.put("Five", "Patil");
		
		System.out.println(m);
		
		
        LinkedHashMap<String, String> n = new LinkedHashMap<String, String>();
		
		n.put("One", "Mahesh");
		n.put("Two", "Dipti");
		n.put("Three", "Prathamesh");
		n.put("Four", "Mouli");
		n.put("Five", "Patil");
		
		System.out.println(n);
		
		
        TreeMap<String, String> s = new TreeMap<String, String>();
		
		s.put("One", "Mahesh");
		s.put("Two", "Dipti");
		s.put("Three", "Prathamesh");
		s.put("Four", "Mouli");
		s.put("Five", "Patil");
		
		System.out.println(s);


			
			
		}

}
