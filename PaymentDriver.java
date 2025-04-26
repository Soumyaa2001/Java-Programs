class Payment
{
	public static void pay(String upi)
	{
		System.out.println(" Payment done by UPI ");
	}
	public static void pay(long acno, String ifsc, int otp)
	{
		System.out.println(" Payment done by Net Banking ");
	}
	public static void pay(long ccardno, int cvv)
	{
		System.out.println(" Payment done by Credit Card ");
	}
	public static void pay(long dcardno, int cvv, int pin)
	{
		System.out.println(" Payment done by Debit Card ");
	}
	public static void pay(double cash)
	{
		System.out.println(" Payment done by Cash ");
	}
}
 class PaymentDriver
 {
 	public static void main(String[] args) {
 		Payment.pay("Soumya@1234");
 		Payment.pay(123456789l,"ABCDE01234", 1234);
 		Payment.pay(123456789l, 123);
 		Payment.pay(123456789l, 123, 123456);
 		Payment.pay(1000d);
 	}
 }