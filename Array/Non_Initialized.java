package Array;

import java.util.Scanner;

public class Non_Initialized {
	
	public static void main(String args[]) {
		
		
		
		
//     WAP to accept 5 numbers from user and print them
		
		int number[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		
		for(int i=0; i<number.length; i++) {
			number[i] = sc.nextInt();
		}
		
		
		for(int i=0; i<number.length; i++) {
			System.out.println(number[i]);
		}
		
		
//     WAP to accept Full names from user and print them

		String name[] = new String[3];
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Full Name : ");
		
		for(int i=0; i<name.length; i++) {
			name[i] = s.next();
		}
		
		System.out.println("Full Name is : ");
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}
		
		
		
		
		
		
		
		
		
	}

}
