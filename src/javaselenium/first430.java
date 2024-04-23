package javaselenium;

public class first430 {

	public static void main(String[] args) {
		/*int iresult, irem;
		double dresult, drem; 
		iresult = 10 / 3;
		irem = 10 % 3;

		dresult = 10.0 / 3.0;

		drem = 10.0 % 3.0;

		System.out.println("Result and remainder of 10 / 3: " + iresult + " " + irem);
		System.out.println("Result and remainder of 10.0 / 3.0: "+ dresult + " " + drem);
		*/
		
		/*int n, d;
		n = 10;

		d = 2;

		if(d != 0 && (n % d) == 0)

		System.out.println(d + " is a factor of " + n);
		d = 0; // now, set d to zero
		// Since d is zero, the second operand is not evaluated. 
		if(d != 0 && (n % d) == 0)
		System.out.println(d + " is a factor of " + n);
		*/
		boolean p, q;
		System.out.println("P\tQ\tPANDQ\tPORQ\tPXORQ\tNOTP");
		p = true; q = true;
		System.out.print(p + "\t" + q +"\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		p = true; q = false;
		System.out.print(p + "\t" + q +"\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		p = false; q = true;
		System.out.print(p + "\t" + q +"\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p)); 
		p = false; q = false;
		System.out.print(p + "\t" + q +"\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
	}

}
