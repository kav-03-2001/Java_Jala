
//Write a method to find number of even number and odd numbers in an array

class Q15
{
	static void calc(int[] arr,int n)
	{
		int odd = 0;
		int even = 0;
		for(int i=0;i<n;i++)
		{
			if(arr[i] % 2 == 0)
				even++;
			else
				odd++;
		}
		System.out.println("\nnumber of even: " + even);
		System.out.println("number of odd: " + odd);
	}
	
	public static void main(String[] args)
	{
		int[] arr = { 2,4,6,8,10,12,14,16,18,20, 3,6,9,12,15,18,21,24,27,30 };
		System.out.println("Array elements are");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		calc(arr,arr.length);
		
	}
}
