package Constructor;

public class Car {
//	6. Create a class Car with variables model, brand, and mileage. 
//	Add a method showCarInfo() that prints all details. 
//	In main(), create objects for 2 cars and display their info.
	
	String model;
	String brand;
	double milege;
	
	public Car(String model,String brand,double milege) {
		this.model=model;
		this.brand=brand;
		this.milege=milege;
	}
	public Car(String model,String brand) {
		this.model=model;
		this.brand=brand;
	}
	
	void showCarInfo() {
		System.out.println("Model : "+model);
		System.out.println("Brand : "+brand);
		System.out.println("Milege : "+milege);
	}
	
	public static void main(String args[]) {
		Car info = new Car("Defender","Range Rover",40);
		info.showCarInfo();
		Car info1 = new Car("Harrier","Tata");
		System.out.println("Model : " + info1.model+", Brand : "+info1.brand);
	}
}
