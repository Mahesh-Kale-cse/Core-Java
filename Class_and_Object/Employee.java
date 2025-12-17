package Class_and_Object;

public class Employee {
	
//	3. Create a class Employee with variables empId, empName, and salary. Add methods
//	showDetails() and increaseSalary(double amount). In main(), create objects for two employees,
//	increase their salary, and show updated details.
	
	    public int empId;
	    public String empName;
	    public double salary;  

	    public void showDetails() {
	        System.out.println("Employee ID: " + empId);
	        System.out.println("Employee Name: " + empName);
	        System.out.println("Employee Salary: " + salary);
	        System.out.println("-----------------------------");
	    }

	    public void increaseSalary(double amount) {
	        salary += amount;
	    }
	    
	    
	    public static void main() {
	    	
	    	Employee employee1 = new Employee();
	        employee1.empId = 23;
	        employee1.empName = "Mahesh";
	        employee1.salary = 5000000;
	        employee1.increaseSalary(50000);  
	        employee1.showDetails();

	        Employee employee2 = new Employee();
	        employee2.empId = 45;
	        employee2.empName = "Prathamesh";
	        employee2.salary = 100000;
	        employee2.increaseSalary(10000); 
	        employee2.showDetails();
	    
	    }
}
