package Constructor;

public class Product {
//	7. Create a class Product with variables name, price, and discountPercent. Add a method
//	calculateDiscountPrice() that returns price after discount. 
//	In main(), create 2 product objects and display their final prices.
	
	String name;
	int price;
	double discountPercent;
	
	Product(String name,int price,double discountPercent){
		this.name=name;
		this.price=price;
		this.discountPercent=discountPercent;
	}
	
	double calculateDiscountPrice() {
		return price-(price*discountPercent/100);
	}
	
	void showdetail() {		
		System.out.println("Name : "+name);
		System.out.println("Price : "+price);
		System.out.println("discountPercent : "+discountPercent+ "%");
		System.out.println("Final Price : "+calculateDiscountPrice());
		System.out.println("----------------------------");
		
	}
	
	
	
	
	public static void main(String args[]) {
	 
		Product p1 = new Product("Laptop",70000,42);
		Product p2 = new Product("SmartPhone",50000,28);
		
		p1.showdetail();
		p2.showdetail();
		
	}
	
}
