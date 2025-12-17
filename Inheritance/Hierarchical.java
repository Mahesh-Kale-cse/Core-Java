package Inheritance;

class subject{
	
	public void showsubject() {
		System.out.print("Subject : ");
	}
}

class marathi extends subject{
	String sub1;
	
	public void show1() {
		System.out.println(sub1);
	}
	
}

class hindi extends subject{
	String sub2;
	
	public void show2() {
		System.out.println(sub2);
	}
	
}

class english extends subject{
	String sub3;
	
	public void show3() {
		System.out.println(sub3);
	}
	
}



public class Hierarchical {
	public static void main(String args[]) {
		
		System.out.println("All Subjects");
		marathi sub1 = new marathi();
		
		sub1.showsubject();
		sub1.sub1="Marathi";
		sub1.show1();
		
		hindi sub2 = new hindi();
		
		sub2.showsubject();
		sub2.sub2="Hindi";
		sub2.show2();
		
		english sub3 = new english();
		
		sub3.showsubject();
		sub3.sub3="English";
		sub3.show3();
	}

}
