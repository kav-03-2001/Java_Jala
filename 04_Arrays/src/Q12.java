
//Write a method to remove duplicate elements from an array

import java.util.*;

class Q12
{
	static void duplicate(int[] arr, int n)
	{
		 Arrays.sort(arr);
	     int j = 0;
	     for (int i = 0; i < n - 1; i++)
	     {
	            if (arr[i] != arr[i + 1]) 
	                arr[j++] = arr[i];
	     }
	     arr[j++] = arr[n - 1];
	     System.out.println("\nArray after removing duplicates");
	     for (int i = 0; i < j; i++)
	     {
	    	 System.out.print(arr[i] + " ");
	     }
	}
	
	public static void main(String[] args)
	{
		int[] arr = { 2,4,6,8,10,12,14,16,18,20, 3,6,9,12,15,18,21,24,27,30 };
		System.out.println("Actual array");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		duplicate(arr,arr.length);
	}
}