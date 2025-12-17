package Class_and_Object;

public class Car {
//	6. Create a class Car with variables model, brand, and mileage. 
//	Add a method showCarInfo() that prints all details. 
//	In main(), create objects for 2 cars and display their info.
	
	String model;
	String brand;
	double milege;
	
	void showCarInfo() {
		System.out.println("Model : "+model+", Brand : "+brand+", Milege : "+milege);
	}
	
	public static void main(String args[]) {
		Car c1 = new Car();
		
		c1.model="Shelby";
		c1.brand="Ford";
		c1.milege=50;
		c1.showCarInfo();
		
		c1.model="Defender";
		c1.brand="Range Rover";
		c1.milege=50;
		c1.showCarInfo();
	}
}
