package Constructor;

public class Constructor {

    String name;
    String degree;
    double age;
    String status;

    // 1. Default constructor
        // No constructor written here       
        // When no constructor is written

    
    // 2. Non-Parameterized constructor
    public Constructor() {
        System.out.println("This is a Non-Parameterized constructor.");
    }

    // 3. Parameterized constructor
    public Constructor(String n) {
        name = n;
        System.out.println("This is a Parameterized constructor.");
    }
    public Constructor(String n,String d) {
    	name = n;
    	degree = d;
    }
    public Constructor(String n,String d,double a) {
    	name = n;
    	degree = d;
    	age = a;
    }
    public Constructor(String n,String d,double a,String s) {
    	name = n;
    	degree = d;
    	age = a;
    	status = s;
    }
    

    public static void main(String[] args) {
        // Java would give you default constructor only if you hadn't written any constructor.
        // But since we have constructors, this becomes your non-parameterized one.
        
    	// Call default constructor
    	Constructor c1 = new Constructor(); // uses default but show Non-Parameterized
        
    	// Call Non-parameterized constructor
    	Constructor c2 = new Constructor(); // Uses Non-Parameterized
        
        
    	// Call parameterized constructor
        Constructor c3 = new Constructor("Mahesh Kale"); // Uses Parameterized
        System.out.println("Name: " + c3.name);
        Constructor c4 = new Constructor("Mahesh Kale","Computer Science"); // Uses Parameterized
        System.out.println("Name: " + c4.name+" "+c4.degree);
        Constructor c5 = new Constructor("Mahesh Kale","Computer Science",22); // Uses Parameterized
        System.out.println("Name: " + c5.name+" "+c5.degree+" "+c5.age);
        Constructor c6 = new Constructor("Mahesh Kale","Computer Science",22,"Bussinessman"); // Uses Parameterized
        System.out.println("Name: " + c6.name+" "+c6.degree+" "+c6.age+" "+c6.status);
    }
}
