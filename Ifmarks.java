import java.util.Scanner;
class Ifmarks
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter Your Marks : ");
		int a = sc.nextInt();

		if (a == 100) 
			
		System.out.println( " You Get Excellent ");
	 	
	 	else if (a> 89 && a< 100)

	 	System.out.println(" You Get A+ ");

	 	
	 	else if (a> 79 && a< 90)

		System.out.println( " You Get A ");

		else if (a> 69 && a< 80)

		System.out.println( " You Get B+ ");

		else if (a> 59 && a< 70)

		System.out.println( " You Get B ");

		else if (a> 49 && a< 60)

		System.out.println( " You Get C ");


		else if (a> 39 && a< 50)

		System.out.println( " You Get D ");
	 	
	
	 	else

	 	System.out.println("Fail Give Re-Exam");


	}
}