// Build a House class that contains a Door.
// The Door class should have material, color, and isLocked.
// In the House class, include a method showHouseInfo() that displays door information too

class House 
{
	Door p = new Door();
	
}

class Door
{
	String material = "Wood";
	String color = "Brown";
	boolean isLocked = true;
}
 
class HouseDriver
{
	public static void main(String[] args) {
		House l = new House();
	System.out.println(" Material is : " + l.p.material);
	System.out.println(" Color is : " + l.p.color);
	System.out.println(" Is Locked : " + l.p.isLocked);
	}
	
}