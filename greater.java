class Greater
{
	public static void main(String args[])

	{
		int a = 20;
		int b = 15;
		int c = 18;

		String result = (a>b)? ((a>c)? "a is greatest number" : "c is greatest number"):((b>c)? " b is greatest number" : "c is greatest number");


		System.out.println(result);
	}
}