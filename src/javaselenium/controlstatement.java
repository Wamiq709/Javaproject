package javaselenium;

public class controlstatement {

	public static void main(String[] args)
			/*
			 * int i=10,j=10,a,b=20,k=120,c=33,d=20; if(i == 10) {
			 * 
			 * if(j < 20) a = b; if(k > 100) c = d; else a = c; // this else refers to if(k
			 * > 100)
			 * 
			 * }
			 * 
			 * else a = d; // this else refers to if(i == 10) System.out.println();
			 */
			throws java.io.IOException {
		char ch, answer = 'K';

		System.out.println("I'm thinking of a letter between A and Z.");
		System.out.print("Can you guess it: ");

		ch = (char) System.in.read(); // get a char

		if (ch == answer)
			System.out.println("** Right **");
		else {
			System.out.print("...Sorry, you're ");

			// a nested if

			if (ch < answer)
				System.out.println("too low");
			else
				System.out.println("too high");
		}

	}
}
