package Polymorphism.Overloading;

public class overloading {
	
	public void add(int a, int b) {
		System.out.println("Addition : "+(a+b));
	}
	
	public void add(int a, int b, int c) {
		System.out.println("Addition : "+(a+b+c));
	}
	
	public void add(int a, int b, int c, int d) {
		System.out.println("Addition : "+(a+b+c+d));
	}


	public static void main(String args[]) {
		
		overloading o1 = new overloading();
		o1.add(3, 4);
		
		overloading o2 = new overloading();
		o2.add(3, 4, 5);
		
		
		overloading o3 = new overloading();
		o3.add(3, 4, 5, 6);
		
	
	}

}
