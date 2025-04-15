class College 
{
	String collegename = "RCC";
	Student s = new Student();
	 public  void display () {
	  	System.out.println(" College Nmae is : " + collegename);
	  	System.out.println("Student Nmae is : " + s.name);
	  	System.out.println("Student Roll No is : " + s.roll);
	  	System.out.println("Student Phone No is : " + s.phone);
	  	System.out.println("Student City is : " + s.a.city);
	  	System.out.println("Student State is : " + s.a.state);
	  	System.out.println("Student Pincode is : " + s.a.pincode);
	  } 
}
class Address
{
	String city = " Kolkata";
	String state = "West Bengal";
	int pincode = 700001;
}
class Student
{ 
	String name ="Soumya";
	int roll = 1234;
	long phone =1234567890;
	Address a = new Address();
}
class StudentDriver
{
	public static void main(String[] args) {
	College l = new College();
	l.display();
	}	
}