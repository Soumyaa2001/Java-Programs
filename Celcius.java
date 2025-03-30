// Ceccius to Farenhight

import java.util.Scanner;
class Celcius{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temparature in Celcius :");
		float c = sc.nextFloat();
		System.out.println("Your Temparature In Farenhite Is :" +method.celcius(c));
		
	}
}

class method{
	public static float celcius(float c) {
		  float f = (float) ((c*9)/5 +32);
		  return f;
	}
}