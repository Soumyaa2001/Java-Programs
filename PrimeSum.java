import java.util.Scanner;
class PrimeSum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m= sc.nextInt();
		int sum=0;
		for (int x=2; x<=m; x++ ) {
		int count=0;
			for(int i = 1; i<=x; i++)
			{
				if(x%i==0)
				count++;
			}
		
		 if (count==2)
		 sum = sum+x;
		
		}
		 System.out.println(sum);		
	}
}