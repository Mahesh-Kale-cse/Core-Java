package Constructor;

public class Employee {
//	3. Create a class Employee with variables empId, empName, and salary. Add methods
//	showDetails() and increaseSalary(double amount). In main(), create objects for two employees,
//	increase their salary, and show updated details.
	
	int empId;
	String empName;
	double salary;
	
	void showDetails() {
		System.out.println("ID : "+empId);
		System.out.println("Name : "+empName);
		System.out.println("Salary : "+salary);
		
	}
	
	void increaseSalary(double amount) {
		salary+=amount;
	}
	
	public Employee(int id,String name,double s) {
		empId=id;
		empName=name;
		salary=s;
	}
	
	public static void main(String args[]) {
		Employee c = new Employee(143,"Mahesh",5000000);
		c.showDetails();
		c.increaseSalary(100000);
		c.showDetails();
		
		
	}
}
