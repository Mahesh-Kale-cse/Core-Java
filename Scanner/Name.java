package Scanner;
import java.util.Scanner;

public class Name {
//	4. WAP to accept first name, middle name and surname and print full name.

	public static void FullName(String firstName, String middleName, String surName) {
		System.out.println("Fullname is : "+firstName+" "+middleName+" "+surName);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the First Name : ");
		String firstName = sc.nextLine();
		
		System.out.print("Enter the Middle Name : ");
		String middleName = sc.nextLine();
		
		System.out.print("Enter the SurName : ");
		String surName = sc.nextLine();
		
		FullName(firstName,middleName,surName);
		
		sc.close();
	}

}
