import java.util.Scanner;
class Oddeven
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter A Number : ");
		int a = sc.nextInt();

		String res = (a % 2 == 1) ? " It is An Odd Number" : " It is An Even Number" ;

		System.out.println( res );


	}
}