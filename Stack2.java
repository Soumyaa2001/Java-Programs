import java.util.Stack;
class Stack2{
	public static void main(String[] args) {
		Stack<Integer> s= new Stack<>();
		int a = 10;
		int b = 20;
		s.push(a);
		s.push(b);
		//System.out.println(s.pop(a));
		//System.out.println(s.pop(b));
		s.pop(a);
		s.pop(b);
	}
}