package JavaBasics;

public class Loops {
	
	public static void main(String args[]) {
		
//	For Example.
		
		for(int i = 1; i <= 5; i++)
		{
			System.out.println("Hello!");
		}
		
		System.out.println("Outside!");

//------------------------------------------------------------------------------------------------------	
        
		
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(i);
		}
		
		System.out.println("Outside!");
		
//------------------------------------------------------------------------------------------------------	

		for(int i = 68; i <= 72; i++)
		{
			System.out.println(i);
		}

//------------------------------------------------------------------------------------------------------	
	
		for(int i = 8; i <= 80; i+=8)
		{
			System.out.println(i);
		}

		
//------------------------------------------------------------------------------------------------------
		
		for(char i = 'A'; i <= 'Z'; i++)
		{
			System.out.print(i + " ");
		}

		
//------------------------------------------------------------------------------------------------------	

		for(int i = 10; i >= 1; i--)
		{
			System.out.println(i);
		}

//------------------------------------------------------------------------------------------------------	

		for(int i = 1; i <= 10; i++)
		{
			if(i == 5)
			{
				System.out.println(i);
			}
		}

//------------------------------------------------------------------------------------------------------	

		for(int i = 1; i <= 10; i++)
		{
			if(i%2 == 0)
			{
				System.out.println(i);
			}
		}

//------------------------------------------------------------------------------------------------------	

		for(int i = 1; i <= 10; i++)
		{
			if(i >= 4)
			{
				System.out.println(i);
			}
		}

//------------------------------------------------------------------------------------------------------	

