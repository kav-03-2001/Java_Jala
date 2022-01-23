
//Write a function to remove a specific element from an array

import java.util.*;

class Q05
{
	static int[] remove(int[] arr, int element)
	{
		int j=0, temp=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == element)
				temp++;
		}
		int[] arrNew = new int[arr.length - temp];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] != element)
			{
				arrNew[j] = arr[i];
				j++;
			}
		}
		return arrNew;
	}
	
	public static void main(String[] args)
	{
		int[] arr = { 10, 20, 30, 40, 50 };
		int remove;
		System.out.println("Elements in array are");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		Scanner in = new Scanner(System.in);
		System.out.println();
		System.out.print("Remove: ");
		remove = in.nextInt();
		int[] arrNew = remove(arr, remove);
		System.out.println("Elements in array after removing " + remove + " are");
		for(int i=0;i<arrNew.length;i++)
			System.out.print(arrNew[i] + " ");
		
	}
}
