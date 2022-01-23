
//Write a method to verify if the array contains two specified elements(12,23)

import java.util.*;

class Q17
{
	static void check(int[] arr, int c)
	{
		int temp = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(c == arr[i])
			{
				System.out.println("\nYes, the array contains " + c);
				temp = 1;
				break;
			}
		}
		if(temp == 0)
			System.out.println("No, the array doesn't contain " + c);
	}
	
	public static void main(String[] args)
	{
		int[] arr = { 2,4,6,8,10,12,14,16,18,20, 3,6,9,12,15,18,21,24,27,30 };
		System.out.println("Array elements are");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		check(arr, 12);
		check(arr, 23);
	}
}
