package javaselenium;

class Tridetails2 {
	double side1;
	double side2;
	double side3;

	public Tridetails2(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double calculateArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	public double calculatePerimeter() {
		return side1 + side2 + side3;
	}
}

public class Triangle2 {

	public static void main(String[] args) {

		Tridetails2 tri2 = new Tridetails2(3, 4, 5);

		System.out.println("Area of the triangle: " + tri2.calculateArea());

		System.out.println("Perimeter of the triangle: " + tri2.calculatePerimeter());

	}

}
