
public class Q03 
{
	Q03()
	{
		System.out.println("constructor");
	}
	
	Q03(int x)
	{
		this();
		System.out.println("par constructor");
	}
	
	public static void main(String[] args) 
	{
		Q03 a = new Q03(6);

	}

}
