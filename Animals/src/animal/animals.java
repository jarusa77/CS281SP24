package animal;
public class animals 
{
	public static void main(String[] args) 
	{
	
	
	
	arachnids  Spider = new arachnids("Spider");
	
	insects cricket=new insects("cricket");
	
	System.out.println(cricket.getName());
	
	Arthropods [] list= {Spider,cricket};  
	
	System.out.println(list[1].getName());
	}
}
