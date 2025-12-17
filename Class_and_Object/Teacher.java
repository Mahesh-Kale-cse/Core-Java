package Class_and_Object;

public class Teacher {
//	9. Create a class Teacher with variables name, subject, and experience. 
//	Add a method displayInfo() to print all details. In main(), 
//	create two teacher objects and display their info.
	
	String name;
	String subject;
	int experience;
	
	void displayInfo() {
		System.out.println("Teacher Name : "+name+", Subject : "+subject+", Experience : "+experience);
	}
	
	public static void main(String args[]) {
		Teacher t1 = new Teacher();
		
		t1.name="Mahesh";
		t1.subject="Math";
		t1.experience=10;
		t1.displayInfo();

		t1.name="Jayu";
		t1.subject="Chemistry";
		t1.experience=15;
		t1.displayInfo();
	}

}
