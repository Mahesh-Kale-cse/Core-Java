package Class_and_Object;

public class Student {
	
//	1. Create a class Student with variables name, rollNo, and marks. Add a method 
//	displayDetails() to print student information. In main(), 
//	create 3 Student objects and display their details.
	
	public String name;
	public int rollNo;
	public int marks;
	
	public void displayDetails() {
		
		System.out.println("Name : "+name);
		System.out.println("rollNo : "+rollNo);
		System.out.println("marks : "+marks);
	}
	
	public static void main(String args[]) {
		Student data = new Student();
		
		data.name="Mahesh";
		data.rollNo=01;
		data.marks=100;
		data.displayDetails();
		
		data.name="Soham";
		data.rollNo=02;
		data.marks=100;
		data.displayDetails();
		
		data.name="Prathamesh";
		data.rollNo=03;
		data.marks=100;
		data.displayDetails();
	}
	

}
