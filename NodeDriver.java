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
	private static Node head;
	private static int size=0;
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
		size++;
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
		size++;
		System.out.println(display());
	}

	public static void removeFromEnd()
	{
		if(isEmpty())
			System.out.println("Linked List is NULL");
		else if (head.next==null)
		{
			head=null;
			size--;
		}
		else
		{
			Node temp= head;
			while(temp.next.next!=null)
			{
				temp= temp.next;
			}
			temp.next=null; // node removed at last
		size--;
		}
		System.out.println(display());

	}
	public static void removeFromStart()
	{
		if(isEmpty())
			System.out.println("Linked List is NULL");
		else 
		{
			head=head.next;
			size--;
		}
		System.out.println(display());

	}
	public static int getsize()
	{
		return size;
	}

	public static void insertNodeAtPosition( int data, int pos)
	{
		if (isEmpty())
            System.out.println("Linked List is NULL");
    
     else if (pos < 0 || pos >= size) 
        System.out.println("Invalid Position");
    
     else if (pos == 0)
		 insertNodeAtBeginning(data);
			 
		else
			 {
			 	Node new_node = new Node(data);
			 	Node prev = null;
			 	Node temp = head;
			 	int count =0;
			 	while(count!=pos)
			 	{
			 		count++;
			 		prev = temp;
			 		temp = temp.next;

			 	}
			 	// insert a node at that position
			 	prev.next = new_node;
			 	new_node.next=temp;
			 	size++;
				System.out.println(display());
			 }

		
	}

	public static void removeNodeAtPosition(int pos) {
    if (isEmpty())
            System.out.println("Linked List is NULL");
    
     else if (pos < 0 || pos >= size) 
        System.out.println("Invalid Position");
    
     else if (pos == 0) 
        removeFromStart();
     else 
     {
        Node temp = head;
        Node prev = null;
        int count = 0;

        while (count != pos) 
        {
            prev = temp;
            temp = temp.next;
            count++;
        }

        prev.next = temp.next;
        temp.next= null;
        //temp=null;  
        size--;
     }
        System.out.println(display());
    }

    public static void search(int data) {
    Node temp = head;
    int index = 0;

    while (temp != null) {
        if (temp.data == data) {
            System.out.println("Element found at index: " + index);
            return ;
        }
        temp = temp.next;
        index++;
    }

    System.out.println("Element not found in the list.");
}
	public static void clear() 
	{
     while(!isEmpty())
     {
     	removeFromEnd();
     }
    System.out.println("Linked list has been cleared.");
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
		System.out.println("5. Insert At Index");
		System.out.println("6. Remove At Index");
		System.out.println("7. Display");
		System.out.println("8. Get Size");
		System.out.println("9. Exit");
		System.out.println("10. Search An Data");
		System.out.println("11. Clear the Linked List");
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

		case 5: System.out.println("Enter Index to Insert : ");
			int n = sc.nextInt();
			System.out.println("Enter The Data :");
			int data3 = sc.nextInt();
			LinkedList.insertNodeAtPosition(data3,n);
			break;

		case 6: System.out.println("Enter Index to Remove : ");
			int n1 = sc.nextInt();
			LinkedList.removeNodeAtPosition(n1);
			break;

		case 7: System.out.println(LinkedList.display());	
			break;
		case 8: System.out.println("Size is : " +LinkedList.getsize()); 
			break;
		case 9: flag = false; 
			break;

		case 10:System.out.println("Enter the value to search:");
   		 int key = sc.nextInt();
    		LinkedList.search(key);
    		break;

    	case 11:
    		LinkedList.clear();
    		break;


		default: System.out.println("Invalid choice");

		}
	}

	}
}

