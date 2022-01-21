
//Write a program to print even number between 10 and 100 using while

class Q06
{
	public static void main(String[] args)
	{
		int num1 = 10;
		int num2 = 100;
		System.out.println("Even numbers between 10 and 100:");
		while(num1 <= num2)
		{
			if(num1%2 == 0)
				System.out.print(num1 + ", ");
			num1++;
		}
	}
}
