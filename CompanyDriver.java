class Company
{
	double basesalary;
	String name;
	Company(double basesalary, String name)
	{
		this.basesalary=basesalary;
		this.name=name;
	}
	public double calculatesalary()
	{
		return basesalary;

	}
}

class Employee extends Company
{
	int noofhoursworked;
	Employee(double basesalary, String name, int noofhoursworked)
	{
		super( basesalary,  name);
		this.noofhoursworked=noofhoursworked;
	}
	@Override
	public double calculatesalary()
	{
		return(((basesalary/28)/9)*noofhoursworked) ;

	}
}
class Manager extends Company
{
	double bonus;
	Manager(double basesalary, String name, double bonus)
	{
		super( basesalary,  name);
		this.bonus=bonus;
	}
	@Override
	public double calculatesalary()
	{
		return(basesalary+bonus);

	}
}
class CompanyDriver
{
	public static void main(String[] args) {
		Company c;
		c=new Employee(30000d, "Soumya", 200);
		System.out.println(c.calculatesalary());
		Employee e = (Employee) c;
		c = new Manager(30000d, "Raju", 2000d);
		System.out.println(c.calculatesalary());
	}
}