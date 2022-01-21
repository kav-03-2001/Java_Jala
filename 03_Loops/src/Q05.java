
//Write a program to print largest number among three numbers.

import java.util.*;

class Q05
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int num1, num2, num3;
		System.out.print("num1 = ");
		num1 = in.nextInt();
		System.out.print("num2 = ");
		num2 = in.nextInt();
		System.out.print("num3 = ");
		num3 = in.nextInt();
		
		if((num1 > num2) && (num1 > num3))
			System.out.println("Largest number is " + num1);
		else if((num2 > num3) && (num2 > num1))
			System.out.println("Largest number is " + num2);
		else
			System.out.println("Largest number is " + num3);
	}
}
