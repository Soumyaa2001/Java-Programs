// simple intrest

import java.util.Scanner;
class SimpleIntrest{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principle amount :");
		int p = sc.nextInt();
		System.out.println("Enter Rate Of Intrest :");
		int r = sc.nextInt();
		System.out.println("Enter Time In Years :");
		int t = sc.nextInt();
		System.out.println("Your Simple Intrest Is :" +method.simple(p,r,t));
		
	}
}


class method{
	public static double simple(int p, int r, int t ) {
		  double i = (p*r*t)/100;
		  return i;
	}
}