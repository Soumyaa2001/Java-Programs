interface Depeartment
{
	 String getDepeartment();

}
 interface Project
 {
	boolean getProject();
 }

class EmployeeDetails implements Depeartment, Project
{
	@Override
	public String getDepeartment()
	{
		return "Development" ;
	}
	@Override
	public boolean getProject()
	{
		return true ;
	}
}

class EmployeeDriverInter
{
	public static void main(String[] args) {
		Depeartment d;
		Project p;
		d= new EmployeeDetails();
		p= new EmployeeDetails();
		System.out.println(d.getDepeartment());
		System.out.println(p.getProject());
	}
}