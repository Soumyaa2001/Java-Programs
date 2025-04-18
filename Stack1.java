//Reverse a String using Stack opration
import java.util.Scanner;
import java.util.Stack;
class Stack1
{
	public static void main(String[] args) {
		Stack<Character> s = new Stack<>();
		Scanner sc = new Scanner(System.in);
		 String str= sc.next();
		 for (int i =0;i <str.length(); i++) 
		 {  
		 	s.push(str.charAt(i));
		 }
		 String rev = " ";

		 for (int i=0; i<str.length(); i++) 
		 {  
		 	rev = rev+s.pop();
		 }
		 System.out.println(rev);
	}
}



