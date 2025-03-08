import java.util.Scanner;
class ifelseif
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter A Number : ");
		int a = sc.nextInt();

		if (a > 0) 
			
		System.out.println(a+ " It is Positive Number");
	 	
	 	else if (a< 0)

	 	System.out.println(a+ " It is Negative Number");

	 	else

	 	System.out.println("It is 0");


	}
}