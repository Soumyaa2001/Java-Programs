import java.util.Scanner;
class NestedIfCheck
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter A Number : ");
		int a = sc.nextInt();


		if (a >= 1 && a <= 50) 
			
			{	if ( a %2 ==0)

	 		System.out.println(a+" It Is An Even Number ");

	 		else

	 		System.out.println(a+"It Is An Odd Number");
	 		}

	 	else if (a > 50 )

	 		{	if ( a %3 ==0)

	 		System.out.println(a+"It Is A Multiple Of 3");

	 		else

	 		System.out.println(a+ "It Is NOT A Multiple Of 3");
	 		}

	 	else
	 		System.out.println(" Your Number Should Be Greater Than 0" );

	}
}