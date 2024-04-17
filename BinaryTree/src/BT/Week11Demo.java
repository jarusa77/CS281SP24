package BT;

public class Week11Demo {

	public static void main(String[] args) 
	{
		BinaryTree bt = new BinaryTree();
		
		bt.insert(15);
		bt.insert(5);
		bt.insert(20);
		bt.insert(13);
		bt.insert(7);
		bt.insert(30);
		
		bt.search(7);
		
		bt.deleteNode(13);
		
		System.out.println("Current Value: " + bt.getCurrent());

	}

}
