package Class_and_Object;

public class Class_and_Object {
	
	String Name;
    String Address;
	
	public void showstudentinfo() {
		
		System.out.println("Name : "+Name);
		System.out.println("Address : "+Address);		
//		-----------------OR-----------------
		System.out.println("Name : "+Name+", Address : "+Address);
	}
	
	public static void main(String args[]) {	

		Class_and_Object a1 = new Class_and_Object();
		a1.Name="Mahesh";
		a1.Address="Ukd";
		a1.showstudentinfo();
		
		Class_and_Object b2 = new Class_and_Object();
		b2.Name="Prathamesh";
		b2.Address="Dhanora";
		b2.showstudentinfo();
		
//		-----------------OR-----------------
		
		Class_and_Object c1 = new Class_and_Object();
		
		c1.Name="Mahesh";
		c1.Address="Ukd";
		c1.showstudentinfo();
		
		c1.Name="Prathamesh";
		c1.Address="Dhanora";
		c1.showstudentinfo();
		
		
		
	}
}
