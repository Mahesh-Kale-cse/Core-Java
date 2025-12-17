package Polymorphism.Overriding;


	
	class Animal {
	    void sound() {
	        System.out.println("Animal makes a sound");
	    }
	}


	class Dog extends Animal {
		@Override
	    void sound() {
	    	super.sound(); 
	        System.out.println("Dog barks");
	    }
	}

	class Cat extends Animal {
		@Override
	    void sound() {
	        System.out.println("Cat meows");
	    }
	}

	public class overridding {
	    public static void main(String[] args) {
	        Animal a1 = new Dog();  // parent reference, child object
	        Animal a2 = new Cat();  // parent reference, child object

	        a1.sound();  // Dog's version runs
	        a2.sound();  // Cat's version runs
	    }
	}


