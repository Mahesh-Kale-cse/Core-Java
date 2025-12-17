package Inheritance;

class car{
	
	public void showcar() {
		System.out.println("Car : ");
	}
}

class mahindra extends car{
	String car1;
	
	public void show1() {
		System.out.println("Brand : "+car1);
	}
	
}

class tata extends car{
	String car2;
	
	public void show2() {
		System.out.println("Brand : "+car2);
	}
	
}

class thar extends mahindra{
	String car3;
	
	public void show3() {
		System.out.println("Model : "+car3);
	}
	
}

class harrier extends tata{
	String car4;
	
	public void show4() {
		System.out.println("Model : "+car4);
	}
	
}

public class Hybrid {
	public static void main(String args[]) {
		
		System.out.println("All Indian Cars ");
		
		thar car1 = new thar();
		car1.car1="Mahindra";
		car1.car3="Thar";
		car1.showcar();
		car1.show1();
		car1.show3();
		
		harrier car2 = new harrier();
		car2.car2="Tata";
		car2.car4="Harrier";
		car2.showcar();
		car2.show2();
		car2.show4();
	}
	

}
