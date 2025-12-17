package JavaBasics;

public class IfElse {
	public static void main(String args[]) {
		
//	For Example.		
		
//		int num=5;
//		
//		if(num<10) {
//			System.out.print("inside if");
//		}
		
//	------------------------------------------------------------------------------------------------------	
		
//		int num=15;
//		
//		if(num>0) {
//			System.out.print("Grater than Zero!");
//		}else {
//			System.out.print("Less than Zero!");
//		}
		
//  ------------------------------------------------------------------------------------------------------			
		
//        int num=-15;
//		
//		if(num>0) {
//			System.out.print("Grater than Zero!");
//		}else {
//			System.out.print("Less than Zero!");
//		}

//	------------------------------------------------------------------------------------------------------	
		
//		int num=10;
//		
//		if(num == 1) {
//			System.out.print("First");
//		}else if(num ==2) {
//			System.out.print("Second");
//		}else if(num == 3) {
//			System.out.print("Three");
//		}else {
//			System.out.print("Invalid Number");
//		}
			
//	------------------------------------------------------------------------------------------------------	
		
//		char n='C';
//		
//		if(n == 'A') {
//			System.out.print("Letter is A");
//		}else if(n == 'B') {
//			System.out.print("Letter is B");
//		}else if(n == 'C') {
//			System.out.print("Letter is C");
//		}else {
//			System.out.print("Letter is Not Found");
//		}
		
//	------------------------------------------------------------------------------------------------------	
		
//		int num=10;
//		
//		if(num == 0) {
//			System.out.print("Number"+" "+num +" "+ "is Zero");
//		}else if(num%2 == 0){
//			System.out.print("Number"+" "+num +" "+ "is Even");
//		}else {
//			System.out.print("Number"+" "+num +" "+ "is Odd");
//		}
		
//	------------------------------------------------------------------------------------------------------	
		
//		int num=-10;
//		
//		if(num==0) {
//			System.out.print("Number is Zero");
//		}else if(num>0) {
//			System.out.print("Number is Positive");
//		}else {
//			System.out.print("Number is Negative");
//		}
		
//	------------------------------------------------------------------------------------------------------	
		
//		int num=95;
//		
////		if(num>=10 && num<=99) OR
//		
//		if(num>9 && num<100) {
//			System.out.print("Number is Two Digit");
//		}else{
//			System.out.print("Number is Not Two Digit");
//		}
		
//	------------------------------------------------------------------------------------------------------	
		
//		char ch='g';
//		
//		if(ch>='A' && ch<='Z') {
//			System.out.print("Upper Case Alphabet");
//		}else if(ch>='a' && ch<='z') {
//			System.out.print("Lower Case Alphabet");
//		}else {
//			System.out.print("Not Alphabet");
//		}
		
		
//	------------------------------------------------------------------------------------------------------	
		
//	    char ch = 'E';
//	
//	    if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
//		   System.out.print("Vowel");
//	    }else {
//		   System.out.print("Consonent");
//	    }
		
//	------------------------------------------------------------------------------------------------------	
		
		
//       int password = 4444;
//		
//		if(password >= 1 && password <= 5000 && password%2 == 0)
//		{
//			System.out.println("Valid password");
//		}
//		else
//		{
//			System.out.println("Invalid password");
//		}

//	------------------------------------------------------------------------------------------------------	
		
		
//      char ch = 'B';
//		
//		if(ch >= 'A' && ch <= 'Z')
//		{
//			System.out.println("Upper case");
//		}
//		else if(ch >= 'a' && ch <= 'z')
//		{
//			System.out.println("Lower case");
//		}
//		else {
//			if(ch >= '0' && ch <= '9') {
//				System.out.println("Digit");
//			}
//			else {
//				System.out.println("Special symbol");
//			}
//		}

//	------------------------------------------------------------------------------------------------------	
		
		
//      int n = 0;
//		
//		if(n == 0) {
//			System.out.println("Zero!");
//		}
//		else {
//			
//			if(n > 0) {
//				System.out.println("+ve");
//			} else {
//				System.out.println("-ve");
//			}
//				 
//		}

//	------------------------------------------------------------------------------------------------------	

//	1. WAP to check the grade of student basis on the marks in percentage.
//		0 to 55 -> Pass class
//		56 to 59 -> Second class
//		60 to 74 -> First class
//		75 to 100 -> Distinction	
		
//        int mark=85;
//
//        if(mark>=0 && mark<=55) {
//        	System.out.print("Pass Class");
//        }else if(mark>=56 && mark<=59) {
//        	System.out.print("Second class");
//        }else if(mark>=60 && mark<=74) {
//        	System.out.print("First class");
//        }else if(mark>=75 && mark<=100){
//        	System.out.print("Distinction");
//        }else{
//		    System.out.print("Invalid marks");
//		  }
		
//	------------------------------------------------------------------------------------------------------	

// 2. WAP to check if the number is even or odd. If even, check if it is two digit or not. If odd, check if it above 50000 or not.
		
//		int number=111;
//		
//		if(number%2 ==0) {
//			if(number>=10 && number<=99) {
//				System.out.print("The Number is Even and Also Two Digit");
//			}else {
//				System.out.print("The Number is Even and Not Two Digit");
//			}
//		}else {
//			if(number>50000){
//				System.out.print("The is Odd and also above 50000");
//			}else {
//				System.out.print("The is Odd and Not above than 50000");
//			}
//		}
				
		
//	------------------------------------------------------------------------------------------------------	
		
// 3. WAP to find maximum between two numbers.
		

//		int a=100;
//		int b=150;
//		
//		if(a>b) {
//			System.out.print("The Maximum Number is :"+a);
//		}else {
//			System.out.println("The Maximum Number is :"+b);
//		}
		
		
//	------------------------------------------------------------------------------------------------------	
		
//	4. WAP to find maximum between three numbers.
	    
//		int num1=10;
//		int num2=15;
//		int num3=20;
//		
//		if(num1>=num2 && num1>=num3) {
//			System.out.print("The Maximum Number is "+num1);
//		}else {
//			if(num2>=num1 && num2>=num3) {
//				System.out.print("The Maximum Number is "+num2);
//			}else {
//				System.out.print("The Maximum Number is "+num3);
//			}
//		}
		
//	------------------------------------------------------------------------------------------------------	
		
//	5. WAP to check whether a number is divisible by 5 and 11 or not.
	
//	  int number=10;
//	  
//	  if(number%5==0 && number%11==0) {
//		  System.out.print("The Number is Divisible by 5 & 11");
//	  }else {
//		  System.out.print("The Number is not Divisible by 5 & 11");
//	  }
		
//	------------------------------------------------------------------------------------------------------	
		
//  6. WAP to input week number and print week day.
		
//		int WeekDay=4;
//		
//		if(WeekDay==1) {
//			System.out.print("Monday");
//		}else if(WeekDay==2) {
//			System.out.print("Tuesday");		
//	    }else if(WeekDay==3) {
//	    	System.out.print("Wednesday");
//        }else if(WeekDay==4) {
//	        System.out.print("Thursday");
//	    }else if(WeekDay==5) {
//	    	System.out.print("Friday");
//	    }else if(WeekDay==6) {
//	    	System.out.print("Saturday");
//	    }else if(WeekDay==7) {
//	    	System.out.print("Sunday");
//	    }else {
//	    	System.out.print("Invalid day");
//	    }
		
//	------------------------------------------------------------------------------------------------------	

//  7. WAP to input month number and print number of days in that month.

//        int MonthNumber=4;
//		
//        if (MonthNumber == 1) {
//            System.out.print("Number of days: 31");
//        } else if (MonthNumber == 2) {
//            System.out.print("Number of days: 28");
//        } else if (MonthNumber == 3) {
//            System.out.print("Number of days: 31");
//        } else if (MonthNumber == 4) {
//            System.out.print("Number of days: 30");
//        } else if (MonthNumber == 5) {
//            System.out.print("Number of days: 31");
//        } else if (MonthNumber == 6) {
//            System.out.print("Number of days: 30");
//        } else if (MonthNumber == 7) {
//            System.out.print("Number of days: 31");
//        } else if (MonthNumber == 8) {
//            System.out.print("Number of days: 31");
//        } else if (MonthNumber == 9) {
//            System.out.print("Number of days: 30");
//        } else if (MonthNumber == 10) {
//            System.out.print("Number of days: 31");
//        } else if (MonthNumber == 11) {
//            System.out.print("Number of days: 30");
//        } else if (MonthNumber == 12) {
//            System.out.print("Number of days: 31");
//        } else {
//            System.out.print("Invalid Month Number");
//        }
		
//    	------------------------------------------------------------------------------------------------------	

//   8. WAP to input angles of a triangle and check whether triangle is valid or not.
     
//	    int Angle1=30;
//	    int Angle2=60;
//		int Angle3=90;
//		
//		if((Angle1+Angle2+Angle3)==180 && Angle1>0 && Angle2>0 && Angle3>0) {
//			System.out.print("The Input Angles of a Triangle is Valid");	
//		}else {
//			System.out.print("The Input Angles of a Triangle is Not Valid");				
//		}
		
//    ------------------------------------------------------------------------------------------------------	
		
//   9. WAP to check whether the triangle is equilateral triangle or not.
		
		
//		int Angle1=30;
//	    int Angle2=60;
//		int Angle3=90;
//		
//		if( Angle1==60 && Angle2==60 && Angle3==60 ) {
//			System.out.print("The Triangle is equilateral triangle.");	
//		}else {
//			System.out.print("The Triangle is Not equilateral triangle.");				
//		}
		
////		✅ Correction:
////		An equilateral triangle is defined by all three sides being equal, not angles necessarily.
//		int side1 = 10;
//		int side2 = 10;
//		int side3 = 10;
//
//		if(side1 == side2 && side2 == side3) {
//		    System.out.println("Equilateral triangle");
//		} else {
//		    System.out.println("Not an equilateral triangle");
//		}

		
//	    ------------------------------------------------------------------------------------------------------	
 
//   10. WAP to input basic salary of an employee and calculate its Gross salary according to following:
//		        Basic Salary <= 10000 : HRA = 20%, DA = 80%
//				Basic Salary <= 20000 : HRA = 25%, DA = 90%
//				Basic Salary > 20000 : HRA = 30%, DA = 95%		
		
		double basicSalary = 15000; 
        double hra, da, grossSalary;

        if (basicSalary <= 10000) {
            hra = basicSalary * 0.20;
            da = basicSalary * 0.80;
        } else if (basicSalary <= 20000) {
            hra = basicSalary * 0.25;
            da = basicSalary * 0.90;
        } else {
            hra = basicSalary * 0.30;
            da = basicSalary * 0.95;
        }

        grossSalary = basicSalary + hra + da;

        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + grossSalary);
		
//	    ------------------------------------------------------------------------------------------------------	

		
//	 11. WAP to perform the selected operation on variable "a" and "b". 
//		The variable "operation" may have + or - or * or /. Any other value apart 
//		from these must give a message as "Invalid operation".

		int num1=4; 
		int num2=6;
		char opration='*';
		if(opration=='+') {
			System.out.println(num1 + "+" + num2 +"="+(num1+num2));
		}else if(opration=='-') {
			System.out.println(num1 + "-" + num2 +"="+(num1-num2));
		}else if(opration=='*') {
			System.out.println(num1 + "*" + num2 +"="+(num1*num2));
		}else if(opration=='/') {
			System.out.println(num1 + "/" + num2 +"="+(num1/num2));
		}else {
			System.out.println("Invalid opration");
		}
		
//	    ------------------------------------------------------------------------------------------------------	

//	 12. WAP to check if the 3 variables have their values in order or not. 
//		That means, three ints, a b c, are in order if b is greater than a and c is greater than b.
		
		int a=10;
		int b=15;
		int c=20;
		if(b>a && c>b) {
			System.out.println("Values in Order");
		}else {
			System.out.println("Values is Not in Order");
		}
	}

}

//------------------------------------------------------------------------------------------------------	

