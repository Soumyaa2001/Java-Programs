interface Developer
{
	void dev();
}
interface Tester
{
	void test();
}
interface Mnager
{
	void man();
}
class Employee implements Developer, Tester, Mnager
{
	@Override
	public void dev()
	{
		System.out.println("Developer");
	}
	@Override
	public void test()
	{
		System.out.println("Tester");
	}
	@Override
	public void man()
	{
		System.out.println("Mnager");
	}
}

class EmployeeDriver
{
	public static void main(String[] args) {
		Employee e = new Employee();
		e.dev();
		e.test();
		e.man();
	}
}
