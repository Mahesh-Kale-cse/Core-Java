package Scanner;
import java.util.Scanner;

public class Average {
//	5. WAP to accept 5 numbers and display average of them.

	public static void DisplayAverage(int num1,int num2,int num3,int num4,int num5) {
		int average=(num1+num2+num3+num4+num5)/5;
		System.out.print("The Average of 5 numbers is : "+average);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the First Number : ");
		int num1=sc.nextInt();
		
		System.out.print("Enter the Second Number : ");
		int num2=sc.nextInt();
		
		System.out.print("Enter the Third Number : ");
		int num3=sc.nextInt();
		
		System.out.print("Enter the Fourth Number : ");
		int num4=sc.nextInt();
		
		System.out.print("Enter the Fifth Number : ");
		int num5=sc.nextInt();
		
		DisplayAverage(num1,num2,num3,num4,num5);
		
		sc.close();
	}
}
