package javaselenium;

public class Vehicle {

		int passengers; // number of passengers 
		int fuelcap=10; // fuel capacity in gallons
		int mpg=12; // fuel consumption in miles per gallon

		// Display the range. 
		void range() {
		System.out.println("Range is " + fuelcap*mpg);

		}
		public static void main(String[] args) {
			Vehicle vh=new Vehicle();
			vh.range();

	}
	/*
	    int passengers; // number of passengers 
		int fuelcap; // fuel capacity in gallons
		int mpg; // fuel consumption in miles per gallon

		// Display the range. 
		void range(int fuelcap,int mpg) {
		System.out.println("Range is " + fuelcap*mpg);

		}
		public static void main(String[] args) {
			Vehicle vh=new Vehicle();
			vh.range(10,9);

	}
	 */
		
}
