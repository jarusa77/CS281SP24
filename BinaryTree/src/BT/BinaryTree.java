package BT;

public class BinaryTree 
{
	public class Node
	{
		int data;
		
		Node  left,right;
		
		Node()
		{
			left = null;
			right = null;
		}
		
		Node(int input)
		{
			data = input;
			left = null;
			right = null;
		}
	}
	
	Node Root;
	Node CurrentPos;
	
	BinaryTree()
	{
		Root = null;
		CurrentPos=null;
	}
	
	//Insertion
	public void insert(int input)
	{
		Node newNode = new Node(input);
		
		if(isEmpty())
		{
			Root = newNode;
			CurrentPos  = Root;
		}
		else
		{
			insertNode(newNode,Root);
		}
	}
	
	public int getCurrent()
	{
		if(!isEmpty())
			return CurrentPos.data;
		
		return -99999;
	}
	
	
	private void insertNode(Node newNode, Node root)
	{
		if(newNode.data < root.data)
		{
			if(root.left==null)
				root.left=newNode;
			else
				insertNode(newNode,root.left);
		}
		else
		{
			if(root.right==null)
				root.right=newNode;
			else
				insertNode(newNode,root.right);
		}
	}
	
	//Delete
	public void deleteNode(int x)
	{
		if(isEmpty())
			return;
		
		if(search(x))
		{
			if(CurrentPos.left == null &&//No Child.
			   CurrentPos.right==null)
			{
				if(CurrentPos.data == Root.data)
				{
					Root=null;
					CurrentPos=null;
				}
				else
				{
					Node Parent = findParent(CurrentPos);
					if(CurrentPos.data < Parent.data)
					{
						Parent.left=null;
						CurrentPos = Parent;
					}
					else
					{
						Parent.right=null;
						CurrentPos = Parent;
					}	
				}
			}
			else if(CurrentPos.right==null) //left child exist
			{
				if(CurrentPos.data==Root.data)
				{
					Root = CurrentPos.left;
					CurrentPos=Root;
				}
				else
				{
					Node Parent = findParent(CurrentPos);
					
					if(Parent.left!=null)
					{
						if(Parent.left.data == CurrentPos.data)
						{
							Parent.left=CurrentPos.left;
							CurrentPos=Parent.left;
						}
						else
						{
							Parent.right=CurrentPos.left;
							CurrentPos=Parent.right;
						}
					}
					
					else
					{
						Parent.right=CurrentPos.left;
						CurrentPos=Parent.right;
					}
					
				}
			}
			else if(CurrentPos.left==null) //right child exist
			{
				if(CurrentPos.data==Root.data)
				{
					Root = CurrentPos.right;
					CurrentPos=Root;
				}
				else
				{
					Node Parent = findParent(CurrentPos);
					if(Parent.right!=null) 
					{
						if(Parent.left.data == CurrentPos.data)
						{
							Parent.left=CurrentPos.right;
							CurrentPos=Parent.left;
						}
						else
						{
							Parent.right=CurrentPos.right;
							CurrentPos=Parent.right;
						}
						
					}
					
					else
					{
						Parent.right=CurrentPos.right;
						CurrentPos=Parent.right;
					}
					
				}
			}
			else //Two Children
			{
				Node LMR = leftMostRight(CurrentPos);
				
				int temp = LMR.data;
				deleteNode(temp);
				CurrentPos.data=temp;
			}
		}
	}
		
	private Node leftMostRight(Node iterator)
	{
		while(iterator.left!=null)
			iterator=iterator.left;
		
		return iterator;
	}
	
	private Node findParent(Node child)
	{
		Node iterator = Root;
		boolean found=false;
		while(found ==false && iterator!=  null)
		{
			
			if(iterator.left.data == child.data ||
			   iterator.right.data == child.data)
				found=true;
			else if(child.data < iterator.data)
				iterator=iterator.left;
			else
				iterator=iterator.right;
		}
		
		return iterator;
	}
	
	//sets CurrentPos to location of searched value.
	public boolean search(int x)
	{
		Node iterator = Root;
		boolean found=false;
		
		while(found==false && iterator != null)
		{
			if(iterator.data ==x)
			{
				found=true;
				CurrentPos=iterator;
			}
			else if(x<iterator.data)
			{
				iterator = iterator.left;
			}
			else
			{
				iterator = iterator.right;
			}
		}
		
		return found;
	}
	

	public boolean isEmpty()
	{
		if(Root == null)
			return true;
		
		return false;
	}
	//Display Data list

}
