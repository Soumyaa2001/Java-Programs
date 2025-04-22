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
	static Node head;
	public static boolean isEmpty()
	{
		return head == null;
	}
	public static void insertAtEnd(int data)
	{
		Node new_node = new Node(data);
		if(isEmpty())  // when linked list is empty----- head will be null
			head=new_node;
		else
		{
			Node temp= head;
			while(temp.next!=null)//when linked list is not emty----head will not be null
			{
				temp= temp.next;
			}
			temp.next=new_node; // node inserted at last
		}
		System.out.println(display());
	}
	public static void insertNodeAtBeginning(int data)
	{
		Node new_node = new Node(data);
		if(isEmpty())
			head=new_node;
		else 
		{
			new_node.next=head;
			head=new_node; //inserted at beginning
		}
		System.out.println(display());
	}

	public static void removeFromEnd()
	{
		if(isEmpty())
			System.out.println("Linked List is NULL");
		else if (head.next==null)
			head=null;
		else
		{
			Node temp= head;
			while(temp.next.next!=null)
			{
				temp= temp.next;
			}
			temp.next=null; // node removed at last
		}
		//System.out.println(display());

	}
	public static void removeFromStart()
	{
		if(isEmpty())
			System.out.println("Linked List is NULL");
		head=head.next;
		System.out.println(display());

	}

	public static String display(){
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
		java.util.Scanner sc = new java.util.Scanner(System.in);
		boolean flag=true;
		while (flag){
		System.out.println("---------------------");
		System.out.println("1. Insert at end");
		System.out.println("2. Insert at Beginning");
		System.out.println("3. Remove From Beginning");
		System.out.println("4. Remove From End");
		System.out.println("5. Display");
		System.out.println("6. Exit");
		System.out.println("----------------------");
		System.out.println();
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1: System.out.println("Enter data : ");
			int data1 = sc.nextInt();
			LinkedList.insertAtEnd(data1);
			break;
		case 2: System.out.println("Enter data at Beginning : ");
			int data2 = sc.nextInt();
			LinkedList.insertNodeAtBeginning(data2);
			break;
		case 3: LinkedList.removeFromStart();
			break;

		case 4: LinkedList.removeFromEnd();
			break;

		case 5: System.out.println(LinkedList.display());	
			break;
		case 6: flag = false; 
			break;
		default: System.out.println("Invalid choice");

		}
	}

	}
}

