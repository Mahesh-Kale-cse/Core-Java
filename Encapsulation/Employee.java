package Encapsulation;

public class Employee {
//	Write a class Employee with private fields id , name , and salary . Create getter and 
//	setter methods for all fields. Include logic in the setter to prevent negative salary.

	private int id;
	private String name;
	private double salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if(salary>=0) {
			this.salary=salary;			
		}else {
			System.out.println("Salary cannot be Negative");		
		}
	}
}
