
//Write a program to print the odd and even numbers.

import java.util.*;

class Q04
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int num1, num2, i;
		System.out.print("num1 = ");
		num1 = in.nextInt();
		System.out.print("num2 = ");
		num2 = in.nextInt();
		
		System.out.println("Odd numbers between " + num1 + " and " + num2 + " are:");
		for(i=num1+1;i<num2;i++)
		{
			if(i%2 != 0)
				System.out.println(i);
		}
		
		System.out.println("Even numbers between " + num1 + " and " + num2 + " are:");
		for(i=num1+1;i<num2;i++)
		{
			if(i%2 == 0)
				System.out.println(i);
		}
	}
}
