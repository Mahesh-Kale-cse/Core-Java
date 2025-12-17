package JavaBasics;

public class Method {
	
//  1. WAM to print Hi on the console.
	
	public void show() {
		System.out.println("Hi!");
		
	}
	
//------------------------------------------------------------------------------------------------------	

//  2. WAM to Addition, Subtraction, Multiplication, Division of Two numbers on the Screen.

	public void add(int a, int b) {
		System.out.println(a+b);
		
	}
	public void sub(int a, int b) {
		System.out.println(a-b);
		
	}
	public void mul(int a, int b) {
		System.out.println(a*b);
		
	}
	public void div(int a, int b) {
		System.out.println(a/b);
		
	}

//------------------------------------------------------------------------------------------------------	

//  3. WAM to Calculate factorial of number.

	public void factorial(int n) {
		int factorial=1;
		for(int i=2; i<=n; i++) {
			factorial*=i;
		}
		System.out.println(factorial);
		
	}

//------------------------------------------------------------------------------------------------------	
	
//  4. WAM to Display reverse of number.
	
	public void reverse(int number) {
		do{
			System.out.print(number%10);
			number/=10;		
		}while(number!=0); 

		System.out.println();
	}

//------------------------------------------------------------------------------------------------------	

//  5. WAM to Find and Print AND Operation of Two Boolean Values.

	public void operation(boolean a, boolean b) {
		boolean result=a && b;
		System.out.println(result);
	}
	
//------------------------------------------------------------------------------------------------------	

//  6. WAM to find cube of number.
	
	public void aditya(int n) {
		System.out.println(n * n * n);
	}
	
	
//------------------------------------------------------------------------------------------------------	

//  7. WAM to check whether the number is zero or even or odd.
	
	public void milind(int n) {
		if(n == 0)
			System.out.println("n is zero!");
		else if(n%2 == 0)
			System.out.println(n + " is even.");
		else
			System.out.println(n + " is odd.");
	}

//------------------------------------------------------------------------------------------------------	

//  8. WAM to Print a number from a to b.

	public void astha(int a, int b) {
		
		for (int i = a; i <= b; i++) {
			System.out.println(i);
		}
		
	}

//------------------------------------------------------------------------------------------------------	

//	9. WAM with name sakshi which accepts a character and print its ASCII value.
	
    public void sakshi(char ch) {
    	int asciiValue=ch;
    	System.out.println("The ASCII value of '" + ch + "' is " + asciiValue + ".");
    }

	
//------------------------------------------------------------------------------------------------------	

//  10. WAM with name pratiksha which accepts 3 numbers and prints minimum of them.
    
    public void pratiksha(int a, int b, int c) {
    	if(a<b && a<c) {
    		System.out.println(a+" is a minimum number");
    	}else if(b<a && b<c) {
    		System.out.println(b+" is a minimum number");   		
    	}else {
    		System.out.println(c+" is a minimum number");    		
    	}
    }
    
//------------------------------------------------------------------------------------------------------	

//  11. WAM with name abhishek which accepts 3 numbers and prints maximum of them.
    
    public void abhishek(int a, int b, int c) {
  
    	if(a>b && a>c) {
    		System.out.println(a+" is a maximum number");
    	}else if(b>a && b>c) {
    		System.out.println(b+" is a maximum number");   		
    	}else {
    	    System.out.println(c+" is a maximum number");    		
    	} 	
    }
    
//------------------------------------------------------------------------------------------------------	

//  12. WAM with name sanket which accepts PIN and prints login success or failed.
    
    public void sanket(int pin) {
    	  
		  if(12345 == pin) {
			 System.out.println("login successful !");
		  }else {
			 System.out.println("login failed ?");			
		  }
    }
    
//------------------------------------------------------------------------------------------------------	

//  13. WAM with name Mangesh which accepts a Boolean value and checks if it true or false.
    
    public void mangesh(boolean value) {
    	if(value == true) {
    		System.out.println("vaule is true");			    		
    	}else {
    		System.out.println("vaule is false");			    		    		
    	}
    }
    
//------------------------------------------------------------------------------------------------------	

//  14. WAM with name Aniket which accepts a name and greets him/her Welcome.
    
