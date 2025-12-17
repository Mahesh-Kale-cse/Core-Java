package Constructor;

public class Student {
//	1. Create a class Student with variables name, rollNo, and marks. Add a method 
//	displayDetails() to print student information. In main(), 
//	create 3 Student objects and display their details.
	
	String name;
	int rollNo;
	double marks;
	
	void displayDetails() {
		System.out.println("Name : "+name);
		System.out.println("rollNo : "+rollNo);
		System.out.println("marks : "+marks);
	}
	
	public Student(String n,int r,double m) {
		name=n;
		rollNo=r;
		marks=m;
	}
	
	public static void main(String args[]) {
		Student s = new Student("Mahesh",21,100);
		s.displayDetails();
	}

}
