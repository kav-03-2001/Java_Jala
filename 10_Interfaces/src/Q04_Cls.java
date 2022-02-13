
public class Q04_Cls implements Q04_Int2,Q04_Int1
{
	public void int1_met1()
	{
		System.out.println("Int1-Met1");
	}
	public void int2_met1()
	{
		System.out.println("Int2-Met1");
	}
	
	public static void main(String args[])
	{
		Q04_Cls a = new Q04_Cls();
		a.int1_met1();
		a.int2_met1();
	}
}
