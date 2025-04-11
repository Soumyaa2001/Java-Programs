import java.util.Scanner;
class BankAccountManagement
{
	private String accountHolderName; //readable
	private long accountNumber; //readable
	private double balance;//readable and writeable

	BankAccountManagement(String accountHolderName, long accountNumber, double balance)
	{
		this.accountHolderName=accountHolderName;
		this.accountNumber=accountNumber;
		this.balance=balance;
	}

	public String getAccountHolderName() { return accountHolderName; }
	public long getAccountNumber() { return accountNumber;	}
	public double getBalance() { return balance; }
	public void setBalance(double balance)
	{
		this.balance=balance;
	}

	public  void withdraw(double amount)
	{
		if(amount<= balance && amount>0)
		{
			System.out.println(amount+ "Withdrawn Successfully");
			balance = balance - amount;
		}
		else 
		{
			System.out.println("Insufficient Balence");
		}
	}

	public  void diposite(double amount)
	{
		if(amount>0)
		{
			System.out.println(amount+ "Diposite Successfully");
			balance = balance + amount;
		}
		else 
		{
			System.out.println("Invalid Amount");
		}
	}
}

class BankAccountManagementDriver
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 BankAccountManagement bam1 =new BankAccountManagement("Soumya",00000000001,5000d);

		 bam1.diposite(1000d);
		 System.out.println("Account Holder Name Is : " +bam1.getAccountHolderName());
		 System.out.println("Account Number Is : "  +bam1.getAccountNumber());
		 System.out.println("Balance is : " +bam1.getBalance() +" Rs");
		 System.out.println("-----------------");
		 bam1.withdraw(500d);
		 System.out.println("Account Holder Name Is : " +bam1.getAccountHolderName());
		 System.out.println("Account Number Is : "  +bam1.getAccountNumber());
		 System.out.println("Balance is : "  +bam1.getBalance()+" Rs");


		 System.out.println("*******************");
		 System.out.println("Enter Account Holder Name Is : " );
		 String name=sc.next();
		 System.out.println("Account Number Is : " );
		 long account=sc.nextInt();
		 System.out.println("Balance is : " );
		  double amount=sc.nextDouble();
		 BankAccountManagement bam2 = new BankAccountManagement(name,account,amount);

		 bam2.diposite(1000d);
		 System.out.println("Account Holder Name Is : " +bam2.getAccountHolderName());
		 System.out.println("Account Number Is : "  +bam2.getAccountNumber());
		 System.out.println("Balance is : " +bam2.getBalance() +" Rs");
		 System.out.println("-----------------");
		 bam2.withdraw(500d);
		 System.out.println("Account Holder Name Is : " +bam2.getAccountHolderName());
		 System.out.println("Account Number Is : "  +bam2.getAccountNumber());
		 System.out.println("Balance is : "  +bam2.getBalance()+" Rs");
	}
}