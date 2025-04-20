class Queue
{
	int [] queue;
	int front, rear;
	int capacity;
	Queue(int capacity)
	{
		this.capacity=capacity;
		front=-1;
		rear=-1;
		queue = new int [capacity];
	}
	public boolean isEmpty() // checking queue is empty
	{
		return( front == -1);
		//return( rear == -1);
	}
	public boolean isFull() // checking queue is full
	{
		return((rear+1)%capacity == front);
	}
	public int peek() // returning the element at front
	{
		if(isEmpty())
			return -1;
		else
			return queue[front];
	}
	public int enque() // enterning the element at rear
	{
		if(isFull())
			System.out.println("Queue Overflow");		
		else
		{
			if(isEmpty())
			{
				front=0;
				rear=0;
				int data = queue[rear];
				System.out.println( data+ " enqued in queue");
			}
			else
			{
				rear = (rear+1)%capacity;
				int data = queue[rear];
				System.out.println( data+ " enqued in queue");
			}
		}
	}
	
	public int dequeue()  // removing the element at front
	{
		if(isEmpty())
			System.out.println("Queue Underflow");		
		else
		{
			int data = queue[front];  //remove
			if(rear==front)    // check if front == rear , bring back front and rear to -1 making queue empty
			{
				front=-1;
				rear=-1;
				System.out.println( data+ " dequed from queue");
			}
			else   //if not increment from 1
			{
			front = (front+1)%capacity;
			System.out.println( data+ " dequed from queue");
			}
						
		}

	}

	public String display()
	{
		String s = "[";

		for(int i=front;!isEmpty() ;i=(i+1)%capacity)
		{
			if(i == rear)
			{
				s = s + queue[i];
				break;
			}
			else
			{
				s = s + queue[i]+ ",";
			}

		}
		s = s + "]";
	}

}

class QueueDriver
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the size of queue");
		int size = sc.nextInt();
		Queue q = new Queue(size);
		boolean flag = true;
		while(flag)
		{
			System.out.println("------------------");
			System.out.println("1. Enqueue");
			System.out.println("2. Dequeue");
			System.out.println("3. isEmpty");
			System.out.println("4. isFull");
			System.out.println("5. peek");
			System.out.println("6. display");
			System.out.println("7. exit");
			System.out.println("------------------");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1: System.out.println("Enter the data");
						int data = sc.nextInt();
						q.enque(data);
						break;

				case 2 : q.deque();
						  break;

				case 3 : System.out.println(q.isEmpty());
						  break;

				case 4 : System.out.println(q.isFull());
						  break;

				case 5 : System.out.println(q.peek());
						  break;

				case 6 : System.out.println(q.display());
						 break;

				case 7 : flag = false;
						  break;

				default : System.out.println("Invalid choice");
			}

			
		}
		System.out.println("Thank you for your patience , don't try at your home!!");	
	}
}