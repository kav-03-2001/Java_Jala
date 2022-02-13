
public class Q07_Cls implements Q07_Int2
{
	public void method1()
	{
		System.out.println("method1");
	}
	
	public void method2()
	{
		System.out.println("method2");
	}
	
	public static void main(String args[])
	{
		Q07_Int2 a = new Q07_Cls();
		a.method1();
		a.method2();
	}
}
