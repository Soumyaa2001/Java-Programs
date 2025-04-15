// Create a Laptop class that has a Processor.
// Processor class should have brand, speedGHz, and coreCount.
// Write a method in Laptop to display all details of the laptop and its processor

class Laptop 
{
	Processor p = new Processor();
	String laptopbrand;
	int ram;
	double price;
	String color;
	Laptop(String laptopbrand, int ram, double price, String color)
	{
		this.laptopbrand=laptopbrand;
		this.ram=ram;
		this.price=price;
		this.color=color;
	}
	 public  void displayProcessor () {
	 	System.out.println("Laptop Brand is : " + laptopbrand);
	 	System.out.println("Ram is : " + ram);
	 	System.out.println("Price is : " +price);
	 	System.out.println("Color is : " +color);
	 	System.out.println("Brand is : " + p.brand);
	  	System.out.println("Speed is : " + p.speedGHz + " GHz");
	   	System.out.println("Core count is : " + p.coreCount);
	   } 
}
class Processor
{
	String brand = "Intel";
	float speedGHz = 1.60f;
	int coreCount = 8;
} 
class LaptopDriver
{
	public static void main(String[] args) {
		Laptop l = new Laptop("Lenovo",16,45000,"Silver");
		l.displayProcessor();
	}	
}