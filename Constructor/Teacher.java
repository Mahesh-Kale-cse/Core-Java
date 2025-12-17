package Constructor;

public class Teacher {
//	9. Create a class Teacher with variables name, subject, and experience. 
//	Add a method displayInfo() to print all details. In main(), 
//	create two teacher objects and display their info.
	
	String name;
	String subject;
	double experience;
	
	void displayInfo() {
		System.out.println("Name : "+name);
		System.out.println("Subject : "+subject);
		System.out.println("Experience : "+experience+" Years");
		System.out.println("----------------------------------");
	}
	
	Teacher(String n,String s,double e) {
		name=n;
		subject=s;
		experience=e;
	}
	
	public static void main(String args[]) {
		
		Teacher t1 = new Teacher("Mahesh","Math",5);
		t1.displayInfo();

		Teacher t2 = new Teacher("Jaya","Physics",8);
		t2.displayInfo();
	}

}
