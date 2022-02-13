
public class Q02_Child extends Q02_Parent
{
	int a = 100;
	
	void print()
	{
		System.out.println(super.a);
	}
	
	public static void main(String args[])
	{
		Q02_Child a = new Q02_Child();
		a.print();
	}
}
