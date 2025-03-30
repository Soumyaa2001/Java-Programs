import java.util.Scanner;
class CalculateSpeed
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter Your Speed : ");
		int s = sc.nextInt();
		method.speed(s);
	}
}

class method
{
	public static void speed(int a) {
		if (a <40) 
			
		System.out.println( " Low Speed ");
	 	
	 	else if (a>= 40 && a<= 60)

	 	System.out.println(" Average Speed ");
 	
	 	else 

		System.out.println( " High Speed ");

	}
}