class Parent
{
	String p ="Parent";
}
class Child extends Parent
{
	String c ="child";
}

class ParentChildDriver
{
	public static void main(String[] args) {
		Child c = new Child();	
		System.out.println(c.p);
		System.out.println(c.c);

		 Parent p = new Child();
		 System.out.println(p.p);
		 // System.out.println(p.c);  // COMPILE TIME ERROR
	}
}