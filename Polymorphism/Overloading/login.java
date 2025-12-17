package Polymorphism.Overloading;

public class login {
	
//	login(String username, String password)
//	login(String emailID)
//	login(long phone, String OTP)

	
	String username;
	String password;
	
	public login(String username, String password) {
		this.username=username;
		this.password=password;
	}
	
	String emailId;
	
	public login(String emailId) {
		this.emailId=emailId;
	}
	
	long phone;
	String OTP;
	
	public login(long phone, String OTP) {
		this.phone=phone;
		this.OTP=OTP;
	}
	
	
	public static void main(String args[]) {
		
		login l1 = new login("mahesh","mahesh123");
		
		System.out.println("Username : "+l1.username+", Password : "+l1.password);
		
		login l2 = new login("mahesh@gmail.com");
		
		System.out.println("Email Id : "+l2.emailId);
		
		login l3 = new login(934285255,"46367");
		
		System.out.println("Phone : "+l3.phone+", OTP : "+l3.OTP);
	}
	

}
