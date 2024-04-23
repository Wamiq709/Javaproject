package javaselenium;

public class Switch {

	public static void main(String[] args) {
			/*
			 * int i; for (i = 0; i < 10; i++) switch (i) { case 0:
			 * 
			 * System.out.println("i is zero"); break; case 1:
			 * 
			 * System.out.println("i is one"); break; case 2:
			 * 
			 * System.out.println("i is two"); break; case 3:
			 * 
			 * System.out.println("i is three"); break; case 4:
			 * 
			 * System.out.println("i is four"); break; default:
			 * 
			 * System.out.println("i is five or more");
			 * 
			 * }
			 */
			/*throws java.io.IOException {

		char choice;
		System.out.println("Help on:");
		System.out.println(" 1. if");
		System.out.println(" 2. switch");
		System.out.print("Choose one: ");
		choice = (char) System.in.read();
		System.out.println("\n");
		switch (choice) {
		case '1':  //accepting char value ,thats y using in 1 in ''

			System.out.println("The if:\n");
			System.out.println("if(condition) statement;");
			System.out.println("else statement;");
			break;
		case '2':
			System.out.println("The switch:\n");
			System.out.println("switch(expression) {");
			System.out.println(" case constant:");
			System.out.println(" statement sequence");
			System.out.println(" break;");
			System.out.println(" // ...");
			System.out.println("}");
			break;
		default:

			System.out.print("Selection not found.");

		}
		*/
	    char choice = '1';
		switch(choice) {
		case '1':
		System.out.println("The if:\n");
		System.out.println("if(condition) statement;"); 
		System.out.println("else statement;");
		break;
		
		case '2':
		System.out.println("The switch:\n"); 
		System.out.println("switch(expression) {");
		System.out.println(" case constant:"); 
		System.out.println(" statement sequence");
		System.out.println(" break;"); System.out.println(" // ...");
		System.out.println("}");
		break;
		
		case '3':
		System.out.println("The for:\n"); 
		System.out.print("for(init; condition; iteration)");
		System.out.println(" statement;");
		break;
		
		case '4':
		System.out.println("The while:\n");
		System.out.println("while(condition) statement;");
		break;
		
		case '5':
		System.out.println("The do-while:\n"); 
		System.out.println("do {"); System.out.println(" statement;");
		System.out.println("} while (condition);");
		break;
		//default:
			//System.out.println("case is not matching");
		}
		System.out.println("case is not matching");  //if not used default,then print statement outside switch will execute 
	}
}
