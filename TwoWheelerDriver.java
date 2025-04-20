class Account
{
	long ano;
	String ifsc;
	 Account(long ano, String ifsc)
	 {
	 	this.ano=ano;
	 	this.ifsc=ifsc;
	 }
}
class Loan extends Account
{
	double amnt;
	Loan(long ano, String ifsc, double amnt)
	{
		super(ano,ifsc);
		this.amnt=amnt;
	}
}
class TwoWheeler extends Loan
{
	String regno;
	TwoWheeler(long ano, String ifsc, double amnt, String regno)
	{
		super(ano, ifsc, amnt);
		this.regno=regno;
	}
	public void display()
	{
		System.out.println("Account Number : "+ano);
		System.out.println("IFSC code : "+ifsc);
		System.out.println("Amount : "+amnt);
		System.out.println("Resgistration Number : "+regno);
		System.out.println();
		System.out.println();
	}
}
public class TwoWheelerDriver{
	public static void main(String[] args) {
		TwoWheeler tw =new TwoWheeler(12457896523l,"ABCD4",10000.00d,"ABC1325");
		TwoWheeler tw1 =new TwoWheeler(12485296426l,"AB544",25000.00d,"1AA325");
		tw.display();
		tw1.display();
	}
}