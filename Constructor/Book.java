package Constructor;

public class Book {
//	5. Create a class Book with variables title, author, and price. Add a method displayBook() 
//	to show all details. In main(), create 3 book objects and display their information.

	String title;
	String author;
	double price;
	
	public Book(String title,String author,double price) {
		this.title=title;
		this.author=author;
		this.price=price;
	}
	void displayBook(){
		System.out.println("Title : "+title);
		System.out.println("Author : "+author);
		System.out.println("Price : "+price);
	}
	
	public static void main(String args[]) {
		Book data = new Book("Ravan","Sharad tandale",500);
		data.displayBook();
	}
	
}
