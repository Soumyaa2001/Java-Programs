// volum of cuboid

import java.util.Scanner;
class VolumCuboid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length of Cuboid :");
		float l = sc.nextFloat();
		System.out.println("Enter Width Of Cuboid :");
		float w = sc.nextFloat();
		System.out.println("Enter Hight Of Cuboid :");
		float h = sc.nextFloat();
		System.out.println("Your Volum Of Cuboid Is :" +method.cuboid(l,w,h));
		
	}
}


class method{
	public static float cuboid(float l, float w, float h ) {
		  float v = l*w*h;
		  return v;
	}
}