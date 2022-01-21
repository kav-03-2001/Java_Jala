
//Write a program to find the two numbers equal or not.

import java.util.*;

class Q4
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int num1, num2;
		System.out.print("num1 = ");
		num1 = in.nextInt();
		System.out.print("num2 = ");
		num2 = in.nextInt();
		if(num1 == num2)
			System.out.println("Two numbers are equal");
		else if(num1 != num2)
			System.out.println("Two numbers are not equal");
	}

}
