import java.util.Scanner;
class Vote
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter Your Age : ");
		int a = sc.nextInt();

		String res = (a>18) ? "You Are Eligible For Vote" : "You Are Not Eligible For Vote" ;

		System.out.println( res );


	}
}