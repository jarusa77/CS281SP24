package StacksNQueues;

public class Stack 
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
	
	Node Top;
	int Size;
	
	Stack()
	{
		Top=null;
		Size=0;
	}
	
	
	//push
	public void  push(String newFlavor)
	{
		Node temp=new Node(newFlavor);
		
		temp.tail=Top;
		Top=temp;
		Size++;
	}
	
	//isEmpty
	public boolean isEmpty()
	{
		if(Top==null)
			return true;
		
		return false;
	}
	
	//pop
	public  String pop()
	{
		if(isEmpty())
		{
			return "empty!";
		}
		
		String temp = Top.flavor;
		Top=Top.tail;
		Size--;
		
		return temp;
		
	}
	//top
	public String top()
	{
		return Top.flavor;
	}
	//size
	public int size()
	{
		return Size;
	}
	

}
