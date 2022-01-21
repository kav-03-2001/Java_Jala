
//Print the smaller and larger number

import java.util.Scanner;

class Q7
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int num1, num2;
		System.out.print("num1 = ");
		num1 = in.nextInt();
		System.out.print("num2 = ");
		num2 = in.nextInt();
		
		if(num1 < num2)
		{
			System.out.println("Smaller number is " + num1);
			System.out.println("Larger number is " + num2);
		}
		else if(num1 > num2)
		{
			System.out.println("Smaller number is " + num2);
			System.out.println("Larger number is " + num1);
		}
		else
		{
			System.out.println("Two numbers are equal");
		}
	}

}