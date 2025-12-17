package Polymorphism.Overriding;

class Father {
	
	public void bike() {
		System.out.println("Scooter");
	}
}

class Son extends Father {

	@Override
	public void bike() {
		System.out.println("Bullet Classic 350");
	}
}



public class problem {
	
	
	public static void main(String args[]) {
		
		Father  a = new Son();
		
		a.bike();
			
	}
	
	

}
