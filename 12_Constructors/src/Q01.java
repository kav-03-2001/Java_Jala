
public class Q01
{
	Q01()
	{
		System.out.println("Default Constructor");
	}
	Q01(int x)
	{
		System.out.println("1 Arg Constructor");
	}
	Q01(int x, int y)
	{
		System.out.println("2 Arg Constructor");
	}
	
	public static void main(String args[])
	{
		Q01 a = new Q01();
		Q01 b = new Q01(1);
		Q01 c = new Q01(1,2);
	}
}
