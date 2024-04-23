package javaselenium;

class Studentdetails {
    String name;
    int rollnumber;
    long phonenumber;
    String address;

    public void setDetails(String name, int rollNumber, long phoneNumber, String address) {
        this.name = name;
        this.rollnumber = rollNumber;
        this.phonenumber = phoneNumber;
        this.address = address;
    }
    public void printDetails() {
        System.out.println("Name: " +name);
        System.out.println("Roll Number: " +rollnumber);
        System.out.println("Phone Number: " +phonenumber);
        System.out.println("Address: " +address);
    }
}
public class Student1 {
	
    public static void main(String[] args) {
		Studentdetails sam = new Studentdetails();
        Studentdetails john = new Studentdetails();

        sam.setDetails("Sam", 101, 6844567895L, "Noida,UP");

        john.setDetails("John", 102, 9876543210L, "Jaipur,Rajasthan");

        System.out.println("Details for Sam:");
        sam.printDetails();

        System.out.println("Details for John:");
        john.printDetails();
	}
}
