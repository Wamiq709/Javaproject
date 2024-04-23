package javaselenium;

public class Student {
	String name;
	int roll_no;

	public static void main(String[] args) {
		Student st=new Student();
		st.name="John";
		st.roll_no=2;
		
		System.out.println("Name is:"+ st.name);
		System.out.println("Roll no.is: "+ st.roll_no);

	}

}
