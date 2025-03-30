// Cecck length of phone number

import java.util.Scanner;
class PhoneNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Phone Number :");
		long n = sc.nextLong();
		System.out.println("Length Of Your Phone Number Is :" +method.phoneNumber(n));
		
	}
}

class method{
	public static int phoneNumber(long n) {
		  int count = 0;
		   while(n>0){
		   	n=n/10;
		   	count++;
		   }
		  return count;
	}
}