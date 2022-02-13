
//Write two methods with the same name but different number of parameters of same type and call the methods from main method

public class Q01
{
	int method(int a,int b)
	{
		return a+b;
	}
	
	int method(int a,int b,int c)
	{
		return a+b+c;
	}
	
	public static void main(String[] args)
	{
		Q01 obj = new Q01();
		int a = obj.method(5, 10);
		int b = obj.method(5, 10, 15);
		System.out.println(a + " " + b);
	}

}
