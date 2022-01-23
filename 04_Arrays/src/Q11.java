
//Write a program to find the common values between two arrays

class Q11
{
	static void common(int[] arr1, int[] arr2)
	{
		System.out.println("\nCommon elements are");
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i] == arr2[j])
					System.out.print(arr1[i] + " ");
			}
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr1 = { 2,4,6,8,10,12,14,16,18,20 };
		int[] arr2 = { 3,6,9,12,15,18,21,24,27,30 };
		System.out.println("Elements in first array");
		for(int i=0;i<arr1.length;i++)
			System.out.print(arr1[i] + " ");
		System.out.println("\nElements in second array");
		for(int i=0;i<arr2.length;i++)
			System.out.print(arr2[i] + " ");
		common(arr1, arr2);
		
	}
}