import java.util.Scanner;
import java.util.Stack;
class StackRemoveDuplicate
{
	public static void main(String[] args) {
		Stack<Character> s = new Stack<>();
		Scanner sc = new Scanner(System.in);
		 String str= sc.next();
     		String rev = " ";

		 for (int i =0;i <str.length(); i++) 
		 {  
		 	char c = str.charAt(i);
		 	if (!s.isEmpty() && s.peak () == c)
		 	 {
				s.pop();

		 	}
		 	else 
		 	{
				String rev = " ";		 		
			 	rev = rev+s.push(c);
			}
	
		 	}
		 
		 System.out.println(rev);

	}
}