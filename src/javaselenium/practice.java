package javaselenium;

public class practice {

	public static void main(String[] args) {
		/*double x=3;
		double y=4;
		double z =Math.sqrt(x*x+y*y);
		System.out.println("hypotenuse is "+z);
		*/
		
		/*int x; //known to all code within main
		x = 10;
		if(x == 10) {  // start new scope
		int y = 20;    // known only to this code, x and y both known here
		System.out.println("x and y: " + x + " " + y);
	    x = y * 2;
		}
		//y is not known out side this block,but x is known
		System.out.println("x is " + x);
		*/
		
		/*long L;double D;
		L=100123285L;
		
		D=L; // L=D is impossible
		
		System.out.println("L and D : "+ L + "  " + D);
		*/
		
		double x, y;
		byte b; int i; char ch; x = 10.0;
		y = 3.0;

		i = (int) (x / y); // cast double to int System.out.println("Integer outcome of x / y: " + i);
		i = 100;
		b = (byte) i;

		System.out.println("Value of b: " + b);
		i = 257;
		b = (byte) i;

		System.out.println("Value of b: " + b); 
		b = 88; // ASCII code for X
		ch = (char) b; 
		System.out.println("ch: "+ ch);
		
		
		
		
	}

}
