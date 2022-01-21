
//Write a method for increment and decrement operators(++, --)

import java.util.*;

class Q2
{
	static int increment(int a)
	{
		return a+1;
	}
	
	static int decrement(int a)
	{
		return a-1;
	}
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int num;
		System.out.print("num = ");
		num = in.nextInt();
		System.out.println("value of num after increment: " + increment(num));
		System.out.println("value of num after decrement: " + decrement(num));
	}

}
