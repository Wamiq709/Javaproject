package javaselenium;

public class Ifelse {

	public static void main(String[] args) {
		// int x;
		/*
		 * for (int x = 0; x < 6; x++) { if (x == 1) System.out.println("x is one");
		 * else if (x == 2) System.out.println("x is two");
		 * 
		 * else if (x == 3)
		 * 
		 * System.out.println("x is three"); else if (x == 4)
		 * System.out.println("x is four");
		 * 
		 * else
		 * 
		 * System.out.println("x is not between 1 and 4");
		 * 
		 * }
		 */
		/*
		 * int result; for (int i = -5; i < 6; i++) { result = i != 0 ? 100 / i : 0;
		 * //if (i != 0) System.out.println("100 / " + i + " is " + result); }
		 */
		for (int i = -5; i < 6; i++) {
			//if (i != 0 ? true : false)
			 int result2 = (i !=0) ? 100/i : 0;
				//System.out.println("100 / " + i + " is " + 100 / i);
				System.out.println("100 / " + i + " is " + result2);
		}

	}
}
