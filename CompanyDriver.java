class Employee
{
	private double basicsalary;
	private int empid;
	private String name;

}

class Developer extends Employee
{
	double hike;
	Developer(double hike,  double basicsalary, int empid, String name)
	{
		super(basicsalary,empid,name);
		this.hike=hike;
	}

	public void display()
	{
		System.out.println(" Basic Salary :" + getBasicSlary());
		System.out.println(" Employee id :" + getEmpid());
		System.out.println(" Employee Name :" + getName());
		System.out.println(" Hike :" + hike);
	}
	public double calculateSalary()
	{
		return(getBasicSlary() + getBasicSlary()*(hike/100));
	}
}
class Tester extends Employee
{
	double hike;
	Developer(double hike,  double basicsalary, int empid, String name)
	{
		super(basicsalary,empid,name);
		this.hike=hike;
	}

	public void display()
	{
		System.out.println(" Basic Salary :" + getBasicSlary());
		System.out.println(" Employee id :" + getEmpid());
		System.out.println(" Employee Name :" + getName());
		System.out.println(" Hike :" + hike);
	}
	public double calculateSalary()
	{
		return(getBasicSlary() + getBasicSlary()*(hike/100));
	}

}

class CompanyDriver
{
	public static void main(String[] args) {
		
	}
}