import java.util.Scanner;
class LaptopDemo {
	String brand ;
	int ram ;
	int storage ;
	double price ;
	String model; 

}

class Laptop{

	public static void main(String[] args) {

		LaptopDemo l[] = new LaptopDemo();
		// l1.brand= "Lenovo";
		// l1.ram = 16;
		// l1.storage =1024;
		// l1.price = 45000.00d;
		// l1.model= "Idea Pad";

		
		// System.out.println("Brand is:" +l1.brand);
		// System.out.println("Ram is :" +l1.ram +" GB");
		// System.out.println("Storage is :" +l1.storage +" GB");
		// System.out.println("Price is :" +l1.price +" RS.");
		// System.out.println("Model is :" +l1.model);

		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		for (int i=0; i<n;i++ ) {
			System.out.println("Enter Brand for " +(i+1));
			sc.String= next();
			System.out.println("Enter Ram for " +(i+1));
			sc.int= nextInt();
			System.out.println("Enter Price for " +(i+1));
			sc.boolean= nextBoolean();
			l[i]


			
		}

		
	}
	
}