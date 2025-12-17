package Array;
import java.util.Scanner;

public class Problems {
	
	
	public static void main(String args[]) {
		
//	Q. WAP to accept 10 numbers from user and print them.

		int Number[] = new int[10];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 numbers : ");

		for(int i=0; i<Number.length; i++) {
			Number[i] = sc.nextInt();
		}
		System.out.println("Yours 10 numbers : ");
		for(int i=0; i<Number.length; i++) {
			System.out.println(Number[i]);
		}
		
		
//	Q. WAP to accept 5 boolean values from user and count all true values.

//		int count=0;
//		boolean[] values = new boolean[2];
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter 5 Boolean Values : ");
//		
//		for(int i=0; i<values.length; i++) {
//			values[i] = sc.nextBoolean();
//		}
//		System.out.println("Total True Boolean Values : ");
//		for(int i=0; i<values.length; i++) {
//			if(values[i]==true) {
//				count++;				
//			}
//		}
//		System.out.println(count);			
		
//	Q. WAP to print array of vowels in reverse order.
	
		
//		char vowel[] = {'A','E','I','O','U'};
//		
//		for(int i=vowel.length-1; i>=0; i--) {
//			System.out.print(vowel[i] + " ");
//		}


//	Q. WAP to accept 10 numbers from user and count even numbers.
		
//		int count=0;
//		int number[]=new int[10];
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter 10 Numbers :");
//		
//		for(int i=0; i<number.length; i++) {
//			number[i] = sc.nextInt();
//		}
//		
//		for(int i=0; i<number.length; i++) {
//			if(number[i]%2 == 0) {
//				count++;
//			}
//		}
//		System.out.println(count);

//	Q. WAP to accept 10 numbers from user and add all odd numbers.
		
//	    int sum=0;
//		int number[] = new int[10];
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter 10 Numbers :");
//		
//		for(int i=0; i<number.length; i++) {
//			number[i] = sc.nextInt();
//		}
//		for(int i=0; i<number.length; i++) {
//			if(number[i]%2==1) {
//				sum+=number[i];
//			}
//		}
//		System.out.println(sum);
		
		
		
//  Q. WAP to accept 10 numbers from user and find their average.
		
//		int sum=0;
//		float average=0;
//		int number[] = new int[10];
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter 10 Numbers :");
//		
//		for(int i=0; i<number.length; i++) {
//			number[i] = sc.nextInt();
//		}
//		for(int i=0; i<number.length; i++) {
//			sum+=number[i];
//			average=sum/10;
//		}
//		System.out.println(average);
		
//----------------------OR--------------------------------------		
		
//		int sum = 0;
//		int[] m = new int[10];
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter 10 numbers: ");
//		
//		for (int i = 0; i < m.length; i++)
//			m[i] = sc.nextInt();
//		
//		for (int i = 0; i < m.length; i++)
//				sum+=m[i];
//		
//		System.out.println(sum/10.0F);


		
				
//	Q. WAP to accept 7 boolean values from the user and count total no of false values.
		
//		int count=0;
//		boolean value[] = new boolean[7];
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter the 7 Boolean values");
//		for(int i=0; i<value.length; i++) {
//			value[i]=sc.nextBoolean();
//		}
//		
//		System.out.println("Total false values");
//		for(int i=0; i<value.length; i++) {
//			if(value[i]==false)
//				count++;
//		}
//		System.out.println(count);
				
		
//	Q. WAP to accept marks of 6 subjects and count in how many subjects you 
//	   have scored more than 90.
		
//		int count=0;
//		int marks[]=new int[6];
//        Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter the 6 subjets marks");
//		for(int i=0; i<marks.length; i++) {
//			marks[i]=sc.nextInt();
//		}
//		System.out.println("subject you have scored more than 90.");
//		for(int i=0; i<marks.length; i++) {
//			if(marks[i]>90)
//				count++;
//		}
//		System.out.println(count);
				
				
//	Q. WAP to accept 10 symbols from the user and count only alphabets from it.
				
//		int count=0;
//		char[] symbol = new char[10];
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter the 10 Symbols");
//		for(int i=0; i<symbol.length; i++) {
//			symbol[i]=sc.next().charAt(0);
//		}
//		for(int i=0; i<symbol.length; i++) {
//			if(symbol[i]>='A' && symbol[i]<='Z' || symbol[i]>='a' && symbol[i]<='z')
//				count++;
//		}
//		System.out.println(count);
		
		
		
//	Q. WAP to accept password from the user (character by character) and print 
//	   all digits from it.
		
//		char[] password = new char[10];
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the password : ");
//		
//		for(int i=0; i<password.length; i++) {
//			password[i]=sc.next().charAt(0);
//		}
//		for(int i=0; i<password.length; i++) {
//			if(password[i]>='0' && password[i]<='9' )
//			System.out.print(password[i]);			
//		}
		
//	Q. WAP to accept 5 numbers from the user and print all 3 digit numbers from it.

//		int[] num = new int[5];
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the 5 Nubers: ");
//		
//		for(int i=0; i<num.length; i++) {
//			num[i]=sc.nextInt();
//		}
//		System.out.println("3 digit numbers: ");
//		for(int i=0; i<num.length; i++) {
//			if(num[i]> 99 && num[i]< 1000)
//				System.out.println(num[i]);			
//		}
		
		
//	Q. WAP to accept 10 numbers from the user and print alternate numbers from it.

//		Scanner sc = new Scanner(System.in);
//        int[] numbers = new int[10];
//
//        System.out.println("Enter 10 numbers:");
//        for (int i = 0; i < 10; i++) {
//            numbers[i] = sc.nextInt();
//        }
//
//        // Print alternate numbers
//        System.out.println("Alternate numbers are:");
//        for (int i = 0; i < 10; i += 2) {
//            System.out.print(numbers[i] + " ");
//        }
		
		
		
//	Q. WAP to accept 5 fruit names from the user and print them in reverse order.

//		Scanner sc = new Scanner(System.in);
//        String[] name = new String[5];
//
//        System.out.println("Enter 5 Fruits:");
//        for (int i = 0; i <name.length; i++) {
//            name[i] = sc.next();
//        }
//        System.out.println("Reverse order:");
//        for (int i=name.length-1; i>=0; i--) {
//        	System.out.print(name[i]+" ");
//        }		
		
		
		
//	Q. WAP to accept 10 boolean values from the user and perform ANDing on all.

//        Scanner sc = new Scanner(System.in);
//        boolean[] values = new boolean[10];
//
//        System.out.println("Enter 10 boolean values (true/false):");
//        for (int i = 0; i < 10; i++) {
//            values[i] = sc.nextBoolean();
//        }
//
//        // Perform AND operation on all values
//        boolean result = true; // start with true
//        for (int i = 0; i < 10; i++) {
//            result = result && values[i]; // AND with each value
//        }
//
//        System.out.println("Result after ANDing all values: " + result);
		
		
		
		
		
//	Q. WAP to accept 20 symbols from the user and print no of alphabets, 
//	   no of digits and no of special symbols.		
        
//        Scanner sc = new Scanner(System.in);
//        char[] symbols = new char[20];
//
//        int alphabets = 0, digits = 0, specials = 0;
//
//        System.out.println("Enter 20 symbols (characters):");
//        for (int i = 0; i < 20; i++) {
//            symbols[i] = sc.next().charAt(0); // take one character input
//        }
//
//        // check each character
//        for (int i = 0; i < 20; i++) {
//            char ch = symbols[i];
//
//            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
//                alphabets++;
//            } else if (ch >= '0' && ch <= '9') {
//                digits++;
//            } else {
//                specials++;
//            }
//        }
//        // print results
//        System.out.println("Number of Alphabets: " + alphabets);
//        System.out.println("Number of Digits: " + digits);
//        System.out.println("Number of Special Symbols: " + specials);
	
		
		sc.close();
	}

}
