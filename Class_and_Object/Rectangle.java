package Class_and_Object;

public class Rectangle {
	
//	2. Create a class Rectangle with variables length and width. Add a method calculateArea() that
//	returns the area. In main(), create two rectangle objects with different values 
//	and print their areas.
	
	public int length;
	public int width;
	
	double calculateArea() {
		return length*width;
	}
	
    public static void main(String args[]) {
    	Rectangle Area = new Rectangle();
    	
    	Area.length=5;
    	Area.width=5;
    	System.out.println("Area Of Rectangle is "+Area.calculateArea());

    	Area.length=10;
    	Area.width=8;
    	Area.calculateArea();
    	System.out.println("Area Of Rectangle is "+Area.calculateArea());
    	
    }
    
}
