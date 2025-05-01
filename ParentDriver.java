// create a single level inheritance and declare a non static metthod in parent class. 
// override this method from super class and call the method by perfoming upcasting and downcasting

class Parent
{
   public void display()
   {
   	System.out.println("Parent Method");
   }
}
class Child extends Parent
{
	@Override
	public void display()
	{
		System.out.println("Child Method");
	}

}
class Child1 extends Parent
{
	@Override
	public void display()
	{
		System.out.println("Child1 Method");
	}

}
class ParentDriver
{
	public static void main(String[] args) {
		Parent p = new Child();
		p.display();
		Child c = (Child)p;
		c.display();
		Parent p1 = new Child1();
		p1.display();
		Child1 c1 = (Child1)p1;
		c1.display();
		Parent p2 = new Parent();
		p2.display();

	}
}