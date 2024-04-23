package javaselenium;

public class typecasting430 {

	public static void main(String[] args) {
		/*double x, y;
		byte b; int i; 
		char ch;
		x = 10.0;
		y = 3.0;

		i = (int) (x / y); // cast double to int 
		System.out.println("Integer outcome of x / y: " + i);
		
		i = 100;
		b = (byte) i;
		System.out.println("Value of b: " + b);
		
		i = 257;
		b = (byte) i;
		System.out.println("Value of b: " + b);
		
		b = 88; // ASCII code for X
		ch = (char) b;
		System.out.println("ch: " + ch);
		*/
		
		byte b;
		int i;
		b = 10;
		i = b * b; // OK, no cast needed b = 10;
		b = (byte) (b * b + i); // cast needed!! as cannot assign int to byte
		System.out.println("i and b: " + i + " " + b);

	}

}
