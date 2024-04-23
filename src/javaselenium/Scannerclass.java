package javaselenium;
import java.util.Scanner;
public class Scannerclass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter username and age :-");

	    String userName = input.nextLine();  // Read user input
	    int age = input.nextInt();
	    System.out.println("Username is: " + userName);
	    System.out.println("Age is: " + age);
	    

	}

}
