package javaselenium;

class Vehicle1 {
    int passengers; // number of passengers
    int fuelcap; // fuel capacity in gallons
    int mpg; // fuel consumption in miles per gallon

    // Return the range.
    int range() {
        return mpg * fuelcap;
    }

    // Compute fuel needed for a given distance.
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}



public class CompFuel {
	public static void main(String args[]) {
        Vehicle1 minivan = new Vehicle1();
        Vehicle1 sportscar = new Vehicle1();
        double gallons;
        int dist = 252;

        // assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // assign values to fields in sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;
        
        System.out.println("Minivan range: " + minivan.range() + " miles");
        System.out.println("Sportscar range: " + sportscar.range() + " miles");

        gallons = minivan.fuelneeded(dist);
        System.out.println("To go " + dist + " miles minivan needs " +
                gallons + " gallons of fuel.");

        gallons = sportscar.fuelneeded(dist); //overwriting same variable
        System.out.println("To go " + dist + " miles sportscar needs " +
                gallons + " gallons of fuel.");
    }

}
