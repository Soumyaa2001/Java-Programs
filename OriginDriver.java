class Origin
{
	String fruit =" Fruit";
}
class Mango extends Origin
{
	String mango = "mango";
}
class Orange extends Origin
{
	String orange = "Orange";
}
class OriginDriver
{
	public static void main(String[] args) {
	Origin o;
	o=new Mango();
	System.out.println(o.fruit);
	System.out.println("---------");

	Mango m = (Mango)o;
	System.out.println(m.fruit);
	System.out.println(m.mango);
	System.out.println("---------");

	o=new Orange();
	System.out.println(o.fruit);
	System.out.println("------------");
	
	Orange or = (Orange)o;
	System.out.println(or.fruit);
	System.out.println(or.orange);
	System.out.println("-----------");
	System.out.println( o instanceof Origin);
	System.out.println( o instanceof Mango);
	System.out.println( o instanceof Orange);
}

}