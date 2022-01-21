
//Write a program to palindrome or not.

import java.util.*;

class Q10
{
	//method to reverse a number
	static int palindrome(int num)
	{
		int reverse = 0, temp;
		while(num != 0)
		{
			temp = num % 10;
			reverse = reverse * 10 + temp;
			num = num / 10;
		}
		return reverse;
	}
	
	public static void main(String[] args)
	{
		int num;
		Scanner in = new Scanner(System.in);
		System.out.print("num = ");
		num = in.nextInt();
		if(palindrome(num) == num)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
		
	}
}
