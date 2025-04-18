class Bike
{  
	int cc;
	int fuelcapacity;
	Bike(){}
	Bike( int cc, int fuelcapacity)
	{
		this.cc=cc;
		this.fuelcapacity=fuelcapacity;
	}

}

class HeroHonda extends Bike
{	
	String color;
	double price;
	String brand;
	HeroHonda(String color,	double price, String brand, int cc, int fuelcapacity)
	{
		super(cc, fuelcapacity);
		this.color=color;
		this.price=price;
		this.brand=brand;
	}
	 public void display()
	 {
	 	System.out.println("Bike Details is : ");
	 	System.out.println("Color is : " + color);
	 	System.out.println("Price is : " +price);
	 	System.out.println("Brand is : " +brand);
	 	System.out.println("CC is : " +cc + " HP");
	 	System.out.println("Fuel Capacity is : " +fuelcapacity +" Liters");
	 }

}

class BikeDriver
{
	public static void main(String[] args) 
	{
		HeroHonda b = new HeroHonda("Black", 100000d, "HeroHonda", 20, 10);
		b.display();
	}
}