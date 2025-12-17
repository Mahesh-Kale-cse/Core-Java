package Class_and_Object;

public class Mobile {
//	10. Create a class Mobile with variables brand, price, and ramSize. 
//	Add a method showSpecs() to print details. In main(), create objects 
//	for 3 mobiles and print their specifications.
	
	String brand;
	double price;
	int ramSize;
	
	void showSpecs() {
		System.out.println("Brand : "+brand+", Price : "+price+", ramSize : "+ramSize);
	}
	
	public static void main(String args[]) {
		Mobile b1 = new Mobile();
		
		b1.brand="Samsung";
		b1.price=15000;
		b1.ramSize=8;
		b1.showSpecs();

		b1.brand="Apple";
		b1.price=10000;
		b1.ramSize=6;
		b1.showSpecs();

		b1.brand="Nothing";
		b1.price=5000;
		b1.ramSize=4;
		b1.showSpecs();
	}

}
