
public class Q06_Child extends Q06_Parent
{
	int var = 2;
	Q06_Child()
	{
		System.out.println("Child Constructor");
	}
	
	void method()
	{
		int var = 1;
		System.out.println(this.var);
	}
	
	public static void main(String[] args)
	{
		Q06_Child a = new Q06_Child();
		a.method();

	}

}
