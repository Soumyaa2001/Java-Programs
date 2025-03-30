// volum of cylinder

import java.util.Scanner;
class VolumCylinder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius of Cylinder :");
		float r = sc.nextFloat();
		System.out.println("Enter Hight Of Cylinder :");
		float h = sc.nextFloat();
		System.out.println("Your Volum Of Cylinder Is :" +method.cylinder(r,h));
		
	}
}


class method{
	public static float cylinder(float r, float h ) {
		  float v = (22*r*r*h)/7;
		  return v;
	}
}