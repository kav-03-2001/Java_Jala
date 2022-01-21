
//Write a function for arithmetic operators(+,-,*,/)

import java.util.*;

class Q1
{
	static int addition(int num1, int num2)
	{
		return num1 + num2;
	}
	
	static int subtraction(int num1, int num2)
	{
		return num2 - num1;
	}
	
	static int multiplication(int num1, int num2)
	{
		return num1 * num2;
	}
	
	static int division(int num1, int num2)
	{
		return num2 / num1;
	}
	
	public static void main(String[] args)
	{
		int num1, num2;
		Scanner in = new Scanner(System.in);
		System.out.print("num1 = ");
		num1 = in.nextInt();
		System.out.print("num2 = ");
		num2 = in.nextInt();
		
		System.out.println("Addition (" + num1 + " + " + num2 + ") = " + addition(num1, num2));
		System.out.println("Subtraction (" + num2 + " - " + num1 + ") = " + subtraction(num1, num2));
		System.out.println("Multiplication (" + num1 + " * " + num2 + ") = " + multiplication(num1, num2));
		System.out.println("Division (" + num2 + " / " + num1 + ") = " + division(num1, num2));
		
	}

}
