interface PaymentGateway
{
	 double pay();
}
class CreditCard implements PaymentGateway
{
	@Override
	public double pay()
	{
		return 100000d;
	}
}
class UpiPayments implements PaymentGateway
{
	@Override
	public double pay()
	{
		return 5000d;
	}
}
class CashPayment implements PaymentGateway
{
	@Override
	public double pay()
	{
		return 100d;
	}
}

class PaymentGatewayDriver
{
	public static void main(String[] args) {
		PaymentGateway p;
		p= new CreditCard();
		System.out.println(p.pay());
		p = new UpiPayments();
		System.out.println(p.pay());
		p= new CashPayment();
		System.out.println(p.pay());
	}
}