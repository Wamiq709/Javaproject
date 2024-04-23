package javaselenium;

import java.util.Scanner;

class Rectangledimensions {
       double length;
       double breadth;

	   public void setDim(double length,double breadth) {
		   this.length=length;
		   this.breadth=breadth;
	   }
	   public double getArea() {
		   return length*breadth;
	   }
	   
}
public class RectangleArea {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Rectangledimensions recarea=new Rectangledimensions();
		
		System.out.print("enter length: ");
		double length=sc.nextDouble();
		
		System.out.print("enter breadth: ");
		double breadth=sc.nextDouble();
		
		recarea.setDim(length,breadth);
		
		System.out.println("Area is: "+ recarea.getArea());
		
		sc.close();
	}
	
	
}
		
