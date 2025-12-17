package Constructor;

public class Mobile {
//	10. Create a class Mobile with variables brand, price, and ramSize. 
//	Add a method showSpecs() to print details. In main(), create objects 
//	for 3 mobiles and print their specifications.
	
	String brand;
	double price;
	int ramSize;
	
	public Mobile(String b,double p,int r) {
		brand=b;
		price=p;
		ramSize=r;
	}
	
	void showSpecs(){
		    System.out.println("Brand : " + brand);
	        System.out.println("Price : " + price);
	        System.out.println("RAM Size : " + ramSize + " GB");
	        System.out.println("----------------------------");
	}
	
	
	
	 public static void main(String[] args) {
	        Mobile m1 = new Mobile("Samsung", 50000, 8);
	        Mobile m2 = new Mobile("Nokia", 25000, 6);
	        Mobile m3 = new Mobile("Vivo", 32000, 8);

	        m1.showSpecs();
	        m2.showSpecs();
	        m3.showSpecs();
	    }
	
}
