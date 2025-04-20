class Fruit
{
	String origin;
	 Fruit(String origin)
	 {
	 	this.origin=origin;
	 }
}
class Mango extends Fruit
{
	String taste;
	double price;
	Mango(String origin, String taste, double price)
	{
		super(origin);
		this.taste=taste;
		this.price=price;
	}
		public void display()
	{
		System.out.println("origin is : "+origin);
		System.out.println("Taste : "+taste);
		System.out.println("Price : "+price);
		System.out.println();
		System.out.println();
	}
}
class Orange extends Fruit
{
	String taste;
	double price;
	Orange(String origin, String taste, double price)
	{
		super(origin);
		this.taste=taste;
		this.price=price;
	}
	public void display()
	{
		System.out.println("origin is : "+origin);
		System.out.println("Taste : "+taste);
		System.out.println("Price : "+price);
		System.out.println();
		System.out.println();
	}
}
public class FruitDriver{
	public static void main(String[] args) {
		 Mango m =new Mango("indian", "good", 1000d);
		 Orange o = new Orange("russian", "good", 1000d);
		m.display();
		o.display();
	}
}