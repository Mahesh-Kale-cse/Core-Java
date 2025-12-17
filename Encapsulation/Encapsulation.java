package Encapsulation;

public class Encapsulation {
	
	private String name;
	private int rollNo;
	private double grade;
	private String gender;
	
//-----------------------------------------------------------	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
//-----------------------------------------------------------	
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo=rollNo;
	}
//-----------------------------------------------------------	
	
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade=grade;
	}
//-----------------------------------------------------------	
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}

//-----------------------------------------------------------		
	
	public void showdata() {
		System.out.println("Name : "+name);
		System.out.println("RollNo : "+rollNo);
		System.out.println("Class : "+grade);
		System.out.println("Gender : "+gender);
	}
	
	
//	Problem-1 : 
//	Explain why using private variables and public getters/setters is considered good 
//	practice in Java.
	
//	Problem-2 : 
//	Explain what would happen if variables in a class are public instead of private. 
//	Give an example


}
