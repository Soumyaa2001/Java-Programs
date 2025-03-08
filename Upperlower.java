import java.util.Scanner;
class Upperlower
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter A Character : ");
		char a = sc.next().charAt(0);

		String res = (a >= 'A' && a <= 'Z') ? " It is Uppercase" :( (a >= 'a' && a <= 'z') ? " It is Lowercase" : " Please Enter a Character" );

		System.out.println( res );


	}
}