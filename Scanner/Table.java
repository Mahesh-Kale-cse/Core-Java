package Scanner;
import java.util.Scanner;

public class Table {
	
//	3. WAP to accept number and print its table.
	
	public static void table(int number) {
		System.out.println("\nMultiplication Table of " + number + ":");
		for(int i=1; i<=10; i++) {
		      System.out.println(number + " x "+ i+ " = " + (i*number));
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		int number = sc.nextInt();
		
		table(number);
		
		sc.close();
	}

}
