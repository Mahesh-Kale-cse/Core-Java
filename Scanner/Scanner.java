package Scanner;

public class Scanner {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        System.out.println("You Entered : " + n);
        
		sc.close();
    }
}
