package StacksNQueues;

public class Queue 
{
	class Node
	{
		//Data
		public String flavor;
		
		//Next reference
		public Node tail;
		
		public Node(String f)
		{
			flavor = f;
			tail = null;
		}
		
	}
	
	Node Rear;
	Node Front;
	int Size;
	
	public Queue()
	{
		Rear=null;
		Front=null;
	}
	
	//isEmpty
	public boolean isEmpty()
	{
		if(Front==null)
			return true;
		
		return false;
	}
	
	//enqueue
	public  void enqueue(String f)
	{
		Node  temp = new  Node(f);
		
		if(isEmpty())
		{
			Front=temp;
			Rear=temp;
		}
		
		Rear.tail=temp;
		Rear=temp;
		Size++;

	}
	
	//dequeue
	public String dequeue()
	{
		if(isEmpty())
			return "empty!";
		
		String temp=Front.flavor;
		
		Front=Front.tail;
		
		if(Front==null)
			Rear=null;
		
		Size--;
		return temp;
	}
	
	//first
	public String first()
	{
		return Front.flavor;
	}
	
	//size
	public int size()
	{
		return Size;
	}

}

