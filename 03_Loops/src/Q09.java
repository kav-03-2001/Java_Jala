
//Write a program to find the prime or not.

import java.util.*;

class Q09
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int num;
		System.out.print("num = ");
		num = in.nextInt();
		
		if(num%2 == 0)
			System.out.println("Given number is a prime");
		else
			System.out.println("Given number is not a prime");
		
	}
}
