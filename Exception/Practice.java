package Exception;

public class Practice {
	
	public static void main(String args[]) {
		
		
		int num1,num2;
		try {
			num1=0;
			num2=50/num1;
			System.out.println("Try block message");
		}catch(ArithmeticException e){
			System.out.println("Error:Don't divide a number by Zero");
		}
		System.out.println("I'm out of try-catch block in java");
	
		
		
		int[]array = {1,2,4,3,6,2,7,9,9,5,4};
		try {
			System.out.println("The 10th value of Array is:"+array[10]);
		}catch(Exception e) {
			System.out.println("the Error:"+e);
		}
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
}
