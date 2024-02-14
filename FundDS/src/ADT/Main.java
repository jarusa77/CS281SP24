package ADT;

public class Main {

	public static void main(String[] args) 
	{
		int x = 1;
		
		int []  myArray = {5,2,7,8};
		
		int [] myOtherArray = new int[5];
		
		
		ArrayClass a = new ArrayClass();
		
		if(a.addNum(100))
			System.out.println("Success");
		a.addNum(20);
		a.addNum(23);
		a.addNum(56);
		a.addNum(54);
		a.addNum(89);
		a.addNum(87);
		a.addNum(24);
		a.addNum(98);
		a.addNum(111);
		a.addNum(321);
		a.addNum(14);
		if(a.addNum(999))
			System.out.println("Success");
		else
			System.out.println("Failure");

		
		for(int i=0;  i<12;i++)
			System.out.println(a.getAtIndex(i));
		
		System.out.println("\n\n\n");
		
		LinkedList ll = new LinkedList();
		
		ll.addNode(50);
		ll.addNode(25);
		ll.addNode(22);
		ll.addNode(45);
		ll.addNode(76);
		ll.addNode(87);
		ll.addNode(99);
		ll.addNode(123);
		ll.addNode(1);
		
		if(!ll.isEmpty())
		{
			ll.reset();
			do
			{
				System.out.println( ll.getCurrentData());

			}while(ll.iterate());
		}

	}

}
