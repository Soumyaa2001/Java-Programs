class triangle
{
	public static void main (String args []) 

	{ int a = 15;
		int b = 15;
		int c = 15;

		String result = (((a == b) && (b == c)) && (a == c)) ? " It is an Equilateral Triangle" :
		 ((((a == b) || (b == c)) || (a == c)) ? " It is an Isosceles Triangle" : " It is an Scalene Triangle" );


		System.out.println(result);
	}
}