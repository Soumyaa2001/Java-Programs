import java.util.Scanner;
class CheckMultiple
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter A Number : ");
		int a = sc.nextInt();

		String res = (a % 3 == 1) ? " It is Not Multiple of 3" : " It is Multiple of 3" ;

		System.out.println( res );


	}
}