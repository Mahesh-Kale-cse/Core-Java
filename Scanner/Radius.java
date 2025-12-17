package Scanner; // ✅ Package names should be lowercase

import java.util.Scanner;

public class Radius {
//	1. WAP to accept radius and calculate area of the circle.

    // ✅ Method to calculate and print the area of a circle
    public static void calculateArea(double radius) {
        double area = Math.PI * radius * radius; // Area = πr²
        System.out.println("Area of the circle: " + area);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        System.out.println("Radius is: " + radius);

        // ✅ Call the method to calculate area
        calculateArea(radius);

        sc.close();
    }
}
