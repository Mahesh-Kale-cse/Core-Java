package Scanner;
import java.util.Scanner;
public class Home {
	
    public static void main(String[] args) {
        
        // Create Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // 1️⃣ Read a string (name)
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Your name: " + name);

        // 2️⃣ Read a long (number)
        System.out.print("Enter your number: ");
        long phoneNumber = scanner.nextLong();
        System.out.println("Your number: " + phoneNumber);

        // 3️⃣ Read a boolean value (true/false)
        System.out.print("Enter a boolean (true/false): ");
        boolean isActive = scanner.nextBoolean();
        System.out.println("Your boolean: " + isActive);

        // 4️⃣ Read a single character
        System.out.print("Enter a single character: ");
        char character = scanner.next().charAt(0);
        System.out.println("Your character: " + character);

        // 5️⃣ Read a double (decimal number)
        System.out.print("Enter a double value: ");
        double decimalValue = scanner.nextDouble();
        System.out.println("Your double: " + decimalValue);

		scanner.close();
    }
}    
    
    
