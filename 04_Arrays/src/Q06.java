
//Write a function to copy an array to another array

class Q06
{
	static int[] arrCopy(int[] arr)
	{
		return arr;
	}
	
	public static void main(String[] args)
	{
		int[] arr1 = { 10, 20, 30, 40, 50 };
		int[] arr2 = arrCopy(arr1);
		int i;
		System.out.println("Elements in arr1 are");
		for(i=0;i<arr1.length;i++)
			System.out.print(arr1[i] + " ");
		System.out.println("\nElements in arr2 are");
		for(i=0;i<arr2.length;i++)
			System.out.print(arr2[i] + " ");
		
	}
}
