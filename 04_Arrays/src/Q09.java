
//Write a function to reverse an array of integer values

class Q09
{
	static int[] reverse(int[] arr)
	{
		int temp;
		for(int i=0;i<arr.length/2;i++)
		{
			temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}
		return arr;
	}
	
	public static void main(String[] args)
	{
		int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		System.out.println("Actual array");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		arr = reverse(arr);
		System.out.println("\nArray after reverse");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
	}
}
