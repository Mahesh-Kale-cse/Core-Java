package Class_and_Object;

public class Product {
//	7. Create a class Product with variables name, price, and discountPercent. Add a method
//	calculateDiscountPrice() that returns price after discount. 
//	In main(), create 2 product objects and display their final prices.
	
	String name;
	double price;
	double discountPercent;
	
	double calculateDiscountPrice() {
		return price - (price*discountPercent/100);	
	}
	
	public static void main(String args[]) {
		Product p1 = new Product();
		
		p1.name="Laptop";
		p1.price=70000;
		p1.discountPercent=28;
		System.out.println("Final Price : "+p1.calculateDiscountPrice());
		
		p1.name="Smartphone";
		p1.price=80000;
		p1.discountPercent=40;
		System.out.println("Final Price : "+p1.calculateDiscountPrice());

	}
}
