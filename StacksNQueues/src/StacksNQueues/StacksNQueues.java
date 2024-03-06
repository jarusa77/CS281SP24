package StacksNQueues;
public class StacksNQueues 
{

	public static void main(String[] args) 
	{
		Stack Pez = new Stack();
		
		Pez.push("Strawberry");
		Pez.push("Vanilla");
		Pez.push("Buttered Popcorn");
		Pez.push("Chocolate");
		
		display(Pez.pop());
		System.out.println(Pez.Size);
		display(Pez.pop());
		display(Pez.top());
		System.out.println(Pez.Size);
		display(Pez.top());
		
		
		System.out.println("__________________________");
		
		Queue NotPez = new Queue();
		
		NotPez.enqueue("Banana");
		NotPez.enqueue("Salted Caramel");
		NotPez.enqueue("Margarita");
		
		display(NotPez.dequeue());
		display(NotPez.dequeue());
		NotPez.enqueue("Apple");
		NotPez.enqueue("red Apple");
		NotPez.enqueue("green Apple");
		NotPez.enqueue("Rotten Apple");
		NotPez.enqueue("Granny Apple");
		
		while(NotPez.Size>0)
			display(NotPez.dequeue());

		
		
		

	}
	
	public static void display(String input)
	{
		String output ="The flavor is "+ input +"!";
		System.out.println(output);
	}

}
