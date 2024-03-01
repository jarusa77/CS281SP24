package recursive;
public class Main {

	public static void main(String[] args) 
	{
		int i = factorial(4);
		
		System.out.println(i);

	}
	
	
	static public int factorial(int x)
	{
		
		if(x==0)
			return 1;
		
		int out = x * factorial(x-1);
		System.out.println(out);
		return out;
		
		
	}

}
