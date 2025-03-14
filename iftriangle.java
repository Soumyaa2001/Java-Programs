import java.util.Scanner;
class Iftriangle
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter Side A : ");
		int a = sc.nextInt();

		System.out.println("Enter Side B : ");
		int b = sc.nextInt();

		System.out.println("Enter Side C : ");
		int c = sc.nextInt();


		if ((a==b && b==c) && (a==c)) 
			
		System.out.println("It is Equilateral Triangle");
	 	
	 	else if ((a==b || b==c) || (a==c))
	 	System.out.println(" It is Isosceles Triangle");

	 	else

	 	System.out.println("It is Scalene Triangle");


	}
}