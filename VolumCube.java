// volum of cube

import java.util.Scanner;
class VolumCube {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Side of Cube :");
		float l = sc.nextFloat();
		
		System.out.println("Your Volum Of Cube Is :" +method.cube(l));
		
	}
}


class method{
	public static float cube(float l) {
		  float v = l*l*l;
		  return v;
	}
}