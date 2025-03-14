import java.util.Scanner;
class Ifvote
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter Your Age : ");
		int a = sc.nextInt();

		if (a < 11 ) 
			
		System.out.println(" The Person is A Child");
	 	
	 	else if (a> 10 && a< 20)

	 	System.out.println(" The Person is A Teen ");

	
	 	else

	 	System.out.println(" The Person is An Adult");


	}
}