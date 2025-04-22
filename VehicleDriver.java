class Vehicle
{
	String brand;
	String model;
	int year;
	 Vehicle(String brand,  String model, int year)
	 {
	 	this.brand=brand;
	 	this.model=model;
	 	this.year=year;
	 }
	     public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}
class Car extends Vehicle
{
	String fuletype;
	int doorno;
	Car (String brand,  String model, int year, String fuletype, int doorno)
	{
		super(brand, model, year);
		this.fuletype=fuletype;
		this.doorno=doorno;
	}
    public void display() {
        super.display();
        System.out.println("Fuel Type: " + fuletype);
        System.out.println("Number of Doors: " + doorno);
    }
}
class Bike extends Vehicle
{
	String biketype;
	boolean hasgear;
	Bike (String brand,  String model, int year, String biketype, boolean hasgear  )
	{
		super(brand, model, year);
		this.biketype=biketype;
		this.hasgear=hasgear;
	}
    public void display() {
        super.display();
        System.out.println("Bike Type: " + biketype);
        System.out.println("Has Gear: " + hasgear);
    }
}

class SportsCar extends Car
{
	int topSpeed;
	boolean isConvertible;
	SportsCar (String brand,  String model, int year,String fuletype, int doorno, int topSpeed , boolean isConvertible)
	{
		super(brand, model, year, fuletype, doorno);
		this.topSpeed=topSpeed;
		this.isConvertible=isConvertible;
	}
    public void display() {
        super.display();
        System.out.println("Top Speed: " + topSpeed + " km/h");
        System.out.println("Convertible: " + isConvertible);
    }
}
public class VehicleDriver{
	public static void main(String[] args) {
        Car c = new Car("Toyota", "Corolla", 2020, "Petrol", 4);
        Bike b = new Bike("Yamaha", "FZ", 2021, "Sports", true);
        SportsCar s = new SportsCar("Ferrari", "488", 2022, "Petrol", 2, 330, true);

        System.out.println("Car Details:");
        System.out.println();
        c.display();
        System.out.println();
        System.out.println("------------------");
        System.out.println("Bike Details:");
        System.out.println();
        b.display();
        System.out.println();
        System.out.println("------------------");
        System.out.println("Sports Car Details:");
        System.out.println(
        );
        s.display();
	}
}