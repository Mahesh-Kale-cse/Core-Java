package Scanner;

import java.util.Scanner;

public class Cube {
	
//	2. WAP to accept number and find its cube.

	public static void calculateCube(long number) {
		long cube=number*number*number;
		System.out.print("Cube of number is : "+cube);
		
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		long number =sc.nextLong();
		
		System.out.println("Number is : "+number);
		calculateCube(number);
		
		sc.close();
	}

}
