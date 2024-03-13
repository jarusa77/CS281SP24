package ADT;

public class LinkedList 
{
	public static class Node
	{
		int data;
		
		Node tail;
		
		Node()
		{
			this(0);
		}
		
		Node(int n)
		{
			data=n;
			tail=null;
		}
	}
	
	
	Node head;
	Node current;//Positional
	
	LinkedList()
	{
		head=null;
		current=null;
	}
	
	public boolean addNode(int i)
	{
		Node temp=new Node(i);
		
		if(isEmpty())
		{
			head=temp;
			current=head;
		}
		else
		{
			temp.tail=head;
			head=temp;
		}
		
		return true;
	}
	public int getCurrentData()
	{
		if(current==null)
			return -999999;
		
		 
		return current.data;
	}
	
	public boolean iterate()
	{
		if(current==null)
			return false;
		
		if(current.tail==null)
			return false;
		
		current=current.tail;
		
		return true;
	}
	
	public void  reset()
	{
		current=head;
	}
	
	public boolean isEmpty()
	{
		if(head==null)
			return  true;
					
		return false;
	}
	
	//deleteNode
	public  void deleteCurrent()
	{
		if(isEmpty())
		{
			return;
		}
		
		if(current.tail!=null)
		{
			current.data = current.tail.data;
			current=current.tail;
		}
		else if(head==current)
		{
			head=null;
			current=null;
		}
		else//current is last node
		{
			Node prevNode = head;
			
			while(prevNode.tail!=current)
			{
				prevNode=prevNode.tail;
			}
			prevNode.tail=null;
			current =prevNode;
		}
		
		
		
	}
	
	//findNode
	public boolean find(int x)
	{
		reset();
		if(isEmpty())
			return false;
		
		if(head.data==x)
			return true;
		
		while(iterate()) 
		{
			if(current.data==x)
				return true;
		}
		return false;
		
		

		
		
	}
	
	
	
	
	
	

}
