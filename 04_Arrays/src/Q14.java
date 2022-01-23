
//Write a method to find the second largest number in an array

import java.util.*;

class Q14
{
	static int secLar(int[] arr, int n)
	{
		Arrays.sort(arr);
		return arr[n-2];
	}
	
	public static void main(String[] args)
	{
		int[] arr = { 2,4,6,8,10,12,14,16,18,20, 3,6,9,12,15,18,21,24,27,30 };
		System.out.println("Array elements are");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		System.out.println("\nSecond largest element in array is " + secLar(arr,arr.length));
	}
}