    public void Aniket(String name) {
    	if (name != null && !name.isEmpty()) {
            System.out.println("Welcome, " + name + "!");
        } else {
            System.out.println("Welcome!");
        }			    		    		
    	
    }
    
//------------------------------------------------------------------------------------------------------	

//  15. WAM with name vishal which accepts a number and checks if it is prime or not.
	
    
    public void vishal(int n) {

		boolean divisible = false;
		
		for (int i = 2; i < n; i++) {
			
			if(n%i == 0)
			{
				divisible = true;
				break;
			}
		}
		if(divisible)
			System.out.println(n + " is not prime");
		else
			System.out.println(n + " is prime");
    }

//------------------------------------------------------------------------------------------------------	
        
//  For example:
    
     public String Raj(int num) {
    		
    		if(num == 0)
    			return "Zero";
    		else if(num > 0)
    			return "Positive";
    		else
    			return "Negative";
    		
    	}
  
//------------------------------------------------------------------------------------------------------	
          
     public boolean aniket(int n) {
 		if(n%2 == 0)
 			return true;
 		else
 			return false;
 	}


//------------------------------------------------------------------------------------------------------	
    
//    A. Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and 
//       a boolean indicating if we are on vacation, print a string of the form "7:00" 
//       indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00" and 
//       on the weekend it should be "10:00". Unless we are on vacation -- then on weekdays 
//       it should be "10:00" and weekends it should be "off".
    		
//         For example:
//    		alarmClock(1, false) → "7:00"
//    		alarmClock(5, false) → "7:00"
//    		alarmClock(0, false) → "10:00"

	public void Mahesh(int day, boolean isVacation) {
        String dayName = "";
        String alarm = "";

        // Get day name
        switch(day) {
            case 0: dayName = "Sunday"; break;
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            default:
                System.out.println("Invalid Day");
                return;
        }

        // Decide alarm time
        if (isVacation) {
            if (day >= 1 && day <= 5) {
                alarm = "10:00";
            } else {
                alarm = "off";
            }
            System.out.println(dayName);
            System.out.println("You are on vacation → " + alarm);
        } else {
            if (day >= 1 && day <= 5) {
                alarm = "7:00";
            } else {
                alarm = "10:00";
            }
            System.out.println(dayName);
            System.out.println("You are not on vacation → " + alarm);
        }
    }

//------------------------------------------------------------------------------------------------------	
                
    
//    B. We are having a party with amounts of tea and candy. Print the int outcome of the party 
//	     encoded as 0=bad, 1=good, or 2=great. A party is good (1) if both tea and candy are 
//	     at least 5. However, if either tea or candy is at least double the amount of the other one, 
//		 the party is great (2). However, in all cases, if either tea or candy is less than 5, 
//		 the party is always bad (0).
	
//    	 For example:
//    		teaParty(6, 8) → 1
//    		teaParty(3, 8) → 0
//    		teaParty(20, 6) → 2
	
	
	public void teaParty(int tea, int candy) {
	    if (tea < 5 || candy < 5) {
	        System.out.println(0); 
	    } else if (tea >= 2 * candy || candy >= 2 * tea) {
	        System.out.println(2); 
	    } else {
	        System.out.println(1); 
	    }
	}

//-------------------------------OR-----------------------------------------------------------------------	
	 	
	
	public String teacandyParty(int tea, int candy) {
		if (tea < 5 || candy < 5) {
			return "0";
		} else if (tea >= 2 * candy || candy >= 2 * tea) {
			return "2";
		} else {
			return "1";
		}
	}
	
//-------------------------------OR-----------------------------------------------------------------------	
	
