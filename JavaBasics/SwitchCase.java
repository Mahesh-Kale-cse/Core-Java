package JavaBasics;

public class SwitchCase {
	public static void main(String args[]) {
		
//		1. Day of the Week Write a program that takes an integer (1–7) as input and prints the
//		corresponding day of the week using a switch-case. If the number is not between 1 and 7, print
//		'Invalid Day'.
		
		int day=6;
		
		switch(day) {
		case 1:System.out.println("Monday");break;
		case 2:System.out.println("Tuesday");break;
		case 3:System.out.println("Wednesday");break;
		case 4:System.out.println("Thursday");break;
		case 5:System.out.println("Friday");break;
		case 6:System.out.println("Saturday");break;
		case 7:System.out.println("Sunday");break;
		default :System.out.println("Invalid Day");
		}
//	    ------------------------------------------------------------------------------------------------------	
		
//		2. Calculator Create a program that takes two integers and a character as input (+, -, *, /). Use
//		switch-case to perform the corresponding arithmetic operation and print the result.
		
		int a=5, b=6;
		char op='*';
		
		switch(op) {
		case '+':System.out.println(a+b);break;
		case '-':System.out.println(a-b);break;
		case '*':System.out.println(a*b);break;
		case '/':System.out.println(a/b);break;
		default:System.out.println("Invalid opration");
		}
		
//	    ------------------------------------------------------------------------------------------------------	
	
//		3. Vowel or Consonant Take a character as input and use a switch-case to check whether it is a
//		vowel (a, e, i, o, u) or a consonant. Print the result.

		char ch='e';
		
		switch(ch) {
		case 'a':case 'e':case'i':case'o':case'u':
		case 'A':case 'E':case'I':case'O':case'U':
        System.out.println("Vowels");
        break;
        default:System.out.print("Consonant");
		}
		
//	    ------------------------------------------------------------------------------------------------------	

//		4. Month Name Write a program that takes a number (1–12) and prints the name of the
//		corresponding month using a switch-case. If the number is outside this range, print 'Invalid Month'.

		
		int MonthNumber=3;
		
		switch(MonthNumber) {
		case 1:System.out.println("jan");break;
		case 2:System.out.println("Feb");break;
		case 3:System.out.println("Mar");break;
		case 4:System.out.println("Apr");break;
		case 5:System.out.println("May");break;
		case 6:System.out.println("Jun");break;
		case 7:System.out.println("Jul");break;
		case 8:System.out.println("Aug");break;
		case 9:System.out.println("Sep");break;
		case 10:System.out.println("Oct");break;
		case 11:System.out.println("Nov");break;
		case 12:System.out.println("Dec");break;
		default:System.out.println("Invalid Month");
		}
		
//	    ------------------------------------------------------------------------------------------------------	

//		5. Grade System Accept a character as input representing grades (A, B, C, D, F). Use switch-case
//		to display a remark (e.g., A → Excellent, B → Good, C → Average, D → Poor, F → Fail).

		char Grade='C';
		
		switch(Grade) {
		case 'A':System.out.println("Excellent");break;
		case 'B':System.out.println("Good");break;
		case 'C':System.out.println("Average");break;
		case 'D':System.out.println("Poor");break;
		case 'F':System.out.println("Fail");break;
		default:System.out.println("Invalid Grade");
		}
		
//	    ------------------------------------------------------------------------------------------------------	

//		6. Traffic Light Accept a string (Red, Yellow, Green) as input. Use switch-case to print the action to
//		take: Red → Stop, Yellow → Get Ready, Green → Go.
		
		String color="Green";
		
		switch(color) {
		case "Red":System.out.println("Stop");break;
		case "Yellow":System.out.println("Get Ready");break;
		case "Green":System.out.println("Go");break;
		default:System.out.println("INvalid color");
		}

//	    ------------------------------------------------------------------------------------------------------	

//		7. Menu Driven Program Display a menu with options: 1. Area of Circle 2. Area of Square 3. Area of
//		Rectangle Use switch-case to perform the selected operation. Use if-else if needed for input
//		validation.
		
		int choice = 1;
		double radius = 5, side = 4, length = 6, breadth = 3;
		switch(choice) {
		case 1: System.out.println("Area of Circle = " + (3.14 * radius * radius)); break;
		case 2: System.out.println("Area of Square = " + (side * side)); break;
		case 3: System.out.println("Area of Rectangle = " + (length * breadth)); break;
		default: System.out.println("Invalid Choice");
		}
		
//	    ------------------------------------------------------------------------------------------------------	

//		8. Season Finder Take a month number (1–12) as input and use switch-case to print the season: -
//		Dec–Feb → Winter - Mar–May → Summer - Jun–Aug → Rainy - Sep–Nov → Autumn
		
		int Season=7;
		
		switch(Season) {
		case 12,1,2 :System.out.println("Winter");break;
		case 3,4,5 :System.out.println("Summer");break;
		case 6,7,8 :System.out.println("Rainy");break;
		case 9,10,11 :System.out.println("Autumn");break;
		default :System.out.println("Invalid Month");
		}
		
//	    ------------------------------------------------------------------------------------------------------	

//		9. Number in Words Take a digit (0–9) as input and use switch-case to print its word representation
//		(0 → Zero, 1 → One, etc.).
		
		int Words=2;
		
		switch(Words) {
		case 0:System.out.println("Zero");break;
		case 1:System.out.println("One");break;
		case 2:System.out.println("Two");break;
		case 3:System.out.println("Three");break;
		case 4:System.out.println("Four");break;
		case 5:System.out.println("Five");break;
		case 6:System.out.println("Six");break;
		case 7:System.out.println("Seven");break;
		case 8:System.out.println("Eight");break;
		case 9:System.out.println("Nine");break;
		default:System.out.println("Invallid Number");
		}
		
//	    ------------------------------------------------------------------------------------------------------	

//		10. Even/Odd using Switch Accept an integer as input. Use if-else to check whether it is even or
//		odd, and then use a switch-case to print: Case 0 → 'Even', Case 1 → 'Odd'.
		
		int num=8;
		int check=num%2;
		
		switch(check) {
		case 0:System.out.println("Even");break;
		case 1:System.out.println("Odd");break;
		}

//	    ------------------------------------------------------------------------------------------------------	




		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
