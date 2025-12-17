package Inheritance;

class a {
	String name;
}

class b extends a {
	String surname;
	
	public void show() {
//		name="masu";
//		surname="Patil";
		System.out.println("FullName : "+name +" "+ surname);		
	}
}





public class Single {
	
	public static void main(String args[]) {
		b detail = new b();
		
		detail.name="Mahesh";
		detail.surname="Kale";
		detail.show();
	}
	
	

}
