package Encapsulation;

public class Person {
//	Create a class Person with private variables name and age . 
//	Provide public getter and setter methods for both variables.

	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}

}
