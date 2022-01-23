
//Write a function to insert an element at a specific position in the array

import java.util.*;

class Q07
{
	static int[] insert(int[] arr, int n, int p)
	{
		int newarr[] = new int[arr.length + 1];
		int i;
		for(i=0;i<arr.length+1;i++)
		{
			if (i < p-1)
                newarr[i] = arr[i];
            else if (i == p - 1)
                newarr[i] = n;
            else
                newarr[i] = arr[i - 1];
		}
		return newarr;
	}
	
	public static void main(String[] args)
	{
		int[] arr1 = { 10, 20, 30, 40, 50 };
		int i, n, p;
		Scanner in = new Scanner(System.in);
		System.out.println("Elements before insertion are");
		for(i=0;i<arr1.length;i++)
			System.out.print(arr1[i] + " ");
		System.out.print("\nInsert element: ");
		n = in.nextInt();
		System.out.print("Insert element position: ");
		p = in.nextInt();
		arr1 = insert(arr1, n, p);
		for(i=0;i<arr1.length;i++)
			System.out.print(arr1[i] + " ");
	}
}
