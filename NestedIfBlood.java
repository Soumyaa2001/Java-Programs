import java.util.Scanner;
class NestedIfBlood
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter Your Age : ");
		int a = sc.nextInt();

		System.out.println("Enter Your Weight : ");
		int w = sc.nextInt();

		if (a >= 18) 
			
		{	if (w >= 55)

	 		System.out.println(" You Are Eligible ");

	 		else

	 		System.out.println("You Are Under Weight");
	 	}

	 	else

	 	System.out.println("You Are Under Age !!");

	}
}