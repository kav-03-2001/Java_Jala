
//Write a function to get the difference of largest and smallest value

import java.util.*;

class Q16
{
	static int diff(int[] arr)
	{
		Arrays.sort(arr);
		return arr[arr.length-1] - arr[0];
	}
	
	public static void main(String[] args)
	{
		int[] arr = { 2,4,6,8,10,12,14,16,18,20, 3,6,9,12,15,18,21,24,27,30 };
		System.out.println("Array elements are");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		System.out.println("\nDifference b/w largest and smallest value is " + diff(arr));
		
	}
}
