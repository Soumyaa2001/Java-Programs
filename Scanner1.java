import java.util.Scanner;
class Scanner1
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter Your 1st Number : ");
		int a = sc.nextInt();

		System.out.println("Enter Your 2nd Number : ");
		int b = sc.nextInt();

		int res = (a +b );

		System.out.println("Addition Of Your Numbers Are : " +res );


	}
}