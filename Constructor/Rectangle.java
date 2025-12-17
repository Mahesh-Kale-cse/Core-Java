package Constructor;

public class Rectangle {
//	2. Create a class Rectangle with variables length and width. Add a method calculateArea() 
//	that returns the area. In main(), create two rectangle objects with different values 
//	and print their areas.
	
	double length;
	double width;
	
	double calculateArea() {
		return length*width;
	}
    
    public Rectangle(double l,double w) {
    	length=l;
    	width=w;
    }
    
    public static void main(String args[]) {
    	Rectangle a = new Rectangle(5,5);
    	System.out.println("Area of Rectangle : "+a.calculateArea());
    }

}
