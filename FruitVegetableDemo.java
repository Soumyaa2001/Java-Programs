class Fruit
{

	String fruit = "mango";
}

class Vegetable
{
	String vegetable = "potato";
}

class FruitVegetableDemo
{
	public static void main(String[] args) {
		Fruit f = new Fruit();
		System.out.println(f.fruit);
		Vegetable v = new Vegetable();
		System.out.println(v.vegetable);
		// Fruit f1 = new Vegetable();
		// System.out.println(f1.fruit);   //COMPILE TIME EROOR
		// Vegetable v1 = new Fruit();
		// System.out.println(v.vegetable);

	}
}