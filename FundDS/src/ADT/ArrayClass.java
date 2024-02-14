package ADT;

public class ArrayClass 
{
	private int [] container;
	
	private int count;
	
	ArrayClass()
	{
		this(10);//calls  constructor with  parameter
	}
	
	ArrayClass(int capacity)
	{
		container = new int [capacity];
		count = 0;
	}
	
	public int getAtIndex(int i)
	{
		if(i>count-1)
			return -99999;
		
		return container[i];
	}
	
	public boolean addNum(int n)
	{
				
		if(container.length<=count)
		{
			//return  false;
			int[] temp = new int[count*2];
			
			for(int i = 0; i<count;i++)
				temp[i]=container[i];
			container=temp;
		}
		
		container[count]=n;
		count++;
		
		return  true;
	}

}
