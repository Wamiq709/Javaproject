package javaselenium;

class Tridetails {
    double side1;
    double side2;
    double side3;

    public Tridetails() {
        side1 = 3;
        side2 = 4;
        side3 = 5;
    }
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

public class Triangle {

		public static void main(String[] args) {
	       
	        Tridetails tri = new Tridetails();

	        System.out.println("Area of the triangle: " + tri.calculateArea());

	        System.out.println("Perimeter of the triangle: " + tri.calculatePerimeter());
	    
	
	}

}
