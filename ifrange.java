import java.util.Scanner;
class ifrange
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter A Number : ");
		int a = sc.nextInt();

		if (a > 0 && a< 51) 
			
		System.out.println(a+ " It is In Range of (1-50) ");
	 	
	 	else if (a> 50 && a< 101)

	 	System.out.println(a+ " It is In Range of (51-100) ");

	 	
	 	else if (a> 100 && a< 201)

		System.out.println(a+ " It is In Range of (101-200) ");
	 	
	
	 	else

	 	System.out.println("It is Out Of Range");


	}
}