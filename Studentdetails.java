import java.util.Scanner;
class StudentDetails
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter Your Name : ");
		String name = sc.nextLine();

		System.out.println("Enter Your Roll Number : ");
		int roll = sc.nextInt();

		System.out.println("Enter Your Gender as (M/F) : ");
		char gender = sc.next().charAt(0);

		System.out.println("Enter Your Phone Number : ");
		long phone = sc.nextLong();

	 	System.out.println("Printing Your Details ......");
		System.out.println("Your Name is : " +name );
		System.out.println("Your Roll Number is : " +roll );
		System.out.println("Your Gender is : " +gender );
		System.out.println("Your Phone Number is : " +phone);

	}
}