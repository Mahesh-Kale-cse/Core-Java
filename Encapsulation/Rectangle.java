package Encapsulation;

public class Rectangle {
//	Create a class Rectangle with private fields length and width . Write getter and setter
//	methods and a method to calculate area.
	
	private double length;
	private double width;
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void Area() {
		double area = length*width;
		System.out.println("Area is : "+area);
	}
	
	
}
