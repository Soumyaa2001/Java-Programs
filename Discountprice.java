// Discount Price

import java.util.Scanner;
class Discountprice{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Price :");
		int p = sc.nextInt();
		System.out.println("Enter Rate Of Discount :");
		float r = sc.nextFloat();
		System.out.println("Your Discounted Price Is :" +method.discount(p,r));
		
	}
}


class method{
	public static float discount(double p, float r) {
		  float d = (float)(p-((p*r)/100));
		  return d;
	}
}