package Encapsulation;

public class Circle {
//	Write a class Circle with private variable radius . Write getter and setter methods and a
//	method to calculate the circumference.
	
	private double radius;
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public void circumference() {
		 double c=2*3.14*radius;
		System.out.println("Circumference : "+c);		
	}
	
}
