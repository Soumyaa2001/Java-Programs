class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
	}
}
class LinkedList
{
	Node head;
	public void insert(int data)
	{
		Node new_node = new Node(data);
		if(head==null)  // when linked list is empty----- head will be null
			head=new_node;
		else
		{
			Node temp= head;
			while(temp.next!=null)//when linked list is not emty----head will not be null
			{
				temp= temp.next;
			}
			temp.next=new_node;
		}
	}
	public String display(){
		String s = "[";
		Node temp = head;
		while(temp!=null)
			{
			if(temp.next==null)
			s= s+ temp.data;
			else
			s= s+ temp.data + " ,";
			temp = temp.next;
		}
		s= s+ "]";
		return s;
	}
}
class NodeDriver
{
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.insert(10);
		l1.insert(20);
		System.out.println(l1.display());	
	}
}

