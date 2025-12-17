package Encapsulation;

public class main_method {
	
	public static void main(String args[]) {
	
	
//---------------------------------------------------------------------------------------------	

// The Encapsulation basic Info	
		
		Encapsulation studentdata = new Encapsulation();
		
//		studentdata.name=" Mahesh Patil ";  
//        <- this is valid when we call a public variable and we cannot call private variable 
//           in this we need getter and setter method 
		
		
		studentdata.showdata();
		studentdata.setName("Mahesh Patil");  // <- this is valid when we call a private variable 
		studentdata.setRollNo(123);  // <- this is valid when we call a private variable 
		studentdata.setGrade(342.00);  // <- this is valid when we call a private variable 
		studentdata.setGender("Male");  // <- this is valid when we call a private variable 
		studentdata.getName();          // <- this is valid when we call a private variable 
		studentdata.showdata();
	
//---------------------------------------------------------------------------------------------	

//      Create a class Person with private variables name and age . 
//	    Provide public getter and setter methods for both variables.

		Person d = new Person();
		
		d.setName("Mahesh");
		System.out.println(d.getName());
		d.setAge(22);
		System.out.println(d.getAge());
//		
		
//---------------------------------------------------------------------------------------------		
		
//		Write a class BankAccount with a private variable balance . Add a method to deposit 
//		an amount and a method to withdraw an amount. Include appropriate getters and setters.
		
		BankAccount detail = new BankAccount();
		detail.setBalance(400);  
		detail.deposit(600);
		detail.withdraw(500);
		System.out.println("Balance: " + detail.getBalance());
		
//---------------------------------------------------------------------------------------------		
		
//		Write a class Book with private fields title and author . Use getter and setter methods 
//		to manipulate the data.
		
		Book lab = new Book();
		lab.setTitle("Ravan");
		lab.setAuthor("Sharad Tandale");
		System.out.println("Book Title : "+lab.getTitle());
		System.out.println("Book Title : "+lab.getAuthor());

//---------------------------------------------------------------------------------------------		

		
//		Create a class Car with a private variable speed . Implement getter and setter methods. 
//		In the setter, ensure speed cannot exceed 200 km/h.
		
		
		Car s = new Car();
		
		s.setSpeed(340);
		System.out.println("Car Speed : "+	s.getSpeed());
	
//---------------------------------------------------------------------------------------------		
		
//		Write a class Circle with private variable radius . Write getter and setter methods and a
//		method to calculate the circumference.
				

		Circle c = new Circle();
		c.setRadius(5);
		System.out.println("Radius : "+c.getRadius());
		c.circumference();

//---------------------------------------------------------------------------------------------		

//Write a class Employee with private fields id , name , and salary . Create getter and 
//setter methods for all fields. Include logic in the setter to prevent negative salary.

		Employee data = new Employee();
		data.setId(34);
		data.setName("Mahesh");
		data.setSalary(-5000000);
		
		System.out.println("Id : "+data.getId());
		System.out.println("Name : "+data.getName());
		System.out.println("Salary : "+data.getSalary());

//---------------------------------------------------------------------------------------------		
    
//		Create a class Rectangle with private fields length and width . Write getter and setter
//		methods and a method to calculate area.
		
		
		Rectangle area = new Rectangle();
		area.setLength(6);
		area.setWidth(5);
		area.Area();

//---------------------------------------------------------------------------------------------		

//		Create a class Student with private fields rollNo and marks . Write getter and 
//		setter methods and a method to display student details.

		
		Student StudentDetail = new Student();
		StudentDetail.setRollNo(8);
		StudentDetail.setMarks(153);
		StudentDetail.studentDetail();




	}
}