package Class_and_Object;

public class Book {
//	5. Create a class Book with variables title, author, and price. 
//	Add a method displayBook() to show all details. 
//	In main(), create 3 book objects and display their information.
	
	String title;
	String author;
	double price;
	
	void displayBook() {
		System.out.println("Book Title : "+title);
		System.out.println("Book Author : "+author);
		System.out.println("Book Price : "+price);
	}
	
	public static void main(String args[]) {
		Book books = new Book();
		
		books.title="Entrapranyor";
		books.author="Sharad Tandale";
		books.price=500;
		books.displayBook();
		
		books.title="Ravan";
		books.author="Sharad Tandale";
		books.price=400;
		books.displayBook();
		
		books.title="The Secret Hindu";
		books.author="Amit Gupta";
		books.price=1000;
		books.displayBook();
	}

}
