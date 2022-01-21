
//Program to check whether a number is EVEN or ODD using switch

import java.util.*;

class Q11
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int num;
		System.out.print("num = ");
		num = in.nextInt();
		
		switch (num % 2)
		{
		case 0:
			System.out.println("EVEN");
			break;
		case 1:
			System.out.println("ODD");
			break;
		}
	}
}
