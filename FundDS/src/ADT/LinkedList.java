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
	Node current;
	
	LinkedList()
	{
		head=null;
		current=null;
	}
	
	public boolean addNode(int i)
	{
		Node temp=new Node(i);
		
		if(head==null)
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
	
	//findNode
	
	
	
	
	

}
