class Shape
{
	String color;
	Shape(String color)
	{
		this.color=color;
	}
	public double area()
	{
		return 0.0d;

	}
   
}
class Circle extends Shape
{
	double radius;
	Circle(String color, double radius)
	{
		super( color);
		this.radius=radius;
	}
	@Override
	public double area()
	{
		System.out.println("Shape is Circle");
		System.out.println("Color is : " + color);
		double a = 3.14 * radius *radius;
		System.out.print(" Area is : ");
		return a;
	}

}
class Triangle extends Shape
{
	int base;
	int height;
	Triangle(String color, int base, int height)
	{
		super( color);
		this.base=base;
		this.height=height;
	}
	@Override
	public double area()
	{
		System.out.println("Shape is Triangle");
		System.out.println("Color is : " + color);
		System.out.print(" Area is : ");
		double a = 0.5*height*base;
		return a;
	}

}

class Square extends Shape
{
	int length;
	Square(String color, int length)
	{
		super( color);
		this.length=length;
	}
	public double area()
	{
		System.out.println("Shape is Square");
		System.out.println("Color is : " + color);
		double a = length*length;
		System.out.print(" Area is : " );
		return a;
	}

}


class ShapeDriver
{
	public static void main(String[] args) {
		Shape s;
		s=new Circle("Red",4.0d);
		System.out.println(s.area());
		Circle c =(Circle)s;
		s= new Triangle("Yellow", 2,5);
		System.out.println(s.area());
		Triangle t = (Triangle)s;
		s= new Square("Blue",4);
		System.out.println(s.area());

	}
}