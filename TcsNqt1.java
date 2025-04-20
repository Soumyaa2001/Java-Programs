import java.util.Scanner;
class TcsNqt1
{
	public static long stringpermutation(String s) 
	{
		int l=s.length();
		long fact=1;
		int count=0;
		for(int i=l;i>0;i--)
		{
			fact=fact*i;
		}

		for(int i=0;i<l;i++)
		{
			for(int j=0;j<l;j++)
			{
				if(s.charAt(i)==s.charAt(j))
					count++;
			}

			if(count>1)
			{
				int fcount=1;
				for(int k=1;k<= count;k++)
				{
					fcount=fcount*k;
				}

				fact=fact/fcount ;
				fcount=1;
			}
			count=0;
		}

		return fact;

	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		String s = sc.next();
		System.out.println(stringpermutation(s));;
	}
}