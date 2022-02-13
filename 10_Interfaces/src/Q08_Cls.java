
public class Q08_Cls implements Q08_Int
{
	public void method()
	{
		System.out.println("method");
	}
	
	public static void main(String args[])
	{
		
		Q08_Int a = new Q08_Cls();
		a.method();
		System.out.println(a.var);
	}
}
