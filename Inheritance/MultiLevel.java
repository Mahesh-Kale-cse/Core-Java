package Inheritance;


class A {
	
    String name;
	
	public void  showname(){
		System.out.println("First Name : "+name);
	}
}

class B extends A {
	
	String middlename;
	
	public void showmiddlename(){
		System.out.println("Middle Name : "+middlename);
	}
}

class C extends B {
	
	String surname;
	
	public void showsurname(){
		System.out.println("Surname : "+surname);
	}
}

class D extends C {
	
	int age;
	
	public void showage(){
		System.out.println("Age : "+age);
	}
}



public class MultiLevel {
	public static void main (String args[]) {
		D show = new D();
		
		show.name="Mahesh";
		show.middlename="Diliprao";
		show.surname="Patil";
		show.age=22;
		show.showname();
		show.showmiddlename();
		show.showsurname();
		show.showage();
	}

}
