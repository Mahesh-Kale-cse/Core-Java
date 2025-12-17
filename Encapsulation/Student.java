package Encapsulation;

public class Student {
//	Create a class Student with private fields rollNo and marks . Write getter and 
//	setter methods and a method to display student details.
	
	private int rollNo;
	private double marks;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public void studentDetail() {
		System.out.println("RollNo : "+rollNo);
		System.out.println("marks : "+marks);
		
	}
	
}
