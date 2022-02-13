
public class Q05_Cls implements Q05_Int1,Q05_Int2
{
	public void method()
	{
		System.out.println("method");
	}
	
	public static void main(String args[])
	{
		Q05_Cls a = new Q05_Cls();
		a.method();
	}
}
