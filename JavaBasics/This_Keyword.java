package JavaBasics;

public class This_Keyword {
	
	String name; // <- this is a global/instance variable 
	public This_Keyword(String name) {
		this.name= name;
		
	}

	//	The "this" keyword always points to the instance or global variables.
	
	//  we want to used same variable name as our class variable name we can used 
	//  this keyword to assign properly and don't get any error

	
	public static void main(String args[]) {
		This_Keyword a = new This_Keyword("Mahesh Kale");
		System.out.println(a.name);
	}

}
