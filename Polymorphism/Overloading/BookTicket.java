package Polymorphism.Overloading;

public class BookTicket {

//	bookTicket() -> books 1 ticket
//	bookTicket(int n) -> books n ticket
//	bookTicket(int n, String type) -> books n tickets of given category
	
	
    int num;
    String type;

    // Constructor 1: no arguments
    public BookTicket() {
        num = 1; // assume booking 1 ticket
        System.out.println("Booked 1 ticket.");
    }

    // Constructor 2: one argument
    public BookTicket(int n) {
        num = n;
        System.out.println("Booked " + n + " ticket(s).");
    }

    // Constructor 3: two arguments
    public BookTicket(int n, String type) {
        num = n;
        this.type = type;
        System.out.println("Booked " + n + " " + type + " ticket(s).");
    }

    public static void main(String args[]) {

        BookTicket b1 = new BookTicket();

        BookTicket b2 = new BookTicket(34);
        System.out.println("Book ticket number: " + b2.num);

        BookTicket b3 = new BookTicket(53, "Platinum");
        System.out.println("Book ticket number: " + b3.num + ", Ticket type: " + b3.type);
    }
}
