class Order
{
	public  void pay(String id)
	{
		System.out.println(" Ordered by id ");
	}
	public  void pay(String id, int quantity)
	{
		System.out.println(" Ordered by id and quantity ");
	}
	public static void pay(String id, String name, int quantity)
	{
		System.out.println(" Ordered by id and name and quantity ");
	}
}
 class OrderDriver
 {
 	public static void main(String[] args) {
 		Order o = new Order();
 		o.pay("ABC1234");
  		o.pay("ABC1234",100);
 		o.pay("ABC1234", "Product", 10);
	}
 }