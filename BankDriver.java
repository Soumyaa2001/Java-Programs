interface Bank
{
	 double ROI();
	 String getBranch();
}
class Statebankofindia implements Bank
{
	@Override
	public double ROI()
	{
		return 6d;
	}
	@Override
	public String getBranch()
	{
		return "DumDum";
	}
}
class HDFCbank implements Bank
{
	@Override
	public double ROI()
	{
		return 7d;
	}
	@Override
	public String getBranch()
	{
		return "Kestopur";
	}
}
class Axisbank implements Bank
{
	@Override
	public double ROI()
	{
		return 8d;
	}
	@Override
	public String getBranch()
	{
		return "Sapurji";
	}
}

class BankDriver
{
	public static void main(String[] args) {
		Bank b;
		b= new Statebankofindia();
		System.out.println(b.ROI());
		System.out.println(b.getBranch());
		b = new HDFCbank();
		System.out.println(b.ROI());
		System.out.println(b.getBranch());
		b= new Axisbank();
		System.out.println(b.ROI());
		System.out.println(b.getBranch());
	}
}