	public void soham(int tea,int candy) {
		String outcome="";
		
	    if (tea < 5 || candy < 5) {
	    	outcome = "0";
	    	System.out.println(outcome);
	        return ; 
	    } else if (tea >= 2 * candy || candy >= 2 * tea) {
	    	outcome = "2";
	    	System.out.println(outcome);
	        return ; 
	    } else {
	    	outcome = "1";
	    	System.out.println(outcome);
	        return ;// Good
	    }
		
	}
	
//------------------------------------------------------------------------------------------------------	
	     
//	1. WAM to return ASCII value of a character passed as a parameter.

	public int Mahadev(char ch) {
		int asciiValue=ch;
		return asciiValue;
	}

//------------------------------------------------------------------------------------------------------	
	 	
//	2. WAM to return average of 5 numbers passed as a parameter.

	public double Krishna(int a,int b,int c,int d,int e) {
		
       	int sum=a+b+c+d+e;
		double average=sum/5.0;
		return average;
	}

//------------------------------------------------------------------------------------------------------	
	 	
//	3. WAM to return true if the number passed as a parameter is 2 digit else return false.
	
	public boolean parth(int num) {
		if(num>=10 && num<=99)
 			return true;
 		else
 			return false;
	}	

//------------------------------------------------------------------------------------------------------	
	 	
//	4. WAM to return "Success" if the number passed as a parameter is 1234 else return "Failed".

	public String shyam(int number) {

		if(number == 1234) {
			return "Sucess";
		}else {
			return "Failed";			
		}
	}

//------------------------------------------------------------------------------------------------------	
	 	
//	5. WAM to return "Valid" if the number passed as a parameter is even as well as 2 digit. 
//	   Return "Invalid" otherwise.
	
	public String Ram(int number) {
		if(number%2 == 0 && number>=10 && number<=99) {
			return "Valid";
		}else {
			return "Invalid";
		}
	}
	
	
//------------------------------------------------------------------------------------------------------	
    
    public static void main(String args[]) {
		Method d=new Method();
		
		d.show();
		
		d.add(5, 6);
		d.sub(5, 6);
		d.mul(5, 6);
		d.div(5, 6);
		
		d.factorial(5);
		
		d.reverse(12345);
		
		d.operation(true,true);
		d.operation(true,false);
		d.operation(false, true);
		d.operation(false,false);
		
		d.aditya(3);
		
		d.milind(0);
		d.milind(4);
		d.milind(9);
		
		d.astha(5, 16);
		
		d.sakshi('s');
		d.sakshi('T');
		
		d.pratiksha(4, 7, 2);
		
		d.abhishek(6, 88, 10);
		
		d.sanket(12345);
		d.sanket(12364);
		
		d.mangesh(true);
		d.mangesh(false);
		
		d.Aniket("Mahesh");
		d.Aniket("Patil");
		
		d.vishal(6);
		d.vishal(13);
		
		d.Mahesh(1, false);  
	    d.Mahesh(0, false);  
	    d.Mahesh(0, true);   
	    d.Mahesh(4, true);   
	    d.Mahesh(7, false);  
	    	   	    
	    String Num = d.Raj(3);
	    System.out.println(Num);
	    
	    boolean Even = d.aniket(4);
	    System.out.println(Even);
	    
	    d.teaParty(6, 8);   
	    d.teaParty(3, 8);   
	    d.teaParty(20, 6);  
	    d.teaParty(10, 5);  
	    d.teaParty(5, 5);   
	    d.teaParty(4, 6);   
	    
	    String party = d.teacandyParty(4,7);
	    System.out.println(party);
	    
	    d.soham(3, 6);
	    d.soham(6, 8);   
	    d.soham(3, 8);   
	    d.soham(20, 6);  
	    d.soham(10, 5);  
	    d.soham(5, 5);  
	    d.soham(4, 6);   
	    
	    int asciiValue= d.Mahadev('f');
	    System.out.println(asciiValue);
	    
        double average= d.Krishna(1,2,3,4,5);
	    System.out.println(average);
	    
        boolean twodigit= d.parth(45);
	    System.out.println(twodigit);
	    
        String check= d.shyam(1234);
	    System.out.println(check);
  
	    String checking= d.Ram(60);
	    System.out.println(checking);
	    
  
  


	    
	}

}
