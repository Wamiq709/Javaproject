package javaselenium;

public class Loop430 {

	public static void main(String[] args) {
		/*int count;
		for(count = 0; count < 5; count = count+1) 
			System.out.println("This is count: " + count);
		System.out.println("Done!");
		*/
		
		/*double x, y, z;
		x = 3;
		y = 4;
		z = Math.sqrt(x*x + y*y); System.out.println("Hypotenuse is " +z);
		*/
		
		/*int x; // known to all code within main
		x = 10;
		if(x == 10) 
		{ // start new scope
			int y = 20; // known only to this block
		// x and y both known here.
		System.out.println("x and y: " + x + " " + y);
		x = y * 2;
		}

		 //y = 100; // Error! y not known here

		// x is still known here. 
		System.out.println("x is " + x);
		*/
		
		for(int x = 0; x < 3; x++) {

			int y = -1; // y is initialized each time block is entered prints -1
		 
			System.out.println("y is: " + y); // this always

			y = 100;
			System.out.println("y is now: " + y);

			}
	}
}