		for(int i = 1; i <= 10; i++)
		{
			if(i%4 == 0)
			{
				System.out.println(i + " is completely divisible by 4");
			}
			else
			{
				System.out.println(i + " is NOT completely divisible by 4");
			}
		}

//------------------------------------------------------------------------------------------------------	

//	1. WAP to print table of the number.
		
		
//		int num=5;
//		
//		for(int i=1; i<=10; i++) {
//			System.out.println(i*num);
//		}
//		
//		
//		for(int i = 3; i <= 30; i+=3){
//			System.out.println(i);
//		}

//------------------------------------------------------------------------------------------------------	


//	2. WAP to add all the numbers between 20 to 25.
		
	
//		int sum = 0;
//		
//		for(int i=20; i<=25; i++) {
//			sum=sum+i;
//		}
//		System.out.print(sum);
			
//------------------------------------------------------------------------------------------------------	

//  3. WAP to find average of all the numbers between 35 to 39.
		
//		int sum=0;
//		int count=0;
//		
//		for(int i=35; i<=39; i++) {
//			sum=sum+i;
//			count++;
//		}
//		System.out.print(sum / count);
		
//------------------------------------------------------------------------------------------------------	
		
//	4. Write a Java program using a for loop and if-else to print whether numbers 
//		from 1 to 20 are even or odd.
        
		
//		for(int i=1; i<=20; i++) {
//			if(i%2==0) {
//				System.out.println("Number is Even");
//			}else {
//				System.out.println("Number is Odd");
//				
//			}
//		}
		
//------------------------------------------------------------------------------------------------------	
		
//	5. Write a program to print numbers from 1 to 50. If a number is divisible by 3, 
//		print 'Fizz', if divisible by 5 print 'Buzz', otherwise print the number itself.
        
	
//		for(int i=1; i<=50; i++) {
//			if(i%3==0) {
//				System.out.println("Fizz");
//				
//			}else {
//				if(i%5==0) {
//					System.out.println("Buzz");
//				}else {
//					System.out.println(i);
//				}
//			}
//		}

//------------------------------------------------------------------------------------------------------	

//	6. Write a Java program that prints all prime numbers between 1 and 100 using a 
//		for loop and if-else conditions.
		
//		System.out.println("Prime numbers between 1 and 100:");
//		for(int n=1; n<=100; n++) {
//			boolean prime=true;
//			
//			for(int i=2; i<n; i++) {
//				if(n%i==0) {
//					prime=false;
//					break;
//				}
//			}
//			if(prime) {
//				System.out.print(n+" ");
//			}
			
//------------------------------------------------------------------------------------------------------	
		
		
//	7. Write a program to calculate the factorial of a number using a for loop. 
//		Use if-else to handle the case when the number is 0 or 1.
        
//		long stores large integer values. and we can also used int or long 
		
		
//		int number=5;
////	    long factorial=1; 
//		int factorial=1;
//		
//		if(number<0) {
//			System.out.println("Factorial is not defined for negative numbers.");
//		}else if(number==0 || number==1) {
//			System.out.println("The factorial is 1");
//		}else {
//			for(int i=2; i<=number; i++) {
//				factorial *=i;
//			}
//			System.out.println("The factorial of "+number+" is "+factorial);
//		}
		
//	 --------------------------------- OR ----------------------------------------------------
		
//		int number=5;
////    long factorial=1; 
//	    int factorial=1;
//		for(int i=2; i<=number; i++) {
//			factorial *=i;
//		}
//		System.out.println("The factorial of "+number+" is "+factorial);
		
		
//------------------------------------------------------------------------------------------------------	
		
//	8. Write a Java program to print the sum of even numbers and odd numbers separately 
//		between 1 to 100 using for loop and if-else.
		
//		int even=0;
//		int odd=0;
//		for(int i=1; i<=100; i++) {
//			
//			if(i%2==0) {
//				even=even+i;
////		        even+=i;
//				
//			}else {
//				odd=odd+i;
//			}
//		}
//		
//		System.out.println("sum of even numbers between 1 to 100 is "+even);
//		System.out.println("sum of odd numbers between 1 to 100 is "+odd);
		
//------------------------------------------------------------------------------------------------------	

//	9. Write a program that prints all numbers from 1 to 30, but if the number is divisible by 
//		both 3 and 5, print 'HelloWorld', if only by 3 print 'Hello', if only by 5 print 'World'.
        
//		for(int i=1; i<=30; i++) {
//			if(i%3==0 && i%5==0) {
//				System.out.println("HelloWorld");
//			}else if(i%3==0) {
//				System.out.println("Hello");
//			}else if(i%5==0){
//				System.out.println("World");
//			}else {
//				System.out.println(i);
//			}
//		}
        
//------------------------------------------------------------------------------------------------------	
		
//	10. Write a program using for loop and if-else to count how many numbers 
//		between 1 and 200 are divisible by 7.
        
//		int count=0;
//		for(int i=1; i<=200; i++) {
//			if(i%7==0) {
//				count++;
//			}
//		}
//		System.out.println("Total numbers divisible by 7 between 1 and 200: "+count);
	
		
//------------------------------------------------------------------------------------------------------	

		
//	11. Write a program to reverse the digits of a given number using for loop and if-else conditions.
        
//		for(int i=345; i!=0; i/=10) {
//			System.out.print(i%10);		
//			}
		
		
//------------------------------------------------------------------------------------------------------	

//	12. Write a Java program that prints the multiplication table of a number using a for loop. 
//		Use if-else to skip printing multiples of 5.
		
//		int num=6;
//		for(int i=1; i<=10; i++) {
//			int result=i*num;
//			if(result%5==0) {
//				continue;
//			}else {
//				System.out.println(result);
//			}
//		}
		
//------------------------------------------------------------------------------------------------------	

//	13. Write a program that prints all numbers from 1 to 100. Use if-else to print 'Even Square' 
//		if the square of the number is even, and 'Odd Square' if the square is odd.

		
//		for (int i = 1; i <= 100; i++) {
//		    int square = i * i;
//		    if (square % 2 == 0) {
//		        System.out.println(i + "^2 = " + square + " => Even Square");
//		    } else {
//		        System.out.println(i + "^2 = " + square + " => Odd Square");
//		    }
//		}
		
//------------------------------------------------------------------------------------------------------	

//	14. WAP to add all the digits of a number.
				
//		int number=12345;
//		int sum=0;
//		
//		while(number>0) {
//			int digit=number%10;       // get last digit
//			sum+=digit;                // add digit to sum
//			number/=10;                //  remove last digit
//		}
//		System.out.println(sum);
		
		
//------------------------------------------------------------------------------------------------------	

//	15. WAP to multiply all the digits of a number.
         
//		 int number=12345;
//		 int multiply=1;
//		 
//		 do {
//			 int digit=number%10;
//			 multiply*=digit;
//			 number/=10;
//			 
//		 }while(number>0);
//		 System.out.print(multiply);
		
//------------------------------------------------------------------------------------------------------	

//	16. WAP to find average of all digits of a number.
	          
//			 int number=12345;
//			 int count=0;
//			 int sum=0;
//			 
//			 do {
//				 int digit=number%10;
//				 sum+=digit;
//				 count++;
//				 number/=10;
//			 }while(number>0);
//			 System.out.println(sum/count);

			 
//------------------------------------------------------------------------------------------------------	

//	17. WAP to count the digits of a number.
			 
//			 int number=123456;
//			 int count=0;
//			 
//			 do {
//				 number/=10;
//				 count++;
//			 }while(number>0);
//	         System.out.println(count);
		
//------------------------------------------------------------------------------------------------------	

//	18. WAP to reverse a number. Use other loops.

//			 for(int i=10; i<=15; i++) {
//				 int n=i;
//				 while(n!=0) {
//					 System.out.print(n%10);
//					 n=n/10;
//				 }System.out.println();
//			 }
			
//	--------------------------------- OR ----------------------------------------------------

//			 for(int n = 381; n != 0; n = n / 10)
//				{
//					System.out.print(n % 10);
//				}
			 
//	--------------------------------- OR ----------------------------------------------------

//			 int n = 381;
//				
//				do {
//					System.out.print(n % 10);
//					n = n / 10;
//				}
//				while (n != 0);
				
//	--------------------------------- OR ----------------------------------------------------

//			int n = 381;
//				
//			while (n != 0) {
//				System.out.print(n % 10);
//				n = n / 10;
//			}
		
//------------------------------------------------------------------------------------------------------	

		
//	For Example
		
		
		
//		for (int i = 1; i <= 5; i++)
//		{
//			for (int j = 1; j <= 2; j++) {
//				
//				System.out.println(i + " " + j);
//			}
//		}
		
//------------------------------------------------------------------------------------------------------	
		
//		for (int i = 1; i <= 10; i++)
//		{
//			if(i == 5) {
//				break;
//			}
//			System.out.println(i);
//		}
		
//------------------------------------------------------------------------------------------------------	

//		for (int i = 1; i <= 10; i++)
//		{
//			System.out.println(i);
//			
//			if(i == 5) {
//				break;
//			}
		
//------------------------------------------------------------------------------------------------------	

//		for (int i = 1; i <= 10; i++)
//		{
//			if(i == 5) {
//				continue;
//			}
//			
//			System.out.println(i);
//		}
		

//------------------------------------------------------------------------------------------------------	

//		boolean flag = true;
//		
//		for (int i = 1; i <= 10; i++)
//		{
//			if(i == 25) {
//				flag = false;
//			}
//		}
//		
//		if(flag == true) {
//			System.out.println("Condition was not satisfied");
//		}
//		else {
//			System.out.println("Condition was satisfied");
//		}
		
		
//------------------------------------------------------------------------------------------------------	

//		int n = 7;
//		boolean divisible = false;
//		
//		for (int i = 2; i < n; i++) {
//			
//			if(n%i == 0)
//			{
//				divisible = true;
//				break;
//			}
//		}
//		if(divisible)
//			System.out.println(n + " is not prime");
//		else
//			System.out.println(n + " is prime");

//------------------------------------------------------------------------------------------------------	
	
		
	}
}
