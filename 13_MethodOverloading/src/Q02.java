
//Write two methods with the same name but different number of parameters of different data type and call the methods from main method

public class Q02
{
	int method(int a,int b)
	{
		return a+b;
	}
	
	float method(int a,int b,int c)
	{
		return a+b+c;
	}
	
	public static void main(String[] args)
	{
		Q02 obj = new Q02();
		int a = obj.method(5, 10);
		float b = obj.method(5, 10, 15);
		System.out.println(a + " " + b);
	}
}
