
//Write a function to find the duplicate values of an array

class Q10
{
	static void duplicate(int[] arr)
	{
		System.out.println("\nDuplicate elements are");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
					System.out.print(arr[i] + " ");
			}
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr = { 2,4,6,8,10,12,14,16,18,20, 3,6,9,12,15,18,21,24,27,30 };
		System.out.println("Elements in array");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		duplicate(arr);
		
	}
}
