class StringPattern
{
	public static void main(String[] args) {
		 String x ="a";
		 String y = "b";
		 String z = "cdef";
		 String str = x+y+z ;
		 
		 for(int i=0; i<str.length();i++)
		 {
		 	for(int n=1;n<= str.length();n++)
		 	{
		 		for(int j=0; j<n;j++)
		 		{
		 			System.out.print(str.charAt((i+j)% str.length()));
		 		}
		 		System.out.println();
		 	}
		 }

	}
}