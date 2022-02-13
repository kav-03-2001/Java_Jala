
public class Q04 
{
	Q04()
	{
		this(6);
		System.out.println("constructor");
		
	}
	
	Q04(int x)
	{
		
		System.out.println("par constructor");
	}
	
	public static void main(String[] args) 
	{
		Q04 a = new Q04();

	}
}
